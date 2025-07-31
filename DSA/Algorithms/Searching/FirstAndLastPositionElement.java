package JavaLanguage.DSA.Algorithms.Searching;

import java.util.Scanner;

public class FirstAndLastPositionElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call searchRange
        Solution sol = new Solution();
        int[] result = sol.searchRange(nums, target);

        // Print result
        System.out.println("First and Last Occurrence Index: [" + result[0] + ", " + result[1] + "]");
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findOccurrence(nums, target, true);  // First occurrence
        result[1] = findOccurrence(nums, target, false); // Last occurrence
        return result;
    }

    private int findOccurrence(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (findFirst) {
                    end = mid - 1; // Keep going left
                } else {
                    start = mid + 1; // Keep going right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }
}
