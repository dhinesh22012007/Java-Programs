import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("NUMBER: ");
        int num=sc.nextInt();
        int temp=num;
        String result;

        if (num%3==0 && num%5==0) {
            result="FIZZBUZZ";
        }
        else if(num%5==0){
            result="FIZZ";
        }
        else if(num%3==0){
            result="BUZZ";
        }
        else{
            result=String.valueOf(temp);   
        }

        System.out.println(result);
        sc.close();
    }
}
