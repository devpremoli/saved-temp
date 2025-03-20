import { customUseContext } from "./context";

interface sidebarProps {
}

const ChildChildA = ({}: sidebarProps) => {
  const user = customUseContext();
  return (
    <div>
      <div>{user.firstName}</div>
    </div>
  )
}

export default ChildChildA;