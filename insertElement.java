import java.util.Arrays;

public class insertElement {
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50,60,70,80,90};
        int index=2;
        int value=25;
        System.out.println("before insert "+Arrays.toString(arr));

        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println("After insert "+Arrays.toString(arr));
    }
}
