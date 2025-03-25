// class animals{
//     void makesound(){
//         System.out.println("animal making a sound");
//     }
        
//     }
//     class dog extends animals{

//         @Override
//         void makesound() {
//              System.out.println("dog making a sound");
//         }
//     }
//     public class animal{
//     public static void main(String[] args) {
//         animals myanimal= new animals();
//         myanimal.makesound();
//         dog mydog=new dog();
//         mydog.makesound();
//     }
// }
// Parent class (Superclass)
class Vehicle {
    String name;
    int num;
    int year;

    // Constructor
    Vehicle(String name, int num, int year) {
        this.name = name;
        this.num = num;
        this.year = year;
    }

    // Display method
    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Number: " + num);
        System.out.println("Year: " + year);
    }
}

// Child class (Subclass)
class Car extends Vehicle {
    String company; // Declare company variable

    // Constructor
    Car(String name, int num, int year, String company) {
        super(name, num, year); // Call parent class constructor
        this.company = company;
    }

    // Overriding display method
    void display() {
        super.display(); // Call parent class display method
        System.out.println("Company: " + company);
    }
}

// Main class
public class animal {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle("City", 1, 2023);
        obj.display(); // Call display method for Vehicle

        System.out.println("------------");

        Car objj = new Car("City", 2, 2023, "Honda");
        objj.display(); // Call overridden display method for Car
    }
}
