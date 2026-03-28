public class PrintStr {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        System.out.println("Check equal or no: "+str1.equals(str2));    //check equal or not return boolen
        System.out.println("length: "+str1.length());   //find length
        System.out.println("1st index "+str1.charAt(0)); //take the first index letter
        System.out.println("Upper case: "+str2.toUpperCase());   //change the string to uppercase
        System.out.println("lower case: "+str2.toLowerCase());  //change the string to lowercase
        System.out.println("Replace: "+str1.replace("hello","Wonder" ));  //replace the string
        System.out.println("String contain the word: "+str2.contains("World"));   //word present or not
        System.out.println("Empty: "+str2.isEmpty());    //Check str2 is empty or not returns boolen
        System.out.println("Entwithn: "+str1.endsWith("lo"));  //check the string endwith with "lo". returns boolen
        System.out.println("startWith: "+str2.startsWith("Wo")); //check the string startwith "Wo". returns boolen
         
        char[] character=str2.toCharArray();
        System.out.print("String to Character Array: ");
        for (char c : character) {
            System.out.print(c+" ");
        }
        System.out.println();

        String str3="  Rabbit ";
        System.out.println("Trim str3: "+str3.trim());  //remove the unwanted space
        System.out.println("Trim Length: "+str3.trim().length()); 
        System.out.println("Length of str3: "+str3.length());


    }
} 
