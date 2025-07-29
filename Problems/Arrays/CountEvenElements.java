package JavaLanguage.Problems.Arrays;

import java.util.Scanner;

public class CountEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Enter the size of array: ");
        arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter array elements.");
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter element no. " + (i+1));
            arr[i] = sc.nextInt();
        }

        int choice = 0;
        System.out.println("Enter your Choice:");
        System.out.println("Enter 1 to follow logical approach.");
        System.out.println("Enter 2 to follow string approach");
        System.out.println("Enter 3 to follow mathematical approach");

        choice = sc.nextInt();

        int totalEvenElement = switch (choice){
            case 1 -> logicalApproach(arr);
            case 2 -> stringApproach(arr);
            case 3 -> mathApproach(arr);
            default -> {
                System.out.println("Please enter a valid choice");
                yield -1;
            }
        };
        if(choice == -1){
            System.out.println("Please re run the program and then enter a valid choice");
        }
        else{
            System.out.println("Total number of element in array containing even no. of digits is " + totalEvenElement);
        }
    }

    public static int logicalApproach(int[] arr) {
        int numCount = 0;
        int digitCount = 0;

        for(int i = 0;i<arr.length;i++)
        {
            int temp = arr[i];
            while(temp > 0){
                temp = temp / 10;
                digitCount++;
            }
            if(digitCount%2 == 0)
            {
                numCount++;
            }
            digitCount = 0;
        }
        return numCount;
    }

    public static int stringApproach(int[] arr) {
        int numCount = 0;
        for(int i:arr){
            String str = Integer.toString(i);
            if(str.length()%2 == 0){
                numCount++;
            }
        }
        return numCount;

    }

    public static int mathApproach(int[] arr) {
        int numCount = 0;
        for (int j : arr) {
            int digitCount = (int) (Math.log(j)) + 1;
            if (digitCount % 2 == 0) {
                numCount++;
            }
        }
        return numCount;
    }


}
