public class AddEven_Array {
    public static void main(String[] args) {
        
        int[] numbers={2,6,8,4,9,7,36,97};

        for(int element:numbers){
            if(element%2==0){
                System.out.println(element+" is even number");
            }
            else{
                System.out.println(element+" is add number");
            }
        }
    }
}
