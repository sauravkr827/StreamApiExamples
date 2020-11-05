package nendrasys.reduce;

import java.util.Arrays;
import java.util.List;

public class Example5 {

    public static void main(String args[]) {
        List<Integer> stringList = Arrays.asList(10, 12, 15, 45, 78, 98);

        Integer value=stringList.stream().reduce(0,(a,b)->a+b);

        System.out.println(value);

        System.out.println("---------------using method reference------------");

        int leng=stringList.stream().reduce(0,Integer::sum);
        System.out.println(leng);
    }
}
