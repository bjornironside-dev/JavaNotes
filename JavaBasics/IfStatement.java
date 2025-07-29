package JavaLanguage.JavaBasics;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        double gpa;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.print("Enter your GPA:");
        gpa = sc.nextDouble();

        //Syntax for if statement
        /*
        * if (condition) {
        Code to be executed if the condition is true
        }
        */

        if(age>=18)
        {
            System.out.println("You are an adult");
        }



        /* Syntax for if-else statement */
        /*if (condition) {
        Code to be executed if the condition is true
        }
        else {
        Code to be executed if the condition is false
        }
        */
        if(age<18)
        {
            System.out.println("You are a child");
        }
        else{
            System.out.println("You are not a child");
        }
        /*if (condition1) {
            // Code to be executed if condition1 is true
        } else if (condition2) {
            // Code to be executed if condition2 is true
        } else if (condition3) {
            // Code to be executed if condition3 is true
        }
        .
        .
        .
        .
        else {
            // Code to be executed if none of the above conditions are true
        }*/

        if(gpa < 4)
        {
            System.out.println("You failed the exam");
        } else if (gpa > 5 && gpa <=8) {
            System.out.println("You got average grade in the exam");
        }
        else{
            System.out.println("Congratulations! You are in top 1% of the class");
        }

        sc.close();
    }
}

