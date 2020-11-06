package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

    public static void main(String args[])
    {
        List<String> al= Arrays.asList(
                "abc",
                "defg",
                "hijklm",
                "nopqrst"
        );

       Optional<String> length= al.stream().reduce((a, b)-> a.length()>b.length()?a:b);

        System.out.println(length);
    }
}
