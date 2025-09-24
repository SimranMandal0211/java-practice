
public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Intentionally accessing invalid index
            System.out.println("Accessing 4th element: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        } finally {
            System.out.println("Array operation completed.");
        }
    }
}
