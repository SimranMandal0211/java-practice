
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to check Prime or not: ");
        double num = sc.nextDouble();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }
        else{
            for(int i = 2; i < Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }


        if(isPrime == false){
            System.out.println(num+ " is not prime number");
        }else{
            System.out.println(num+ " is prime number");
        }
    }
}
