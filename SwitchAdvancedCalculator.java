// switch using without break.
import java.util.Scanner;

public class SwitchAdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Operator: ");
        char ope=sc.next().charAt(0);
        System.out.print("1st number: ");
        int num2=sc.nextInt();

        switch (ope) {
            case '+'-> System.out.println("Addtion: "+(num1+num2));
            case '-'-> System.out.println("subtraction: "+(num1-num2));
            case '/'-> System.out.println("Division: "+(num1/num2));
            case '%'-> System.out.println("modulus: "+(num1%num2));
             case '*'-> System.out.println("Multiplication: "+(num1*num2));
        
            default ->System.out.println("Invalid Input");
        }
        sc.close();
    }
}
