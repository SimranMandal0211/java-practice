
import java.util.Scanner;

public class CalSimpleCompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amout (P):: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Intrest (R):: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time in year (T):: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time)/100;

        double compoundInterest = principal * (Math.pow((1 + rate / 100), time)) - principal;


        System.out.println("\n--- Results ---");
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);


    }
}
