import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get table: ");
        double num = sc.nextDouble();

        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
