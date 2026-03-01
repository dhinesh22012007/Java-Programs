/*find the factor for the given number?
it works
            sample input: 5             5 % 1 = 0 
                                        5 % 2 = 1
                                        5 % 3 = 2                sample output: 1 5
                                        5 % 4 = 1
                                        5 % 5 = 0   it print the 0 numbers */

import java.util.Scanner;

public class Factor {

    void fact(int x){
        for( int i=1;i<=x;i++)
        {
            if (x%i==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find it's factor: ");
        int x=sc.nextInt();

        Factor ff=new Factor();
        ff.fact(x);
        sc.close();
    }
    
}
