// File: src/app/models/classes/Product.ts
import { IProduct } from '../interface/IProduct';

export class Product implements IProduct {
  productId: number;
  productName: string;
  image: string;
  description: string;
  quantity: number;
  price: number;
  discount: number;
  specialPrice: number;

  constructor(
    productId: number,
    productName: string,
    image: string,
    description: string,
    quantity: number,
    price: number,
    discount: number,
    specialPrice: number
  ) {
    this.productId = productId;
    this.productName = productName;
    this.image = image;
    this.description = description;
    this.quantity = quantity;
    this.price = price;
    this.discount = discount;
    this.specialPrice = specialPrice;
  }

  applyDiscount(): void {
    this.specialPrice = this.price - this.price * (this.discount / 100);
  }
}
