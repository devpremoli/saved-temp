// Child Component that Consumes the Theme
import { ThemeContext } from "./ThemeProvider.jsx";
import React, { useContext } from "react";

function ThemeToggler() {
  const { theme, toggleTheme } = useContext(ThemeContext);

  return (
    <div
      style={{
        padding: "20px",
        background: theme === "light" ? "#fff" : "#333",
        color: theme === "light" ? "#000" : "#fff",
      }}
    >
      <p>Current Theme: {theme}</p>
      <button onClick={toggleTheme}>Toggle Theme</button>
    </div>
  );
}
export default ThemeToggler;
