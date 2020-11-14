package examples;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {
    public static void main(String[] args) {
//      List<E>
        List<String> names =
                new ArrayList<>();
        names.add("1");
        List<Integer> numbers =
                new ArrayList<>();
        numbers.add(1);

//      Map<K, V>
        Map<String, String> map =
                new HashMap<>();

        Map<Point, Double> map2 =
                new HashMap<>();

        /*
            Naming Convention
            E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
            K – Key (Used in Map)
            N – Number
            T – Type
            V – Value (Used in Map)
         */
    }
}
