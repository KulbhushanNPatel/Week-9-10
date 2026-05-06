public class StringParameterExample {

    public static void reverseString(String text) {

        String reversedText = "";

        for (int index = text.length() - 1; index >= 0; index--) {

            reversedText += text.charAt(index);
        }

        System.out.println("Reversed String: " + reversedText);
    }

    public static void main(String[] args) {

        reverseString("Programming");
    }
}