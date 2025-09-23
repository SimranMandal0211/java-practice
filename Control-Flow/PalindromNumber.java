import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int reverse = 0, digit;
        int originalNum = num;

        while(num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(reverse == originalNum){
            System.out.println(originalNum+" is Palindrom");
        }
        else{
            System.out.println(originalNum+" is not Palindrom");
        }
    }
}
