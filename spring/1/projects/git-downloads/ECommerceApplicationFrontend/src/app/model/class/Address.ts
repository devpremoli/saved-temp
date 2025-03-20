import { IAddress } from '../interface/IAddress';

export class Address implements IAddress {
  addressId: number;
  street: string;
  buildingName: string;
  city: string;
  state: string;
  country: string;
  pincode: string;

  constructor(
    addressId: number,
    street: string,
    buildingName: string,
    city: string,
    state: string,
    country: string,
    pincode: string
  ) {
    this.addressId = addressId;
    this.street = street;
    this.buildingName = buildingName;
    this.city = city;
    this.state = state;
    this.country = country;
    this.pincode = pincode;
  }
}
