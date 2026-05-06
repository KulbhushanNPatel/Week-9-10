public class StringMethodsExample {

    public static void analyzeString(String text) {

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring: " + text.substring(0, 4));
    }

    public static void main(String[] args) {

        String message = "JavaProgramming";

        analyzeString(message);
    }
}