public class Reference {
    public static void main(String[] args) {
        
        String  str;
        str="hello";
        str="hi";
        System.out.println(str);
    }
}
/* String is a immutable!!.  "hello" is still in memory, but you lost the reference to it.

So to print "hello", you must keep a reference. */
