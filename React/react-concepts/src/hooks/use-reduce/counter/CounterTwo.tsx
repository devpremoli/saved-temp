import { useReducer } from "react";

interface State {
  firstCounter: number;
  secondCounter: number;
}

interface Action {
  type: string;
  value: number;
}

const intialState: State = {
  firstCounter: 0,
  secondCounter: 10,
};

const reducer = (state: State, action: Action) => {
  switch (action.type) {
    case "incrementFirst":
      return { ...state, firstCounter: state.firstCounter + action.value };
    case "decrementFirst":
      return { ...state, firstCounter: state.firstCounter - action.value };
    case "resetFirst":
      return { ...state, firstCounter: intialState.firstCounter };
    case "incrementSecond":
      return { ...state, secondCounter: state.secondCounter + action.value };
    case "decrementSecond":
      return { ...state, secondCounter: state.secondCounter - action.value };
    case "resetSecond":
      return { ...state, secondCounter: intialState.secondCounter };

    default:
      return state;
  }
};

function CounterTwo() {
  const [count, dispatch] = useReducer(reducer, intialState);
  return (
    <>
      <h1>CounterTwo</h1>
      <h2>firstCounter - {count.firstCounter}</h2>
      <div>
        <button onClick={() => dispatch({ type: "incrementFirst", value: 1 })}>
          Increment First
        </button>
        <button onClick={() => dispatch({ type: "decrementFirst", value: 1 })}>
          Decrement First
        </button>
        <button onClick={() => dispatch({ type: "resetFirst", value: 0 })}>
          Reset First
        </button>
        <button onClick={() => dispatch({ type: "incrementFirst", value: 5 })}>
          Increment First 5
        </button>
        <button onClick={() => dispatch({ type: "decrementFirst", value: 5 })}>
          Decrement First 5
        </button>
      </div>

      <h2>secondCounter - {count.secondCounter}</h2>
      <div>
        <button onClick={() => dispatch({ type: "incrementSecond", value: 1 })}>
          Increment Second
        </button>
        <button onClick={() => dispatch({ type: "decrementSecond", value: 1 })}>
          Decrement Second
        </button>
        <button onClick={() => dispatch({ type: "resetSecond", value: 0 })}>
          Reset Second
        </button>
        <button onClick={() => dispatch({ type: "incrementSecond", value: 5 })}>
          Increment 5
        </button>
        <button onClick={() => dispatch({ type: "decrementSecond", value: 5 })}>
          Decrement 5
        </button>
      </div>
    </>
  );
}
export default CounterTwo;
