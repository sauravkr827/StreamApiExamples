package nendrasys.foreach;

import java.util.Arrays;
import java.util.List;

public class Example2
{

    public static void main(String args[])
    {
        List<Integer> stringList= Arrays.asList(10,12,15,45,78,98);

        stringList.forEach(System.out::println);
    }
}



