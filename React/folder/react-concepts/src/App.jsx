import Parent from "./props/Parent.jsx";
import Profile from "./props/spread-syntax/Profile.jsx";
import ChildrenChild from "./props/children/ChildrenChild.jsx";
import ChildrenParent from "./props/children/ChildrenParent.jsx";
import ColorPicker from "./props/props-immutable-changeable/ColorPicker.jsx";
import Accordian from "./props/lifting-state-up/Accordian.jsx";
import Panel from "./props/lifting-state-up/Panel.jsx";

import ThemeProvider from "./use-context/theme-example/ThemeProvider.jsx";
import ThemeToggler from "./use-context/theme-example/ThemeToggler.jsx";
import Heading from "./use-context/section-heading-example/Heading.jsx";
import Section from "./use-context/section-heading-example/Section.jsx";

import Challenges from "./challenges/Challenges.jsx";

function App() {
  return (
    <>
      <h1>App</h1>

      {/* <Parent />
      <Profile />
      <ChildrenParent>
        <ChildrenChild></ChildrenChild>
      </ChildrenParent>
      <ColorPicker />
      <Accordian /> */}

      {/* <ThemeProvider>
        <h1>useContext Example</h1>
        <ThemeToggler />
      </ThemeProvider>

      <Section>
        <Heading>Title</Heading>
        <Section>
          <Heading>Heading</Heading>
          <Heading>Heading</Heading>
          <Heading>Heading</Heading>
          <Section>
            <Heading>Sub-heading</Heading>
            <Heading>Sub-heading</Heading>
            <Heading>Sub-heading</Heading>
            <Section>
              <Heading>Sub-sub-heading</Heading>
              <Heading>Sub-sub-heading</Heading>
              <Heading>Sub-sub-heading</Heading>
            </Section>
          </Section>
        </Section>
      </Section> */}

      <Challenges />
    </>
  );
}
export default App;
