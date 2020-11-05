package nendrasys.sum;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Example1
{
    public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);

        System.out.println("Sum of all the value");

       Integer integer= stringList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(integer);

        System.out.println("-----------max value------------");
        OptionalInt integer1= stringList.stream().mapToInt(Integer::intValue).max();
        System.out.println(integer1);

        System.out.println("------------min value------------");
        OptionalInt integer2= stringList.stream().mapToInt(Integer::intValue).min();
        System.out.println(integer2);

        System.out.println("---------------Average value----------");
        OptionalDouble integer3= stringList.stream().mapToInt(Integer::intValue).average();
        System.out.println(integer3);

        System.out.println("----------count value-------------");
        Integer integer4= Math.toIntExact(stringList.stream().mapToInt(Integer::intValue).count());
        System.out.println(integer4);
    }
}
