package JavaLanguage.Problems.Basics;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        int max = 0;

        System.out.println("Enter First Number:");
        firstNumber = sc.nextInt();

        System.out.println("Enter Second Number:");
        secondNumber = sc.nextInt();

        System.out.println("Enter Third Number:");
        thirdNumber = sc.nextInt();

        max = firstNumber;

        if(secondNumber>max)
        {
            max = secondNumber;
        }
        if(thirdNumber>max)
        {
            max = thirdNumber;
        }

        System.out.println("The maximum of three number : " + max);
    }
    }
