package JavaLanguage.JavaBasics;
import java.lang.String;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter your first name");
        firstName = sc.next();

        System.out.println("Enter your Last name");
        lastName = sc.next();

        //String Methods
        //1.length() - Returns the number of characters in the string. Eg - "Java".length() → 4
        System.out.println("The length of your first name is : " + firstName.length() );
        System.out.println("The length of your last name is : " + lastName.length() );

        //2.charAt(int index) - Returns the character at specific index. Eg - "Java".charAt(1) → a
        System.out.println("The character at second position of your first name is " + firstName.charAt(1));
        System.out.println("The character at first position of your last name is " + lastName.charAt(0));

        //3.substring(int begin) - Returns substring from given index to end. Eg - "Java".substring(2) → "va"
        System.out.println("One of the Substrings of your first name is : " + firstName.substring(1));

        //4.substring(int begin, int end) - Returns substring from  begin to end-1. Eg - "Java".substring(1.3)
        System.out.println("One of the Substring of your last name is : " + lastName.substring(1,3));

        //5.contains(CharSequence) - Checks if a sequence is present in the string. Eg - "Meet.contains("ee") → true"
        System.out.println("Checking if \"ee\" is present or not in your first name : " + firstName.contains("ee"));

        //6.equals(String) - Checks if two string are exactly equal (case-sensitive). Eg - "Java".equals("java") → false
        System.out.println("Checking if \"parent\" matches \"Parent\" : " + "parent".equals("Parent"));

        //7.equalsIgnoreCase(String) - Compares strings, ignoring case. Eg - "Java".equalsIgnoreCase("java") → true
        System.out.println("Comparing two string \"malhar\" and \"MaLhAR\" ignoring the case : " + "malhar".equalsIgnoreCase("MaLhAR"));

        //8.toLowerCase() - Converts all the characters in string to lowercase. Eg - "Java".toLowerCase() → "java"
        System.out.println("Converting your first name into lower case : " + firstName.toLowerCase());

        //9.toUpperCase() - Converts all the characters in string to uppercase. Eg - "Java".toUpperCase() → "java"
        System.out.println("Converting your first name into Upper case : " + firstName.toUpperCase());

        //10.trim() - Removes all the whitespaces from beginning and end. Eg - " hello ".trim() → "hello"
        System.out.println("String : \" hello \" : " + " hello ".trim());

        //11.replace(char,char) - Replaces all occurrence of a character. Eg - "abc".replace('a', 'x') → "xbc"
        System.out.println("String : \"fool\" : " + "fool".replace('o','e'));

        //12.replace(String,String) - Replace all occurrence of a string. Eg - "apple".replace("p", "b") → "abble"
        System.out.println("String : \"coconut\" : " + "coconut".replace("coco","pea"));

        //13.startsWith(String) - Checks if the string starts with a prefix. Eg - "Hello".startsWith("He") → true
        System.out.println("String : \"feet\" checking if the words starts with fe : " + "feet".startsWith("fe"));

        //14.endsWith(String) - Checks if the string ends with a suffix. Eg - "Hello".endsWith("lo") → true\
        System.out.println("String : \"Malhar\" checking if the string ends with har : "+ "Malhar".endsWith("har"));

        //15.indexOf(String) - Returns the first index of substring. Eg - "banana".indexOf("na") → 2
        System.out.println("String : \"banana\" returning the first occurrence of \"na\" : " + "banana".indexOf("na"));

        //16.lastIndexOf(String) - Returns the last index of substring. Eg - "banana".lastIndexOf("na") → 4
        System.out.println("String : \"banana\" returning the last occurrence of \"na\" : " + "banana".lastIndexOf("na"));

        //17.isEmpty() - Checks if the string is empty(length == 0). Eg - "".isEmpty() → true
        System.out.println("String : \"\" now checking if it is empty or not : " + "".isEmpty());

        //18.isBlank() - Checks if the string is empty or only whitespace. Eg - " ".isBlank() → true
        System.out.println("String : \" \" now checking if it is empty or only whitespace : " + " ".isBlank());

        //19.concat(String) - Joins two strings(also + operator can be used). Eg - "Hello".concat("World") → "HelloWorld"
        System.out.println("String : \"banana\" and \"apple\" concatenating both strings :" + "banana".concat("apple"));




    }
}
