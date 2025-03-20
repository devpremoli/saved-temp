import ColorDisplay from "./ColorDisplay.jsx";
import React, { useState } from "react";

// Parent Component: Manages state and passes it as props
function ColorPicker() {
  const [selectedColor, setSelectedColor] = useState("blue");

  const handleColorChange = (color) => {
    setSelectedColor(color); // Update state
  };

  return (
    <div>
      <h1>Pick a Color</h1>
      <button onClick={() => handleColorChange("red")}>Red</button>
      <button onClick={() => handleColorChange("green")}>Green</button>
      <button onClick={() => handleColorChange("blue")}>Blue</button>

      {/* Pass selectedColor as a prop */}
      <ColorDisplay color={selectedColor} />
    </div>
  );
}

export default ColorPicker;
