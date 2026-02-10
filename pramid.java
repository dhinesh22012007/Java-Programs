public class pramid{
    void Angle()
    {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pramid a1= new pramid();
        a1.Angle();
    }
}
