package javaprogrammes;

import java.util.Scanner;

public class Programme5Calculator {

    //Instance method
    public void addition(int a, int b) {
        int answer = a + b;
        System.out.println("addition: " + answer);//concatenation
    }

    //Instance method
    public void subtraction(int a, int b) {
        int answer = a - b;
        System.out.println("subtraction: " + answer);//concatenation
    }

    //static method
    public static void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("multiplication: " + answer);//concatenation
    }

    //static method
    public static void division(int a, int b) {
        int answer = a / b;
        System.out.println("division: " + answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//object creation
        Programme5Calculator obj = new Programme5Calculator();//object creation to call instance method into static method
        System.out.print("Enter number1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        obj.addition(a, b); //calling instance method into main method
        obj.subtraction(a, b);//calling instance method into main method
        division(a, b);//calling static method into main method
        multiplication(a, b);//calling static method into main method
        scanner.close();

    }
}
