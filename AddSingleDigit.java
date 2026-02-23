
//This program get the input from the user perform sum of single digit. 
//     input:562      output: 13    (5+6+2)
    
import java.util.Scanner;
public class AddSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int sum=0;
        int ld;

        while (num>0)
        {  
            ld=num%10;
            sum=sum+ld;
            num/=10;
            
        }
        System.out.print("The sum of the digits is "+ (sum));
    }
}
