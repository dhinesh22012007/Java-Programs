//Print the 2D array with user input.

import java.util.Scanner;

public class Array2DGetInput {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the 2D Array Limit: ");
        int n=sc.nextInt();
         int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Element ["+i+"]["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println(" ");

        }  
        System.out.println("The 2D Array is ");

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
        }  
        sc.close();
    }
}