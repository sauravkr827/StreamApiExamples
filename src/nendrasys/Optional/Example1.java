package nendrasys.Optional;

import java.util.Optional;

public class Example1 {

    public static void main(String args[])
    {
        Integer[] array= new Integer[5];

        Optional<Integer> optionalInteger=Optional.ofNullable(array[3]);

        if(optionalInteger.isPresent())
        System.out.println(array[3].toString());

        if(optionalInteger.isEmpty())
        {
            System.out.println("data is not persent");
        }
    }
}
