/*Printing a Multiplication Table for a given number to a given limit. */

import java.util.Scanner;

public class MultipalicationTable {
    
    void table(int x,int y){
        for(int i=1;i<=y;i++){
            System.out.printf("%-3d X %-3d = %-4d%n",i,x,(i*x));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Table: ");
        int x=sc.nextInt();
        System.out.print("Enter the Table Limit: ");
        int y=sc.nextInt();
        
        MultipalicationTable mp=new MultipalicationTable();
        mp.table(x, y);

        sc.close();
    }
}
