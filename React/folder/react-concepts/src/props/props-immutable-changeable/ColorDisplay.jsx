// Child Component: Displays the selected color
function ColorDisplay({ color }) {
  return (
    <div style={{ padding: "20px", backgroundColor: color, color: "#fff" }}>
      Selected Color: {color}
    </div>
  );
}
export default ColorDisplay;
