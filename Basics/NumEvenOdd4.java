package Basics;

import java.util.Scanner;

public class NumEvenOdd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to check Even/Odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
          System.out.println(num+" is Even");
        else
          System.out.println(num+" is Odd");

    }
}
