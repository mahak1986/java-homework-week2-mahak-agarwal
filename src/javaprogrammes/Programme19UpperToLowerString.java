package javaprogrammes;

import java.util.Scanner;

public class Programme19UpperToLowerString {
    /*
    Java program to convert a given string into lowercase
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string:  ");//THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println("The string in lower case is: "+line);
        scanner.close();

    }
}
