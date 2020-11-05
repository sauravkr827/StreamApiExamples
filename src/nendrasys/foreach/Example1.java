package nendrasys.foreach;

import java.util.Arrays;
import java.util.List;

public class Example1 {

    public static void main(String args[])
    {
        List<String> stringList= Arrays.asList("abc","def","ghi","jkl");

        stringList.forEach(System.out::println);

    }
}
