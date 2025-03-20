import { useState } from "react";
import { useDispatch } from "react-redux";
import { changeColor } from "../features/theme";

function ChangeColor() {
  const dispatch = useDispatch();
  const [color, setColor] = useState();
  return (
    <div>
      <input
        type="text"
        placeholder="red"
        onChange={(event) => {
          setColor(event.target.value);
        }}
      />
      <button onClick={() => dispatch(changeColor(color))}>Change Color</button>
    </div>
  );
}

export default ChangeColor;
