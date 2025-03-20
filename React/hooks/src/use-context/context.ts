import { createContext, useContext } from "react";
import { User } from "./Parent";

export const MyContext = createContext<User | undefined>(undefined);

export function customUseContext () {
    const user = useContext(MyContext);

    if (user === undefined) {
        throw new Error("Error Occured for ChildChildA");
    }
    return user;
}