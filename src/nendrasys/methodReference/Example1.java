package nendrasys.methodReference;

import java.util.Arrays;
import java.util.List;

public class Example1 {


        public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);

            System.out.println("------------without method reference----------");

            stringList.forEach(value-> System.out.println(value));


            System.out.println("----------with method reference-------------");

            stringList.forEach(System.out::println);

    }
}
