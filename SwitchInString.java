import java.util.Scanner;

public class SwitchInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day( in small letters): ");
        String day=sc.next();

        if( day.equals(day.toLowerCase()))
        {
            switch (day) {
                case "sunday":
                    System.out.println("Hello it's sunday");
                    break;
                case "monday":
                    System.out.println("Hello it's Monday");
                    break;
                case "tuesday":
                    System.out.println("Hello it's Tuesday");
                    break;
                case "wednesday":
                    System.out.println("Hello it's Wednesday");
                    break;
                case "thursday":
                    System.out.println("Hello it's Thursday");
                    break;
                case "Tusday":
                    System.out.println("Hello it's Monday");
                    break;
                case "friday":
                    System.out.println("Hello it's Friday");
                    break;
                case "saturday":
                    System.out.println("Hello it's Saturday");
                    break;
            
                default:
                    System.out.println("give input between monday - sunday (or) check spelling");
                    break;
            }

        }else
            System.out.println("use smallcase letters");

       
    }
}
