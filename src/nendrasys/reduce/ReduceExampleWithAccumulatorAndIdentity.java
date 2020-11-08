package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExampleWithAccumulatorAndIdentity
{
    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("suarav","kumar","kumar");

        String s1=stringList.stream().reduce("", (a,b)->a+b);

        System.out.println(s1);
    }
}
