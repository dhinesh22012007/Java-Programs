//package non_uploaded;
//Printing alphabets a to z without using loop?    ans: using recursion
public class alpha_no_loop
{
    static void print(char n)
    {
        if ( n>'Z')
            return;
        System.out.print(n);
        System.out.print('\t');
        print((char)(n+1));
    }
    public static void main(String[] args)
    {
        print('A');
    }
}