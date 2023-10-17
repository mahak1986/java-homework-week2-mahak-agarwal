package javaprogrammes;

import java.util.Scanner;

public class Programme18Operations {
    /*
    Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    Test Data:
    Input first number: 125
    Input second number: 24
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");//first number is 125
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");//second number is 24
        int num2 = scanner.nextInt();
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
        System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
        System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
        System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
        scanner.close();
    }
}
