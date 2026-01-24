import java.util.Scanner;
public class IfCondition {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter any integer: ");
         int a=sc.nextInt();

         if (a%2==0)
         {
            System.out.println("the integer "+a+" is even");
         }
         else
         {
            System.out.println("the integer "+a+" is odd");
         }
    }
}