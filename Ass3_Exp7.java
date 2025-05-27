public class Ass3_Exp7 {
    public static void main(String[] args) {
        // Count even and odd numbers
            int arr[]={1,8,4,7,9};
            int even = 0, odd = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    even++;
                    System.out.print(num + " ");
                }
                else {
                    odd++;
                    System.out.print(num + " ");
                }
            }
            System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
