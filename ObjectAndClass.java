public class ObjectAndClass {
    String Name;
    int Year;
    int Price;

    public void display(){
        System.out.println("car Name: "+Name+"\n"+"Car Year: "+Year+"\n"+"Car Price: "+Price+"\n\n");
    }

    public static void main(String[] args) {
        ObjectAndClass obj=new ObjectAndClass();
        obj.Name="Mustang";
        obj.Year=2025;
        obj.Price=500000; 
        
        ObjectAndClass obj2=new ObjectAndClass();
        obj2.Name="Maruthi";
        obj2.Year=2014;
        obj2.Price=300000; 

        obj.display();
        obj2.display();
    }
}
