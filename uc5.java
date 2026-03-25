public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            // Enhanced for loop to iterate through args
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // add comma only after first name
                }
                names.append(name);
            }

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
