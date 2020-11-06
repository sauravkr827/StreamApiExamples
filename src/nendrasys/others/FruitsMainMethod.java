package nendrasys.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FruitsMainMethod {

    public static void main(String args[])
    {
        List<Fruits> fruitsList= Arrays.asList(

                new Fruits("banana",500,2500),
                new Fruits("Cherry ",550,2700),
                new Fruits("Mango",600,2800),
                new Fruits("Papaya",650,2900),
                new Fruits("Apple",700,3000),
                new Fruits("Grapes",750,3500)

        );

        Optional<Integer> sumOfPrice=fruitsList.stream().map(Fruits::getQuantity).reduce((a, b)->a+b);

        System.out.println(sumOfPrice);


        System.out.println("-----------------");



    }
}
