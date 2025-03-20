package datatypes.objectclass.methods.clone;

class Address {
    String streetAddress;
    String city;
    int zipCode;

    public Address(String streetAddress, String city, int zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: " + streetAddress + " "+ city + " " + zipCode;
    }
}

public class Employee implements Cloneable {

    String name;
    int salary;
    Address address;

    public Employee(String name, Address address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }


    @Override
    protected Employee clone() throws CloneNotSupportedException{

        Employee cloned = (Employee) super.clone(); // shallow copy

        // deep copy for Address object
        cloned.address = new Address(this.address.streetAddress, this.address.city, this.address.zipCode);

        return cloned;
    }

    @Override
    public String toString() {
        return "Employee= " + "name: " + name + " " + address + " salary: " + salary;
    }



    public static void main(String[] args) {

        try {

            Address address = new Address("607 Kennedy St NW", "Washington", 20011);
            Employee originalEmployee = new Employee("Prem", address, 100);

            Employee copiedEmployee = originalEmployee.clone();

            originalEmployee.address.city = "changed";
            originalEmployee.name = "changed"; // reference to new String Object 
            originalEmployee.salary = 1;

            System.out.println(copiedEmployee);

        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }
    }
}
