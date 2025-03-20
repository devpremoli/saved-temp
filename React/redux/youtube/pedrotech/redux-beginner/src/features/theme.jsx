import { createSlice } from "@reduxjs/toolkit";

const initialStateValue = "";
//const initialStateValue = { name: null, age: null, email: null };

export const themeSlice = createSlice({
  name: "theme",
  initialState: { value: initialStateValue },
  reducers: {
    changeColor: (state, action) => {
        state.value = action.payload
    }
  },
});
export const { changeColor } = themeSlice.actions;
export default themeSlice.reducer;