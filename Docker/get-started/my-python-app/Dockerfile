# Step 1: Use a base image with Python installed
FROM python:3.9-slim

# Step 2: Set the working directory inside the container
WORKDIR /usr/src/app

# Step 3: Copy the requirements file and install the dependencies
COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt

# Step 4: Copy the rest of the application code
COPY . .

# Step 5: Expose the port that Flask will run on (port 5000)
EXPOSE 5000

# Step 6: Define the command to run the app
CMD ["python", "app.py"]