package nendrasys.sorted;

import java.util.Arrays;
import java.util.List;

public class AssendingOrder
{

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(10,5,105,780,80);

        list.stream().sorted().forEach(System.out::println);


    }
}
