package Basics;
import java.util.Scanner;

public class CovertTempCel2Fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temprature in Celsius:  ");
        double celsius = sc.nextDouble();

        // Conversion formula: F = (C ? 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Printing result
        System.out.println(celsius + "?C = " + fahrenheit + "?F");


    }
}
