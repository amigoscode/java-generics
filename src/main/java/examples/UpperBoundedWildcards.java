package examples;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Upper Bounded Wildcards
        List<Double> list1 = Arrays.asList(1.9, 1.3);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        printNumbers(list1);
        printNumbers(list2);
        printNumbers(list3);
    }

    static void printNumbers(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
