public class Assi4_array_ques4 {
    public static void main(String[] args) {
        //min value in Array
        int arr[]={1,8,4,7,9};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest element: " + min);
    }
}
