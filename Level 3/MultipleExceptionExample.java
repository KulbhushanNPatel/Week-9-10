import java.util.Scanner;

public class MultipleExceptionExample {

    public static void processInput() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");

            int number = Integer.parseInt(scanner.nextLine());

            int result = 100 / number;

            System.out.println("Result: " + result);

        } catch (NumberFormatException exception) {

            System.out.println("Invalid number format.");

        } catch (ArithmeticException exception) {

            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {

        processInput();
    }
}