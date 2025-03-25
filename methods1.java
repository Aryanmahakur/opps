


class methods1 {
    int rollno;
    int marks;
    String name;

 public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    // // Constructor to initialize student details
    // methods1(int rollno, int marks, String name) {
    //     this.rollno = rollno;
    //     this.marks = marks;
    //     this.name = name;
    // }

    // // Method to display student details
     void displaydata() {
         System.out.println("Roll No: " + rollno);
        
         System.out.println("Name: " + name);
     }

    public static void main(String[] args) {
        // Creating a Student object
        methods1 obj = new methods1();
        obj.setName("aryan");
        obj.setRollno(1234);
        obj.displaydata();
        
    }
}
