package JavaLanguage.JavaBasics;

public class TernaryOperator {
    public static void main(String[] args) {
        /* Syntax of Ternary Operator

        condition ? expression_if_true : expression_if_false;

        If condition is true, then expression_if_true is returned.
        If condition is false, then expression_if_false is returned.

        ⚠️ When to Use:
        ✅ Use for short, simple conditions.
        🚫 Avoid for complex logic (use if-else instead for better readability).
        */

        int a = 10, b = 20;

        // using ternary to find the maximum
        int max = (a > b) ? a : b;

        System.out.println("Maximum value is: " + max);

        int age = 18;

        String result = (age >= 18) ? "Eligible to vote" : "Not eligible";

        System.out.println(result);
    }
}
