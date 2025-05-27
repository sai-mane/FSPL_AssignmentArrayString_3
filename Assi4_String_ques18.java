public class Assi4_String_ques18 {
    public static void main(String[] args) {
    String str1 = "jaVa";
    String str2 = "Java";
    boolean isEqual = true;
        String strr1 =str1.toLowerCase();
        String strr2 =str2.toLowerCase();

        if (str1.length() != str2.length()) {
        isEqual = false;
    } else {
        for (int i = 0; i < str1.length(); i++) {
            if (strr1.charAt(i) != strr2.charAt(i)) {
                isEqual = false;
                break;
            }
        }
    }
        if (isEqual) {
        System.out.println("Strings are exactly equal.");
    } else {
        System.out.println("Strings are not equal.");
     }
  }
}

