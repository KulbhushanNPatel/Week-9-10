public class StringArrayExample {

    public static void displayNames(String[] names) {

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        String[] studentNames = {"Alice", "Bob", "Charlie"};

        displayNames(studentNames);
    }
}