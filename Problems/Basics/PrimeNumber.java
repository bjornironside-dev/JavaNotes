package JavaLanguage.Problems.Basics;

import java.util.Scanner;

// best programming practice to follow
/*
*
* 1. ✅ Modular Code
Extract logic into a separate method (isPrime()): improves readability, testability, and reusability.

2. ✅ Correct Variable Names
Use meaningful names like num or testCases instead of number or testcases.

3. ✅ Close Resources
Close your Scanner object at the end to prevent memory leaks.

4. ✅ Avoid Magic Numbers
Avoid hardcoding numbers like 2 or 0. Use comments or constants to clarify purpose if needed.

5. ✅ Efficient Looping
Skip even numbers in the loop (i += 2) since even numbers aren't prime (except 2).
*
*/

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

        sc.close(); // Good practice: close scanner
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false; // even numbers greater than 2 are not prime

        int sqrt = (int)Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
