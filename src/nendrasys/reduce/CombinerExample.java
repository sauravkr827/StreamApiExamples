package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CombinerExample {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(10, 12, 13, 14);

        List<String> numbers = Arrays.asList("one", "two", "three", "four", "five");
        int length = numbers.stream()
                .reduce(0, (accumulatedInt, str) -> accumulatedInt + str.length(),
                        (accumulatedInt, accumulatedInt2) -> accumulatedInt + accumulatedInt2);



        /*     int length = asList("str1", "str2").stream()
            .reduce(0, (accumulatedInt, str) -> accumulatedInt + str.length());*/

        System.out.println(length);
    }
}
