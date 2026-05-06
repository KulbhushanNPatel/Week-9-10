public class UncheckedExceptionExample {

    public static void divideNumbers(int firstNumber, int secondNumber) {

        try {

            int result = firstNumber / secondNumber;

            System.out.println("Result: " + result);

        } catch (ArithmeticException exception) {

            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {

        divideNumbers(10, 0);
    }
}