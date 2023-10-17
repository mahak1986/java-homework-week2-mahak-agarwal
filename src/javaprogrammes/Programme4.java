package javaprogrammes;

public class Programme4 {

    int a = 10;// First instance variable
    int b = 20;//Second instance variable
    static int c = 30;//Third static variable
    static int d = 40;//Fourth static variable

    public void myMethod() { //Instance method
        System.out.println("The value of a in myMethod = "+a);
        System.out.println("The value of b in myMethod = "+b);
        Programme4 obj = new Programme4();
        System.out.println("The value of c in myMethod = "+obj.c);
        System.out.println("The value of d in myMethod = "+obj.d);
    }

    public static void secondMethod() { //static method
        Programme4 m1 = new Programme4();
        System.out.println("The value of a in secondMethod = "+m1.a);
        System.out.println("The value of b in secondMethod = "+m1.b);
        System.out.println("The value of c in secondMethod = "+m1.c);
        System.out.println("The value of d in secondMethod = "+m1.d);
    }

    public static void main(String[] args) { //main method - calling both instance and static method into main method
        secondMethod();
        Programme4 m2 = new Programme4();
        m2.myMethod();
    }
}
