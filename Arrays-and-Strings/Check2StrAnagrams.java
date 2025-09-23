import java.util.Scanner;
import java.util.Arrays;

public class Check2StrAnagrams {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter 1st string: ");
        String str2 = sc.nextLine();

        // remove spaces and convert to lowercase
        str1= str1.replaceAll("\\s", "").toLowerCase();

        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams (different length)");
        }
        else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
}
