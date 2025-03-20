import Avatar from "./Avatar.jsx";
import Card from "./Card.jsx";
function Profile() {
  const person = {
    name: "Jane Doe",
    imageUrl: "https://via.placeholder.com/150",
  };
  return (
    <>
      <Card person={person} size="150px" isSepia={true} thickBorder={true} />
    </>
  );
}
export default Profile;
