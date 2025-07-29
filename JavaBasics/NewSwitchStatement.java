package JavaLanguage.JavaBasics;

import java.util.Scanner;

public class NewSwitchStatement {
    public static void main(String[] args) {
        // new switch statement introduced in java 14
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score:");
        score = sc.nextInt();

        // New switch expression with 'yield'
        String grade = switch (score / 10) { // Switch based on score range (85 -> 8)
            case 10, 9 -> "A";               // Multiple case labels (score 90-100)
            case 8 -> {
                // You can perform multiple operations inside a block
                System.out.println("Good job! You scored in the 80s.");

                // 'yield' returns the value from this case block to 'grade'
                yield "B";
            }
            case 7 -> {
                System.out.println("Not bad! You scored in the 70s.");
                yield "C";
            }
            case 6 -> {
                System.out.println("Needs improvement.");
                yield "D";
            }
            default -> {
                System.out.println("Failed!");
                yield "F";
            }
        };

        // Final result
        System.out.println("Your grade is: " + grade);

        /*
        * public class NewSwitchExample {
    public static void main(String[] args) {
        int day = 3;

        // New-style switch as an expression
        String dayName = switch (day) {
            case 1 -> "Monday";        // no break needed
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };

        System.out.println("Day: " + dayName);
    }
}
*/
    }
}
