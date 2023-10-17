package javaprogrammes;

import java.util.Scanner;

public class Programme13Average {
    /*
    Java program that takes three numbers as input
    to calculate and print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();
        double average = ((a+b+c)/3);
        System.out.print("The average of three numbers is: " );
        System.out.println(average);
        scanner.close();

    }
}
