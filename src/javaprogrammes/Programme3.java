package javaprogrammes;

public class Programme3 {
    /*  Declare one instance and one static variable.
 Declare one instance method.
 Declare one static method.
 Call both instance and static variables into both instance and static methods inside the print statement.
 Declare the Main method.
 Call both instance and static methods into the Main method
     */

    // Declare one instance and one static variable.
    int a = 10;
    static int b = 20;

    //Declare one instance method
    //Call instance variables into instance method
    public void myMethod() {
       Programme3 obj = new Programme3();
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+obj.b);
    }

    //Declare one static method
    public static void myMethod1() {
        Programme3 m1 = new Programme3();
        System.out.println("The value of a = "+m1.a);
        System.out.println("The value of b = "+b);
    }

    //Declare the Main method.
    //Call both instance and static methods into the Main method
    public static void main(String[] args) {
        Programme3 v1 = new Programme3();
        v1.myMethod();
        myMethod1();
    }
}
