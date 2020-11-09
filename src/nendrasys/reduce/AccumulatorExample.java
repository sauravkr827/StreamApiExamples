package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AccumulatorExample {

    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(10,12,13,14);

        Optional<Integer> addition=al.stream().reduce((a, b)->a+b);

        System.out.println(addition);
    }
}
