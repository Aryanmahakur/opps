// class getset {
//     // Private fields (Encapsulation)
//     private int id;
//     private String name;
//     private double salary;

//     // Constructor
//     public getset(int id, String name, double salary) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }

//     // Getter for id
//     public int getId() {
//         return id;
//     }

//     // Setter for id
//     public void setId(int id) {
//         this.id = id;
//     }

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for salary
//     public double getSalary() {
//         return salary;
//     }

//     // Setter for salary
//     public void setSalary(double salary) {
//         if (salary > 0) { // Ensuring valid salary
//             this.salary = salary;
//         } else {
//             System.out.println("Salary must be positive!");
//         }
//     }

//     // Method to display employee details
//     public void displayEmployee() {
//         System.out.println("Employee ID: " + id);
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee Salary: $" + salary);
//     }

//     // Main method to test getter and setter methods
//     public static void main(String[] args) {
//         // Creating an Employee object
//         getset emp1 = new getset(101, "John Doe", 50000);
        
//         // Displaying initial details
//         emp1.displayEmployee();
        
//         // Modifying values using setters
//         emp1.setName("Alice Smith");
//         emp1.setSalary(60000);
        
//         // Getting values using getters
//         System.out.println("\nUpdated Employee Details:");
//         System.out.println("ID: " + emp1.getId());
//         System.out.println("Name: " + emp1.getName());
//         System.out.println("Salary: $" + emp1.getSalary());
//     }
// }
