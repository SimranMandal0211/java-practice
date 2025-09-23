import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to get factorial:  ");
        double num = sc.nextDouble();

        double factorial = 1;
        for(int i= 1; i<=num; i++){
           factorial *= i;
        }

        System.out.print("Factorial of "+num+" is "+factorial);
    }
}
