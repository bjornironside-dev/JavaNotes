package JavaLanguage.DSA.DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Syntax :
        /*
        datatype[] array_name = new datatype[size];
        * */
        int[] arr = new int[5];

        /*primitive types are stored in stack memory
        * non-primitive types are always stored in heap memory*/

        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element:");
        for (int i = 0; i<5; i++)
        {
            System.out.println("Enter element no " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }


        // we can use for-each loop to iterate through array
        for(int num:arr)
        {
            System.out.println(num); // here num represents element of the array
        }

        System.out.println(Arrays.toString(arr));

    }
}
