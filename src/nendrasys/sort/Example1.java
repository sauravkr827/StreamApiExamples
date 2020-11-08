package nendrasys.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example1
{
    public static void main(String[] args) {
        List<Integer> sl= Arrays.asList(10,20,70,4,50,1);


        System.out.println("------------Ascending order-----------------");
          sl.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("----------Descending Order-----------------");

       sl.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }
}
