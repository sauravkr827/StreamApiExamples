package nendrasys.map;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String args[])
    {
        List<String> stringList= Arrays.asList(

                "saurav",
                "kumar",
                "java",
                "python",
                "vb.net"

        );

        System.out.println("Convert each string to UpperCase");
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Length of each string");
        stringList.stream().map(str-> str.length()).forEach(System.out::println);
        System.out.println();

    }






}
