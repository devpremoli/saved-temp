// File: src/app/models/classes/Cart.ts
import { ICart } from '../interface/ICart';
import { IProduct } from '../interface/IProduct';

export class Cart implements ICart {
  cartId: number;
  totalPrice: number;
  products: IProduct[];

  constructor(cartId: number, totalPrice: number, products: IProduct[]) {
    this.cartId = cartId;
    this.totalPrice = totalPrice;
    this.products = products;
  }

  calculateTotal(): number {
    this.totalPrice = this.products.reduce(
      (total, product) => total + product.specialPrice * product.quantity,
      0
    );
    return this.totalPrice;
  }
}
