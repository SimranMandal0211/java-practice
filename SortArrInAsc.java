import java.util.Scanner;

public class SortArrInAsc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int ele = sc.nextInt();

        int arr[] = new int[ele];

        System.out.print("Enter " + ele + " elements:");
        for(int i=0; i<ele; i++){
            System.out.print("Enter element ["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<ele-1; i++){
            for(int j=0; j<ele-1-i; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
