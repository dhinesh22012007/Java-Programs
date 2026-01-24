import java.io.Console;

public class Main {
    public static void main(String[] args) {

        Console con = System.console();

        if (con == null) {
            System.out.println("Console not available. Run from command prompt.");
            return;
        }

        char[] password = con.readPassword("Enter your password: ");

        // Printing the password (for learning only)
        System.out.println("Password is: " + new String(password));
    }
}
