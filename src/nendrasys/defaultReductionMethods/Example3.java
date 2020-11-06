package nendrasys.defaultReductionMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3
{
    public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);
        //Maximum value
       Optional<Integer> integer=  stringList.stream().min((a, b)-> a+b);
       System.out.println(integer);



        //Minimum value
        Optional<Integer> integ=  stringList.stream().min((a, b)-> a-b);
        System.out.println(integ);
    }
}
