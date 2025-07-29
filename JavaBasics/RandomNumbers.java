package JavaLanguage.JavaBasics;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        /* if we want to generate a random integer then use this
        Returns: a random int value (can be negative or positive).
        Random rand = new Random();
        int num = rand.nextInt();  // Example: 102349821 or -83438293
        */

        /* nextInt(bound)
        Returns: a random int from 0 (inclusive) to bound (exclusive).
        int num = rand.nextInt(10);  // Example: 0 to 9
        */

        /*
        nextInt(origin,end)
        random integer between origin (inclusive) and end (exclusive)
        */

        /* nextDouble()
        Returns: a random double between 0.0 (inclusive) and 1.0 (exclusive).
        double num = rand.nextDouble();  // Example: 0.5373829
         */

        /*
        setSeed(long seed)
        Used to: set the initial seed for the random generator. Same seed means same sequence of random numbers.
        rand.setSeed(12345L);
        Useful when you need repeatable/random but deterministic behavior (e.g., testing).
        */

        /*
        ✅ Key Idea:
        If you create two Random objects using the same seed value, and you call the same random methods in the same
        order, both objects will produce exactly the same sequence of random numbers.

        Random r1 = new Random(12345);
        Random r2 = new Random(12345);

        System.out.println(r1.nextInt());  // Same output as r2.nextInt()
        System.out.println(r2.nextInt());  // Same output as r1.nextInt()

        Both r1 and r2 will give the same results, because:
        They start with the same seed.
        The same methods are called in the same order.

        import java.util.Random;

        public class SameSeedExample {
            public static void main(String[] args) {
                // Create two Random objects with the same seed
                Random random1 = new Random(42);
                Random random2 = new Random(42);

                System.out.println("Random numbers from random1:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(random1.nextInt(100));  // Random int from 0 to 99
                }

                System.out.println("\nRandom numbers from random2:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(random2.nextInt(100));  // Should match the ones from random1
                }
            }
        }

        🧾 Output:
        You’ll get the same numbers in both lists. For example:

        Random numbers from random1:
        14
        74
        5
        48
        3

        Random numbers from random2:
        14
        74
        5
        48
        3

        */

        /*
        🔄 If You Need a Range (e.g. 50–99):
        int randomNumber = random.nextInt(max - min + 1) + min;
        int num = random.nextInt(50) + 50;  // (99 - 50 + 1 = 50)
        */
    }
}
