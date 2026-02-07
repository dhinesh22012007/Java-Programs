

//to find the factorial of the given number.

import java.util.Scanner;
public class fcatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num=in.nextInt();
        int sum=1;
        int i=1;
        while(i<=num){
            sum*=i;
            i++;
        }
        System.out.println("The factorial of "+num+" is "+sum);
    }
}
