const jsonServer = require('json-server');
const server = jsonServer.create();
const router = jsonServer.router('db.json');
const middlewares = jsonServer.defaults();

server.use(middlewares);
server.use(jsonServer.bodyParser);

// Middleware for AddUpdateClient
server.post('/AddUpdateClient', (req, res) => {
  const db = router.db; // Access to lowdb instance
  const clientsData = db.get('GetAllClients').value();

  if (!clientsData || !clientsData.data) {
    return res.status(400).json({ result: false, message: "GetAllClients.data not found" });
  }

  const newClient = req.body;

  if (!newClient.clientId) {
    // Generate a new unique ID if not provided
    newClient.clientId = Date.now();
  }

  // Add or update the client
  const existingIndex = clientsData.data.findIndex(client => client.clientId === newClient.clientId);
  if (existingIndex !== -1) {
    // Update existing client
    clientsData.data[existingIndex] = newClient;
  } else {
    // Add new client
    clientsData.data.push(newClient);
  }

  db.get('GetAllClients').assign({ data: clientsData.data }).write(); // Save changes

  res.status(200).json({
    result: true,
    message: "Client added/updated successfully",
    data: newClient
  });
});

// Start JSON Server
server.use(router);
server.listen(3000, () => {
  console.log('JSON Server is running on http://localhost:3000');
});
