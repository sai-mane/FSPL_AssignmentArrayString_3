import java.util.Scanner;

public class Ass3_Exp4 {
    public static void main(String[] args) {
        //printing the 2d array taking input from user and display the array
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows and column");
        int row = sc.nextInt();
        int column=sc.nextInt();
        int arr[][] =new int[row][column];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");// 0 0//0 1
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }
    }
}
