/*Write a program to convert the number into word?
      sample input: 523     sample output; Five Two Three */

import java.util.Scanner;

public class Number_Word {
    int ld;
    int lastdigit,reverse=0;
    
    public void ncw(int x){
        
        while(x!=0){
            lastdigit=x%10;
            reverse=(reverse*10)+lastdigit;
            x/=10;
        }
          System.out.println(reverse);
        while(reverse!=0){
            ld=reverse%10;
            switch (ld) {
                case 1:
                    System.out.print("One\t");
                    break;
                case 2:
                    System.out.print("Two\t");
                    break;
                case 3:
                    System.out.print("Three\t");
                    break;
                case 4:
                    System.out.print("Four\t");
                    break;
                case 5:
                    System.out.print("Five\t");
                    break;
                case 6:
                    System.out.print("Six\t");
                    break;
                case 7:
                    System.out.print("Seven\t");
                    break;
                case 8:
                    System.out.print("Eight\t");
                    break;
                case 9:
                    System.out.print("Nine\t");
                    break;
                case 0:
                    System.out.print("Zero\t");
                    break;
            
                default:
                    break;
            }
            reverse/=10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();

        Number_Word nw=new Number_Word();
        nw.ncw(x);
        sc.close();
    }
}
