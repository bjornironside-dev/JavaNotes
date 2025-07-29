package JavaLanguage.DSA.DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        System.out.println("Enter the size of array: ");
        arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter the array element.");
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Element no "+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reversing: ");
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
 }
