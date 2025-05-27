public class Assi4_array_ques1 {
    public static void main(String[] args) {
        //printing the max number from the array
        int arr[] = {1, 2, 4, 8};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value:" + max);
      }
    }

