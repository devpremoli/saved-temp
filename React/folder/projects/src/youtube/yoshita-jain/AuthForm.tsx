import "./AuthForm.css";

import { useState } from "react";

function AuthForm() {
  const [isLogin, setIsLogin] = useState<boolean>();

  //handleClick;

  return (
    <div className="container">
      <div className="form-conainer">
        <div className="form-toggle">
          <button
            className={isLogin ? "active" : ""}
            onClick={() => setIsLogin(true)}
          >
            Login
          </button>
          <button
            className={!isLogin ? "active" : ""}
            onClick={() => setIsLogin(false)}
          >
            SignUp
          </button>
        </div>
        {isLogin ? (
          <>
            <div className="form">
              <h2>Login Form</h2>
              <input type="email" placeholder="Email" />
              <input type="password" placeholder="Password" />
              <a href="#">forget password</a>
              <button>Login</button>
              <p>
                Not a member?{" "}
                <a href="#" onClick={() => setIsLogin(false)}>
                  SignUp Now
                </a>
              </p>
            </div>
          </>
        ) : (
          <div className="form">
            <h2>Signup Form</h2>
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" />
            <input type="password" placeholder="Confirm Password" />
            <button>SignUp</button>
          </div>
        )}
      </div>
    </div>
  );
}
export default AuthForm;
