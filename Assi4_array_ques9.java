public class Assi4_array_ques9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
            System.out.println(k);
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
            System.out.println(k);
        }

        // Print merged array
        System.out.print("Merged array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
