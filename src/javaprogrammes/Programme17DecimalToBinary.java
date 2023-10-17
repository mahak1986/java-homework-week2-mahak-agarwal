package javaprogrammes;

public class Programme17DecimalToBinary {
    /*
    Java program to convert a decimal number to binary number
     */
    public static void main(String[] args) {
        int decimal = 5;
        // converting to binary and representing it in a string
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }
}


