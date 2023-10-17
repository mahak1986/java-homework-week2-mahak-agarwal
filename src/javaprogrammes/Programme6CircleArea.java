package javaprogrammes;

import java.util.Scanner;

public class Programme6CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius *radius;
        System.out.println(area);
        scanner.close();

    }
}
