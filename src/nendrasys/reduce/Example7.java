package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example7
{

    public static void main(String args[]) {
        List<String> al = Arrays.asList(
                "abc",
                "defg",
                "hijklm",
                "nopqrst"
        );

        Optional<String> str = al.stream().reduce((a, b) -> a + "--" + "Saurav" + "--" + b);
        System.out.println(str);
    }


}
