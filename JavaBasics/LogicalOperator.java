package JavaLanguage.JavaBasics;

public class LogicalOperator {
    public static void main(String[] args) {

        // Logical AND operator (&&)
        int age = 25;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("Entry denied.");
        }

        // Logical OR operator (||)
        boolean hasTicket = false;
        boolean isVIP = true;

        if (hasTicket || isVIP) {
            System.out.println("You can watch the show.");
        } else {
            System.out.println("You cannot enter.");
        }

        // Logical NOT Operator (!)
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("You can go outside.");
        } else {
            System.out.println("Stay indoors.");
        }
    }
}
