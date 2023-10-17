package javaprogrammes;

public class Programme2 {

    /* Declare two static variables
     *Declare one static method
     *Call both static variables into the static method inside the print statement.
     *Declare the Main method.
     *Call the static method into the Main method and Run the programme.
     */

    //Declare two static variables
    static int a = 10;
    static String name = "Test";

    //Declare one static method
    //Call both static variables into the static method inside the print statement
    public static void myMethod() {
        System.out.println(a);
        System.out.println(name);
    }

    //Declare the Main method
    //Call the static method into the main method
    public static void main(String[] args) {
        myMethod();
    }
}
