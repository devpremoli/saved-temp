import { MyContext } from "./context";

interface sidebarProps {}

const ChildChildB = ({}: sidebarProps) => {
  return (
    <div>
      {/* MyContext.Consumer expects a function as a child that takes the context value as a parameter and 
      returns a ReactNode. */}
      <MyContext.Consumer>
        {(value) => {
          if (!value) {
            throw new Error("Error Occured for ChildChildA");
          }
          return (
            <div>
              <div>{value.firstName}</div>
              <div>{value.lastName}</div>
            </div>
          );
        }}
      </MyContext.Consumer>
    </div>
  );
};

export default ChildChildB;
