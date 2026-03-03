/*find the given number is Perfect or not? */

import java.util.Scanner;

public class PerfectNumber {
    int sum=0;
    void number(int n){
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }

        if(sum==n){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is Not a Perfect Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        PerfectNumber pn=new PerfectNumber();
        pn.number(n);
        sc.close();
    }
}
/* A perfect number is a positive number that is equal to the sum of its proper divisors (excluding the number itself).

Example:
6 → divisors: 1, 2, 3
1 + 2 + 3 = 6
So, 6 is a perfect number. */