import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Choose an Operator(+, -, x, /, %): ");
        char operator = sc.next().charAt(0);

        int result = 0 ;

        switch(operator){
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case 'x': result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }
                else{
                    System.out.println("Error: Divided by Zero!");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+result);


    }
}
