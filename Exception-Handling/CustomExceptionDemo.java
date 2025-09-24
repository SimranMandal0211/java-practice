class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided: " + age);
        } else {
            System.out.println("Valid age: " + age + ". You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // invalid case
            checkAge(21); // valid case
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
