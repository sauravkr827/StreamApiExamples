package nendrasys.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamRelated
{
    public static void main(String args[])
    {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> sum=values.stream().reduce((a, b)->a+b);

        System.out.println(sum);
    }
}
