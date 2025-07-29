package JavaLanguage.Problems.Basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int digits = countDigit(num);
        System.out.println("The total no of digits in the number that you entered is " + digits);
    }

    public static int countDigit(int num)
    {
        int count = 0;
        while(num > 0)
        {
            num = num/10;
            count++;
        }
        return count;
    }
}
