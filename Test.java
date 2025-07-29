package JavaLanguage;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.getFirst().add(1);
        list.getFirst().add(1);
        list.getFirst().add(1);
        list.getFirst().add(1);
        list.getFirst().add(1);

        list.get(1).add(2);
        list.get(1).add(2);
        list.get(1).add(2);
        list.get(1).add(2);
        list.get(1).add(2);

        list.get(2).add(3);
        list.get(2).add(3);
        list.get(2).add(3);
        list.get(2).add(3);
        list.get(2).add(3);

        System.out.println(list);
    }

}
