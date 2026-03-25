public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append each name with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Final output
            System.out.println("Hello, " + names + "!");
        }
    }
}
