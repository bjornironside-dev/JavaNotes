package JavaLanguage.JavaBasics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        // used to take variable arguments as input in a method
        //if you need to take multiple arguments then keep varArgs as the last argument

        // syntax : return_type method_name(datatype... variabl_name){
        // method body
        // }

        fun(10,23,53,15);

    }

     static void fun(int...num) {
         System.out.println("the numbers you entered are:" + Arrays.toString(num));
    }
}
