import { useState } from "react";
import Child from "./Child";
import { MyContext } from "./context";

export interface User {
  firstName: String;
  lastName: String;
}

interface parentProps {}

const Parent = ({}: parentProps) => {
  const [user] = useState<User>({
    firstName: "Prem",
    lastName: "Oli",
  });

  return (
    <div>
      <MyContext.Provider value={user}>
        <Child />
      </MyContext.Provider>
    </div>
  );
};
export default Parent;
