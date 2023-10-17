package javaprogrammes;

import java.util.Scanner;

public class Programme14AreaPerimeterRectangle {
    /*
    Java program to print the area and perimeter of a rectangle.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The width of the rectangle is: " + 5.5);
        System.out.println("The height of the rectangle is: " + 8.5);
        double area = 5.5 * 8.5;
        System.out.println("Area of rectangle:"+area);
        double perimeter = 2* (5.5 + 8.5);
        System.out.println("Perimeter of rectangle:"+perimeter);
        scanner.close();
    }
}
