public class print10_1 
{

    int  looping()
    {
        int i=10;
        while (i>0)
        {
            System.out.println(i);
            i--;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        print10_1 c=new print10_1();
        c.looping();;
    }
}
