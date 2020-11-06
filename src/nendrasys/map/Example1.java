package nendrasys.map;

import java.util.Arrays;
import java.util.List;

public class Example1
{
    public static void main(String args[])
    {
        List<Integer> al = Arrays.asList(10, 12, 15, 45, 78);

       /* OptionalInt sumOfValue=al.stream().mapToInt(Integer::intValue).min();*/

        /*System.out.println(sumOfValue);*/

        al.stream().map(a->a+10).forEach(System.out::println);

    }
}
