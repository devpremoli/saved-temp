function Avatar({ person, size, isSepia, thickBorder }) {
  const styles = {
    width: size,
    height: size,
    borderRadius: "50%",
    border: thickBorder ? "5px solid black" : "1px solid gray",
    filter: isSepia ? "sepia(1)" : "none",
  };

  return <img src={person.imageUrl} alt={person.name} style={styles} />;
}
export default Avatar;
