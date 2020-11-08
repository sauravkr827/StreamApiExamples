package nendrasys.reduce;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExampleWithAccumulator
{
    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(10,20,30,40,50);

        Optional<Integer> result=al.stream().reduce((a, b)->a+b);

       /* Optional<Integer> result=al.stream().filter(a->a%3==0).reduce((a,b)->a+b);*/

        System.out.println(result);

    }
}
