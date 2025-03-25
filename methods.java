class methods{
     void greet(){
        System.out.println("hello");
    }
    void sum(int a, int b){
         int result = a + b;
        System.out.println("Sum: " + result);
    }
     static void displayMessage() {  // Static method
        System.out.println("This is a static method.");
    }
    public static void main(String[] args) {
          displayMessage();
        methods obj = new methods();
        obj.greet();
        obj.sum(5,5);
    }


}