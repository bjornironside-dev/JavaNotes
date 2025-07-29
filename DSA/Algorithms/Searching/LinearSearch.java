package JavaLanguage.DSA.Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the array Element.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element no : "+ i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element you want to search in array:");
        int target = sc.nextInt();

        int targetValue = linearSearch(arr,target);

        if( targetValue == -1)
        {
            System.out.println("Target Element not found in array.");
        }
        else {
            System.out.println("Targer Element found at index : "+ targetValue  );
        }

    }

    public static int linearSearch(int[] arr, int target)
    {
        if (arr.length == 0) {
            return -1;
        }

        // iterating through the array to find the target element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
            {
                return index;
            }
        }
        return -1;
    }
}
