package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2
{

    public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);

        Optional<Integer> value=stringList.stream().reduce((a,b)->a>b?a:b);

        System.out.println(value);
    }
}
