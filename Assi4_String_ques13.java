public class Assi4_String_ques13 {
    public static void main(String[] args) {
        String org = "Sai";
        String rev = "";
        for (int i = org.length() - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
            System.out.println("Assigning the index value to rev "+ i +": "+ rev);
       }
        System.out.println("Original string: " + org);
        System.out.println("Reversed string: " + rev);
    }
}
