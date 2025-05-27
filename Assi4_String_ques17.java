public class Assi4_String_ques17 {
    public static void main(String[] args) {
        String str = "  Java   Programming Language ";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        System.out.println("String without spaces: " + result);
    }
}
