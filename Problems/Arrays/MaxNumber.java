package JavaLanguage.Problems.Arrays;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Enter the size of array: ");
        num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the array element:");
        for (int i = 0; i < num; i++) {
            System.out.print("Element no " + (i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum number in array is: "+max(arr));
    }
    public static int max(int[] arr)
    {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
