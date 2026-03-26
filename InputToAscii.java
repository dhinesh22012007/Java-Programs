//print the ascii value for the user input.
import java.util.Scanner;

public class InputToAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char/Symbol: ");
        char a=sc.nextLine().charAt(0);

        int b=(int)a;
        System.out.println("ASCII of: "+b);
        sc.close();
    }
}
