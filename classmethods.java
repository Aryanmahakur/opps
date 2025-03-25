
class  classmethods {
    // Instance variables
    int id;
    String name;
    int salary;

    // Constructor to initialize Employee object
     classmethods(int empId, String empName, int empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    // Method to get salary (with System.out.println)
    int getSalary() {
        System.out.println("Returning salary: " + salary);
        return salary;
    }
    String getname(){
        System.out.println(name);
        return name;
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
         classmethods emp1 = new  classmethods(101, "John Doe", 50000);
        
        // Displaying employee details
        emp1.display();
        emp1.getname();
    }
}
