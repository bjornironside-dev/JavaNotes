package JavaLanguage.JavaBasics;

public class BreakAndContinue {
    public static void main(String[] args) {

        /*🔄 Loop Control Statements*/

        //🔹 break - Exits the loop immediately.
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        //🔹 continue - Skips the current iteration and goes to the next one.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

//        ✅ Labelled Loops
//        Used with break or continue to control outer loops:

//        outerLoop:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (j == 1) break outerLoop;
//                System.out.println("i=" + i + " j=" + j);
//            }
//        }
    }
}
