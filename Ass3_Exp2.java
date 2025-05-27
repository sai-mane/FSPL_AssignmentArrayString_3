import java.util.Scanner;

public class Ass3_Exp2 {
    //Taking the values from the user and adding the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lenght");
        int lenght = sc.nextInt();
        int arr[];
        int sum=0;
        arr = new int[lenght];
        for (int i = 0; i <= arr.length-1; i++){
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Addition of Array:"+sum);
    }
}
