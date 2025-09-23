
import java.util.Scanner;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of element in array: ");
        int ele = sc.nextInt();

        int []arr = new int[ele];

        System.out.print("Enter " + ele + " elements:");
        for(int i=0; i<ele; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int i =1; i < ele; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }   
        }


        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
