package nendrasys.map;

import java.util.Arrays;
import java.util.List;

public class Example2 {

    public static void main(String args[])
    {
        List<Integer> al = Arrays.asList(10, 12, 15, 45, 78);

        al.stream().map(a->a/2).forEach(System.out::println);

    }
}
