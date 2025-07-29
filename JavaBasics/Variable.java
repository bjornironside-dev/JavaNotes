package JavaLanguage.JavaBasics;

import java.util.Random;

public class Variable {
    public static void main(String[] args) {
        int age = 10;
        int year = 2025;
        int chocolates = 5;

        double heightInCentimetres = 162.5;
        double price = 999;
        double gpa = 8.21;

        char favoriteAlplhabet = 'M';
        char currency = '$';
        char bloodGroup = 'O';

        boolean isMarried = false;
        boolean isAdult = true;
        boolean isTall = true;

        float marks = 98.64f;
        long storeLargeIntegers = 12345678903456L;
        double storeLargeDecimalNumbers = 234567898765.3456;


        System.out.println("Age = "+age);
        System.out.println("Year = "+year);
        System.out.println("Number of Chocolates = "+chocolates);

        System.out.println();

        System.out.println("Height(cm) = "+heightInCentimetres);
        System.out.println("Price in dollars = "+price);
        System.out.println("GPA = "+gpa);

        System.out.println();

        System.out.println("Married Status = "+isMarried);
        System.out.println("Are you an adult = "+isAdult);
        System.out.println("Are you a tall person = "+isTall);
    }

    public static class RandomNumbers {
        public static void main(String[] args) {
            Random random = new Random();

            int number = random.nextInt(100) + 1;

            System.out.println(number);
        }
    }
}
