/*write a program to reverse a given numbers?
     sample input: 586      smaple output: 685 */


import java.util.*;
class ReverseNumber
{
    void displayinfo(int x)
    {
        int temp=x;
        int remainder,reverse=0;
        while (x!=0) {
            remainder=x%10;
            reverse=(reverse*10)+remainder;
            x/=10;
        }
        System.out.println("The reverse of "+temp+ " is "+reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();

        ReverseNumber rs=new ReverseNumber();
        rs.displayinfo(x);

        sc.close();
    }
}
