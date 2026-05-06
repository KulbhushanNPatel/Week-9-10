public class ASCIIExample {

    public static void displayASCII(char character) {

        int asciiValue = character;

        System.out.println("Character: " + character);
        System.out.println("ASCII Value: " + asciiValue);
    }

    public static void main(String[] args) {

        displayASCII('A');
    }
}