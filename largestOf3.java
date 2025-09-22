import java.util.Scanner;

public class largestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();


        int largest = (num1 > num2)?((num1 > num3)? num1 : num3):((num2 > num3) ? num2 : num3);

        System.out.println("Larget number b/w "+num1+" ,"+num2+" and "+num3+" is:: "+largest);
    }
}
