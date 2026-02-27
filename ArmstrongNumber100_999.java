/*java progam to print the armstrong number form 100 to 999 */

public class ArmstrongNumber100_999 {
    int lastdigit,j;
    double number=0;
    void Armstrong(){
        for(int i=100;i<=999;i++)
        {
            j=i;
            number=0;
            while (j!=0){
            lastdigit=j%10;
            number += Math.pow(lastdigit, 3);
            j/=10;
        }
        if (number==i) {
            System.out.println(i);
        }
       
        }
    }
    public static void main(String[] args) {
        ArmstrongNumber100_999 am=new ArmstrongNumber100_999();
        System.out.println("The Armstrong Number form 100 to 999 are: ");
        am.Armstrong();
    }   
}
