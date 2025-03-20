import { useDispatch } from "react-redux";
import { login, logout } from "../features/user";

function Login() {
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Login Page</h1>
      <button
        onClick={() =>
          dispatch(
            login({ name: "Prem Oli", age: 25, email: "premoli@gmail.com" })
          )
        }
      >
        Login
      </button>
      <button onClick={() => 
        dispatch(logout())
      }>
        Log out
      </button>
    </div>
  );
}

export default Login;
