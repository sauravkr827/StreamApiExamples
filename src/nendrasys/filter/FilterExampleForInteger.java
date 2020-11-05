package nendrasys.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExampleForInteger {
    public static void main(String args[]) {
        List<Integer> al = Arrays.asList(10, 12, 15, 45, 78, 45);
        List<Integer> value=al.stream().filter(a -> a > 40).collect(Collectors.toList());

        System.out.println(value);
    }
}
