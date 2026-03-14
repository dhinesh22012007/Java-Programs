import java.util.Scanner;

public class MarkAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the no.of Subject's: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Subject "+i+" Mark: ");
            int mark=sc.nextInt();
            sum=sum+mark;
        }
        System.out.println("Total Mark: "+sum);
        double result=sum/n;
        System.out.print("The Average is "+result);
        sc.close();
    }
}
