package JavaLanguage.JavaBasics;

public class MethodOverloading {
    public static void main(String[] args) {
        area(3.5);
        area(19,2);
    }


    static void area(double radius)
    {
        double v = Math.PI * radius * radius;
        System.out.println("The area of circle is : " + v);
    }

    static void area(double length, double breadth)
    {
        double v = length * breadth;
        System.out.println("The area of rectangel is : " + v);
    }
}
