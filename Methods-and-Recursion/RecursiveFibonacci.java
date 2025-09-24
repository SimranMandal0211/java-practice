import java.util.Scanner;
public class RecursiveFibonacci {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number: ");
        int num = sc.nextInt();

        System.out.println("Fibonacci series upto "+ num +" terms: ");
        for(int i = 0; i < num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
