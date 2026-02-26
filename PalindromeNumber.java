/*Check Palindrome Number

A number is palindrome if it reads the same forward and backward.

Example:
Input: 121 → Output: Palindrome
Input: 123 → Output: Not Palindrome   */

import java.util.Scanner;

public class PalindromeNumber{

    int lastdigit,reverse=0;

    public void check(int x){
        int temp=x;
        while(x!=0){
         lastdigit=x%10;
        reverse=(reverse*10)+lastdigit;
        x/=10;
        }
         System.out.println(reverse);

         if (reverse==temp) {
            System.out.println("The given number is Palindrome");
         }
         else{
             System.out.println("The given number is not a Palindrome");
         }
    }
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();

        PalindromeNumber pn=new PalindromeNumber();
        pn.check(x);

        sc.close();
    }
}