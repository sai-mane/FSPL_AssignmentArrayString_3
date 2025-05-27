public class Assi4_String_ques12 {
    public static void main(String[] args) {
    String org = "Sai";
    String vowel = "aeiouAEIOU";
        for (int i = org.length() - 1; i >= 0; i--) {
        char ch = org.charAt(i);
        if (vowel.indexOf(ch) != -1) {// I A S
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
     }
  }
}
