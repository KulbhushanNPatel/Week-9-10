import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {

    public static void readFile(String fileName) {

        try {

            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException exception) {

            System.out.println("File not found.");
        }
    }

    public static void main(String[] args) {

        readFile("sample.txt");
    }
}