import java.util.Scanner;
import java.util.Arrays;

public class SumAvgArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        int ele = sc.nextInt();

        System.out.println("Enter elements in array");
        int[] arr = new int[ele];

        int sum=0;
        int avg;
        for(int i=0; i<ele; i++){
            System.out.print("Element ["+(i+1)+"] ");
            arr[i]= sc.nextInt();
            
        }

        System.out.println("Original array: "+Arrays.toString(arr));

        System.out.println("Sum of array's elements ");
        for(int i=0; i<ele; i++){
            System.out.print(arr[i]+" + ");
            sum += arr[i];
        }

        avg = sum/ele;
        System.out.print("= "+sum+"\n average: "+avg);
    }
}
