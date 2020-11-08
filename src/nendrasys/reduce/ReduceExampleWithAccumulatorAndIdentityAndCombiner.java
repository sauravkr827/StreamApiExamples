package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExampleWithAccumulatorAndIdentityAndCombiner
{
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("java","python","spring","hybris");
       Integer s= stringList.stream().reduce(0,(a,b)->a+b.length(),Integer::sum);
        System.out.println(s);
    }
}
