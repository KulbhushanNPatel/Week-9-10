public class ExceptionHierarchyExample {

    public static void checkArray() {

        try {

            int[] numbers = {1, 2, 3};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Array index is invalid.");

        } catch (RuntimeException exception) {

            System.out.println("Runtime exception occurred.");

        } catch (Exception exception) {

            System.out.println("General exception occurred.");
        }
    }

    public static void main(String[] args) {

        checkArray();
    }
}