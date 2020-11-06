package nendrasys.map;

import java.util.Arrays;
import java.util.List;

public class Example4 {

    public static void main(String args[]) {
        List<String> al = Arrays.asList(
                "abc",
                "defg",
                "hijklm",
                "nopqrst"
        );

        al.stream().map(a->a+"").forEach(System.out::println);
    }
}
