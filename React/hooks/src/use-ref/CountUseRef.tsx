import { useEffect, useRef } from "react";

function CountUseRef() {
  let countRef = useRef<number>(0);
  

  useEffect(() => {
    console.log("CountUseRef rendered");
  });

  return (
    <>
      <h1>CountUseRef</h1>
      <button
        onClick={() => {
          // Unlike useState, no re-render
          countRef.current++;
          console.log(countRef);
        }}
      >
        Count: {countRef.current}
      </button>
    </>
  );
}

export default CountUseRef;