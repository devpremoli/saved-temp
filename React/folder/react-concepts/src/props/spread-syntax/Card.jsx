import Avatar from "./Avatar.jsx";
function Card(props) {
  // Forward all props to Avatar
  return (
    <>
      <div className="card">
        <Avatar {...props} />
        <h2>{props.person.name}</h2>
      </div>
    </>
  );
}
export default Card;
