package nendrasys.others;

import java.util.Arrays;
import java.util.List;

public class SumExampleUsingMap
{
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20);
        System.out.println(al.stream().reduce((a,b)->a+b));


        System.out.println(al.stream().mapToInt(Integer::intValue).sum());


    }
}
