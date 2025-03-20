import { IRole } from "../interface/IRole";
import { IAddress } from "../interface/IAddress";
import { ICart } from "../interface/ICart";

export class User {
    userId: number;
    firstName: string;
    lastName: string;
    mobileNumber: string;
    email: string;
    password: string;
    roles: IRole[];
    addresses: IAddress;
    cart: ICart;
  
    constructor(
      userId: number,
      firstName: string,
      lastName: string,
      mobileNumber: string,
      email: string,
      password: string,
      roles: IRole[],
      addresses: IAddress,
      cart: ICart
    ) {
      this.userId = userId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.mobileNumber = mobileNumber;
      this.email = email;
      this.password = password;
      this.roles = roles;
      this.addresses = addresses;
      this.cart = cart;
    }
}