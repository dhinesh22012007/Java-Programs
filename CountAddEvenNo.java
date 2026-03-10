/*Count the add or even number count */
import java.util.Scanner;

public class CountAddEvenNo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a limit: ");
        int n=sc.nextInt();
        int[] numbers=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter a ["+i+"] value: ");
            numbers[i]=sc.nextInt();
        }


        int even=0,add=0;

        for(int element:numbers){
            if(element%2==0){
                even=even+1;
            }
            else{
                add=add+1;
            }
        }
        System.out.println("The count of add number is "+add);
        System.out.println("The count of even number is "+even);

        sc.close();
    }
}
