package nendrasys.reduce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IdentityExample

{

    public static void main(String[] args) {

        List<Integer> al = Collections.emptyList();

        Integer addition = al.stream().reduce(5, (Integer::sum));

        int sum=al.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println(addition);
    }

}
