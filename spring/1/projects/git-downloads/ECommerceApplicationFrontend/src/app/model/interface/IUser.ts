import { IRole } from "./IRole";
import { IAddress } from "./IAddress";
import { ICart } from "./ICart";

export interface IUser {
    userId: number;
    firstName: string;
    lastName: string;
    mobileNumber: string;
    email: string;
    password: string;
    roles: IRole[];
    addresses: IAddress;
    cart: ICart;
}