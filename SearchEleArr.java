import java.util.Scanner;
import java.util.Arrays;

public class SearchEleArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int ele = sc.nextInt();

        int arr[] = new int[ele];

        System.out.print("Enter element in array\n");
        for(int i=0; i<ele; i++){
            System.out.print("Enter element ["+(i+1)+"] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element you want to search from array: ");
        int num = sc.nextInt();

        // Linear search
        System.out.print(".........Linear Search..........\n");
        boolean found = false;

        for(int i=0; i<ele; i++){
            if(num == arr[i]){
                System.out.print(num+" found at "+(i+1));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(num+" not found in array");
        }


        // Binary Search
        System.out.print(".........Binary search..........");
        Arrays.sort(arr);
        System.out.print("\n Sorted Array "+Arrays.toString(arr)+" \n");

        int low = 0, high = ele-1;
        boolean notFound = true;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == num){
                System.out.println(num + " found at position " + (mid + 1));
                notFound = false;
                break;
            }
            else if (arr[mid] < num) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        if (notFound) {
            System.out.println(num + " not found in array");
        }
    }
}
