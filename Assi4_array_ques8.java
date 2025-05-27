public class Assi4_array_ques8 {
    public static void main(String[] args) {
        //finding the array element
        int[] arr = {4, 2, 7, 1, 3};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found");
        }
      }
    }

