package javaprogrammes;

import java.util.Scanner;

public class Programme16AddBinaryNumbers {
    /*
    Java program to add two binary numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating the scanner
        System.out.print("Input first binary number: ");// printing statement for user to enter first binary number
        String binary = scanner.nextLine();
        System.out.print("Input second binary number: ");//user enters second binary number
        String binary2 = scanner.nextLine();

        //adding 2 binary number
        int a = Integer.parseInt(binary, 2);
        int b = Integer.parseInt(binary2, 2);
        int c = a + b;

        System.out.print("Addition of two binary numbers is: ");
        System.out.println(Integer.toBinaryString(c));//call to Binary string method
        scanner.close();
    }
}
