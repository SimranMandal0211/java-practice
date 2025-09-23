
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for fibonacci: ");
        double num = sc.nextDouble();
         
        int first = 0, second = 1;

        for(int i=1; i <= num; i++){
            System.out.print(first);

            int next = first + second;
            first = second;
            second = next;

            if(i != num){
                System.out.print(",");
            }
            
        }
    }
}
