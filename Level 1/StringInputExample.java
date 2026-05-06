import java.util.Scanner;

public class StringInputExample {

    public static void displayMessage(String name) {
        System.out.println("Hello \"" + name + "\"");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        displayMessage(userName);
    }
}