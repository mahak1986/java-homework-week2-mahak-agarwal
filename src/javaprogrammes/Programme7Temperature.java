package javaprogrammes;

import java.util.Scanner;
/*
Write a program to insert any temperature value in degree Fahrenheit
and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert temperature value in Fahrenheit: ");
        int value  = scanner.nextInt();
        System.out.print("The answer in Celsius is: ");
        int temperature = (value -32) * 5/9;
        System.out.println(temperature);
        scanner.close();
    }
}
