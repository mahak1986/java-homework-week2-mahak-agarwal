package javaprogrammes;


public class Programme1 {

    /* 1.1 Declare two instance variables.
 Declare one instance method.
 Call both instance variables into the instance method inside the print statement.
 Declare the Main method.
Call the above instance method into the Main method and Run the programme.
   */
    // Declare two instance variables.
    int a = 10;
    int b = 20;

    //Declare one instance method.
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //Call the above instance method into the Main method
       Programme1 obj = new Programme1();
        obj.myMethod();
    }
}
