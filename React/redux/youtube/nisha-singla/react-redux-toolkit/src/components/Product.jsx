import { useEffect, useState } from "react";

const Product = () => {
  const [products, setProducts] = useState([]);
  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then((data) => data.json())
      .then((response) => setProducts(response));
  }, []);
  return (
    <>
      <h1>Products</h1>
      {JSON.stringify(products)}
    </>
  );
};

export default Product;
