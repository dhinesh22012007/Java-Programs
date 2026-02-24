/*Write a program to find a given number is Armstrong or not?
==> Armstrong number is a number that is equal to the sum of its digits raised to the power of the total number of digits. 
smaple input=153      sample output: 1^3+5^3+3^3=1+125+27  =153   The given number is not a Armstrong */

import java.util.Scanner;

public class Armstrong 
{
    void tofind(int x)
    {
        int temp=x;
        int temp1=x;
        int lastdigit;
        int count=0;
        double sum=0;

        while (x!=0) {
            lastdigit=x%10;
            x/=10;
            count++;
        }
        //System.out.println(count);

        while (temp!=0) {
            lastdigit=temp%10;
            sum=sum+(Math.pow(lastdigit,count));
            temp/=10;
        }
         System.out.println(sum);

         String str=(sum==temp1)?"The given number is Armstrong":"The given number is not a Armstrong";
         System.out.println(str);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to find Armstrong: ");
        int x=sc.nextInt();
        Armstrong am=new Armstrong();
        am.tofind(x);
        sc.close();
    }
}

