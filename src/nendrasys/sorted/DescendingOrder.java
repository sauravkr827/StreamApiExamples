package nendrasys.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder
{
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(10,5,48,12,45,45,70,4);

        //Integer descending order
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //String Descending order
        List<String> stringList=Arrays.asList("saurav","kumar","chiku");

        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
