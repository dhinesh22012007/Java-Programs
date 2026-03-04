import java.util.Scanner;

public class StrongNumber {
    
    int lastdigit,sum=0,fact=1;
    void strongnumber(int n){
        int x=n;
        
        while (n!=0) {
            lastdigit=n%10;

            for(int i=1;i<=lastdigit;i++){
                fact*=i;
            }

            sum+=fact;
            n/=10;
            fact=1;
        }
        

        if(x==sum){
            System.out.println(x+" is a strong number");
        }
        else{
            System.out.println(x+" is not a strong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        
        StrongNumber sn=new StrongNumber();
        sn.strongnumber(n);

        sc.close();
    }
}
