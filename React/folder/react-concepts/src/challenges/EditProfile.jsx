// https://react.dev/learn/reacting-to-input-with-state

import { useState } from "react";

function EditProfile() {
  const [firstName, setFirstName] = useState("Prem");
  const [lastName, setLastName] = useState("Oli");
  const [isEditing, setIsEditing] = useState(false);
  return (
    <>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          setIsEditing(!isEditing);
        }}
      >
        <div>
          <label>First name: </label>
          {isEditing ? (
            <input
              value={firstName}
              onChange={(e) => {
                setFirstName(e.target.value);
              }}
            />
          ) : (
            <b>{firstName}</b>
          )}
        </div>
        <div>
          <label>Last name: </label>
          {isEditing ? (
            <input
              value={lastName}
              onChange={(e) => {
                setLastName(e.target.value);
              }}
            />
          ) : (
            <b>{lastName}</b>
          )}
        </div>
        <div>
          <button type="submit">{isEditing ? "Save" : "Edit"} Profile</button>
        </div>
        <p>
          <i>
            Hello, {firstName} {lastName}!
          </i>
        </p>
      </form>
    </>
  );
}
export default EditProfile;
