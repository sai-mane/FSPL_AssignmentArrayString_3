public class Assi4_String_ques16 {
    public static void main(String[] args) {
                String str = "programming";
                int[] freq = new int[256];
                char[] chars = str.toCharArray();
                for (char c : chars) {
                    freq[c]++;
                }
                System.out.println("Character frequencies:");
                for (int i = 0; i < 256; i++) {
                    if (freq[i] > 0) {
                        System.out.println((char) i + " : " + freq[i]);
                    }
                }
            }
        }

