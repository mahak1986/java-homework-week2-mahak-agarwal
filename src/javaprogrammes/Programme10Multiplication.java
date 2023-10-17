package javaprogrammes;

import java.util.Scanner;

public class Programme10Multiplication {
 /*
 Java program that takes a number as input and prints its multiplication table up to 10
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:  ");//Input any number but test data given 8
        int a = scanner.nextInt();
        System.out.print("Table of:  "+a);
        System.out.print("\n");//to print in a new line
        int b=1,c=2,d=3,e=4,f=5,g=6,h=7,i=8,j=9,k=10;
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " * " + c + " = " + (a * c));
        System.out.println(a + " * " + d + " = " + (a * d));
        System.out.println(a + " * " + e + " = " + (a * e));
        System.out.println(a + " * " + f + " = " + (a * f));
        System.out.println(a + " * " + g + " = " + (a * g));
        System.out.println(a + " * " + h + " = " + (a * h));
        System.out.println(a + " * " + i + " = " + (a * i));
        System.out.println(a + " * " + j + " = " + (a * j));
        System.out.println(a + " * " + k + " = " + (a * k));
        scanner.close();
    }
}
