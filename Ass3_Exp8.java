public class Ass3_Exp8 {
    public static void main(String[] args) {
        //number exist in array
        int arr[]={1,8,4,7,9};
        int target=1;
        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }
    }
}
