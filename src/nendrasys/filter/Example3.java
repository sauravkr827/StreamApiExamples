package nendrasys.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example3 {

        public static void main(String args[]) {
        List<Integer> al = Arrays.asList(10, 12, 15, 45, 78);

            Stream<Integer> value=al.stream();
            Stream<Integer> value2=value.filter(a->a%2==0);
             value2.forEach(System.out::println);

    }
}
