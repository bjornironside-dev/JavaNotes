package JavaLanguage.Problems.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 elements of array");
        for (int i = 0; i < 5; i++) {
            System.out.println("enter element number "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        int index1=0;
        int index2=0;

        System.out.println("Enter the index of two elements you want to swap:");
        index1 = sc.nextInt();
        index2 = sc.nextInt();

        swapNumbers(arr,index1,index2);
    }

    public static void swapNumbers(int[]arr,int index1,int index2)
    {
        System.out.println("Array before swapping numbers at index "+index1+" and "+ index2 +" is:" + Arrays.toString(arr));
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("After swapping numbers array look like:" + Arrays.toString(arr));
    }
}
