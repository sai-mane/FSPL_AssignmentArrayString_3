public class Ass3_Exp11 {
    public static void main(String[] args) {
            //Missing the element from the array
                int[] arr = { 1, 2, 3, 5 };
                int n = 5;
                int total = n * (n + 1) / 2;
                System.out.println("total value: "+total);
                int sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                int missing = total - sum;
                System.out.println("sum value :"+sum);
                System.out.println("Missing number: " + total +"-"+ sum + " ="+missing);
            }
        }
