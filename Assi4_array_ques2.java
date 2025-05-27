public class Assi4_array_ques2 {
    public static void main(String[] args) {
        //addition of array
        int arr[] = {1, 2, 4, 8};
        int  sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum=+sum+arr[i];
        }
        System.out.println("sum of array is :" + sum);
    }
}

