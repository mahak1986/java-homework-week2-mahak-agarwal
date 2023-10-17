package javaprogrammes;

import java.util.Scanner;
/*
Write a program to calculate the area of a triangle.
 */
public class Programme8TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of the triangle: ");
        int height = scanner.nextInt();
        System.out.print("The area of the triangle is: ");
        double area = 0.5 * base * height;
        System.out.println(area);
        scanner.close();
    }
}
