package nendrasys.Optional;

import java.util.Optional;

public class Example2 {

    public static void main(String args[]) {

        String name = null;


        Optional<String> optionalInteger = Optional.ofNullable(name);

        if (optionalInteger.isPresent())

            System.out.println(name);

        if(optionalInteger.isEmpty())
        {
            System.out.println("Hi saurav your data is"+" not availableData is not available");
        }

    }
}
