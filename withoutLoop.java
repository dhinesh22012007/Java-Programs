//package non_uploaded;
//Printing numbers 1 to 100 without using loop?    ans: using recursion
public class withoutLoop {
    static void print(int n)
    {
        if(n>100)
            return;
        System.out.print(n);
        System.out.print('\t');    
        print(n+1);
    }
    public static void main(String[] args)
    {
        print(1);
    }
}
