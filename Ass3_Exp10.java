public class Ass3_Exp10 {
    public static void main(String[] args) {
        int arr[]={1,8,4,7,9};
        System.out.print("Original Array :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.print("Copied Array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
