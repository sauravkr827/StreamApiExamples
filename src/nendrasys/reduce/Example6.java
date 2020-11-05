package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example6 {

    public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);


        Optional<Integer> v = Optional.ofNullable(stringList.stream().reduce((first, second) -> second).orElse(null));

        System.out.println(v);
    }
}
