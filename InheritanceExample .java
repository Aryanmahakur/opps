// Parent class (Super Class)
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

// Child class (Subclass) that inherits from Employee
class Manager extends Employee {
    String department;

    // Constructor (uses super to call parent constructor)
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // Calls Employee constructor
        this.department = department;
    }

    // Method to display manager details
    public void displayManager() {
        displayEmployee(); // Call parent class method
        System.out.println("Manager Department: " + department);
    }
}

// Main class to test Inheritan 
public class InheritanceExample{
    public static void main(String[] args) {
        // Creating an object of Manager (child class)
        Manager mgr = new Manager("Alice Smith", 201, 75000, "IT");

        // Displaying manager details (using inherited and own methods)
        mgr.displayManager();
    }
}
