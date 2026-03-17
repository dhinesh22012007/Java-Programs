import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Arrar Limit: ");
        int limit=sc.nextInt();
        int arr[]=new int[limit];
        
        for(int i=0;i<limit;i++)
        {
            System.out.print("Enter the "+(i+1)+" value: ");
            arr[i] =sc.nextInt();
        }
        for(int j=0;j<limit;j++)
        {
            for(int k=j+1;k<limit;k++)
            {
                if (arr[j]==arr[k]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
        sc.close();
    }
}
