public class Ass3_Exp3 {
    public static void main(String[] args) {
        //skipping the middle value and printing the all values of array
        int arr[]={10,20,30,40,50};
        for (int i = 0; i <= arr.length ; i++)
            if (arr[i] == arr[1]) {
                continue;
            } else {
                System.out.print(" " + arr[i]);
            }
    }
}
