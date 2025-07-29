package JavaLanguage.Problems.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for(int i=2;i<=num;i++)
        {
            thirdNumber = firstNumber + secondNumber;
            System.out.println(thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
