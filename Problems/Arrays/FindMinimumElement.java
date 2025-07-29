package JavaLanguage.Problems.Arrays;

import java.util.Scanner;

public class FindMinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        System.out.println("Enter the size of array : ");
        arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the array elements.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element no " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("The minimum element in array is "+findMinNumber(arr));

    }

    public static int findMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
