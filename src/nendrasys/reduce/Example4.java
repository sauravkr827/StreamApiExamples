package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4
{
    public static void main(String args[]) {
        List<String> al = Arrays.asList(
                "abc",
                "defg",
                "hijklm",
                "nopqrst"
        );

    Optional<String> str =al.stream().reduce((a, b)->a+b);

        System.out.println(str);


        System.out.println("-----------------Maximum length-----------");

      Optional<String> leng=  al.stream().reduce((a, b)->a.length()>b.length()?a:b);
        System.out.println(leng);

    }
}
