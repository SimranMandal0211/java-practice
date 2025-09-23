import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elemets: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: "+Arrays.toString(arr));

        for(int start = 0, end = n-1; start<end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println("Revese array: "+Arrays.toString(arr));
    }
}
