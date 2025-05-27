public class Assi4_array_ques10 {
            public static void main(String[] args) {
                int[] array = {4, 5, 9, 4, 9, 7, 2, 5};
                int n = array.length;
                int[] temp = new int[n];
                int newSize = 0;

                for (int i = 0; i < n; i++) {
                    boolean isDuplicate = false;
                    for (int j = 0; j < newSize; j++) {
                        if (array[i] == temp[j]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[newSize] = array[i];
                        newSize++;
                    }
                }
                System.out.print("Array after removing duplicates: ");
                for (int i = 0; i < newSize; i++) {
                    System.out.print(temp[i] + " ");
                }
            }
        }



