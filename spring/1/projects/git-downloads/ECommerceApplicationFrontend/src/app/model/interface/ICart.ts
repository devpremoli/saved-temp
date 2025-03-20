import { IProduct } from "./IProduct";

export interface ICart {
    cartId: number;
    totalPrice: number;
    products: IProduct[];
}