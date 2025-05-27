public class Assi4_String_ques20 {
    public static void main(String[] args) {
        //Modified string
    String str = "abcabc";
    char target = 'b';
    char replacement = 'i';
    String result = "";

        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            result += replacement;
        } else {
            result += str.charAt(i);
        }
    }
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + result);
    }
}



