package JavaLanguage.JavaBasics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double height;
        boolean isMarried;

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("What is your age?");
        age = sc.nextInt();

        System.out.println("What is your height?");
        height = sc.nextDouble();

        System.out.println("Are you married?");
        isMarried = sc.nextBoolean();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height(in cm) : " + height);
        System.out.println("Marriage Status : " + isMarried);

        sc.close();
    }
}
