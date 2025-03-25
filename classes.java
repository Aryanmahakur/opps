class classes{
     void sayhello(){
         System.out.println("Hello, welcome to Java!");
     }
     static void showMessage() {
        System.out.println("This is a static method.");
    }
          public static void main(String[] args) {
            showMessage();

        // Creating an object to call the instance method
        classes obj = new classes();
        obj.sayhello();
     }
}
class Employee {
    // Instance variables
    int id;
    String name;
    int salary;

    // Constructor to initialize Employee object
    Employee(int empId, String empName, int empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    // Method to get salary (with System.out.println)
    int getSalary() {
        System.out.println("Returning salary: " + salary);
        return salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + getSalary()); // Calls getSalary()
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "John Doe", 50000);
        
        // Displaying employee details
        emp1.display();
    }
}
