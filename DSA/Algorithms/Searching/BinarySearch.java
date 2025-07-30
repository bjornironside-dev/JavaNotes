package JavaLanguage.DSA.Algorithms.Searching;

// to apply this algorithm you need to have sorted array otherwise it will not be applicable
// either in ascending or descending order
/*Start with two pointers:

left points to the beginning of the array
right points to the end of the array

Repeat while left is less than or equal to right:
Calculate the middle index:
mid = left + (right - left) / 2

Compare the middle element with the target:
If it equals the target → target is found
If it's less than the target → search the right half
If it's greater than the target → search the left half
If loop ends, the target is not in the array.

*/


import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.print("Enter the array Size:");
        int arrSize = sc.nextInt();

        if (arrSize <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[arrSize];
        System.out.println("Enter the array element.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element no " + i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element:");
        target = sc.nextInt();

        int result = binarySearch(arr,target);

        if( result == -1)
        {
            System.out.println("Element not Found!");
        }
        else {
            System.out.println("Element found at index : " + result);
        }


    }

    // returns the index at which element is present
    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start<=end)
        {
            /*We use mid = start + (end - start) / 2 to avoid integer overflow that can happen with (start + end) / 2 when start and end are large.
             This formula is safer and ensures correct results in all cases.*/
            mid = start + (end - start)/2;

            if(target == arr[mid])
            {
                return mid;
            }
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
