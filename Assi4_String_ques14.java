public class Assi4_String_ques14 {
    public static void main(String[] args) {
     System.out.println("***************************");
    String str = "Nayan";
            System.out.println("Original string is : "+str);
    String reversed = new StringBuilder(str).reverse().toString();
            System.out.println("Reversed String is : "+reversed);
            System.out.println("***************************");

            if (str.equalsIgnoreCase(reversed)) {
        System.out.println(str + " is a palindrome.");
    } else {
        System.out.println(str + " is not a palindrome.");
     }
  }
}
