package nendrasys.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example2
{
    public static void main(String[] args)
    {


        List<String> list = Arrays.asList("apple", "ball",
                "back", "aero", "cat");

        System.out.println("-------------Asscending order-----------");
        list.stream().sorted().forEach(System.out::println);


        System.out.println("----------Descending order-----------------");

        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
