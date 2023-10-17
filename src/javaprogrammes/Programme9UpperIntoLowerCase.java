package javaprogrammes;

import java.util.Scanner;

public class Programme9UpperIntoLowerCase {
    /*
     Convert the upper case to lower case
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence in upper case: ");
        String st = scanner.nextLine();//object stored in st
        String st1 = st.toLowerCase();//st stored in st1
        System.out.print("The sentence in lower case: " + st1);
        scanner.close();
    }
}
