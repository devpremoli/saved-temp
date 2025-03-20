import { LevelContext } from "./LevelContext.jsx";
import { useContext } from "react";

function Section({ children }) {
  const level = useContext(LevelContext);
  return (
    <section className="section">
      <LevelContext.Provider value={level + 1}>
        {children}
      </LevelContext.Provider>
    </section>
  );
}
export default Section;
