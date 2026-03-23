/* Swapping of two variables without using third variable */

import java.util.Scanner;

public class SwappingVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("...Before Swapping...");
        System.out.print("a :");
        int a=sc.nextInt();
        System.out.print("b :");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("...After Swapping...");
        System.out.print("a :"+a+"\n"+"b :"+b);
        sc.close();
    }
}
