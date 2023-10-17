package javaprogrammes;

public class Programme15Swap {
    /*
    Java program to swap two variables
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c;
        System.out.println("Before swapping: a = " + a + " and "+  "b = " + b);
        c = a; // c is 2
        a = b; // a is 6
        b = c; // b is 2

        System.out.println("After swapping: a = " + a + " and "+  "b = " + b);
    }
}
