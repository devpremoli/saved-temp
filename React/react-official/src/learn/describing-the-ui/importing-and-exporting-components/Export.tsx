function DefaultExport() {
  return <button>DefaultExport</button>;
}
export default DefaultExport;

/*
A module cannot have multiple default exports.ts(2528)
DefaultExport.jsx(4, 16): The first export default is here.
*/
// function AnotherDefaultExport() {
//   return <button>AnotherDefaultExport</button>;
// }
// export default AnotherDefaultExport;

function NamedExport() {
  return <button>NamedExport</button>;
}
export { NamedExport }; // Named export
