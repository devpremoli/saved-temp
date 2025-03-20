import ChildChildA from "./ChildChildA";
import ChildChildB from "./ChildChildB";

interface childProps {
}

const Child = ({}: childProps) => {
  return (
    <div>
      <ChildChildA />
      <ChildChildB />
    </div>
  );
};
export default Child;
