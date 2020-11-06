package nendrasys.reduce;

import nendrasys.others.Fruits;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingReduce {

    public static void main(String args[])
    {

        List<Fruits> fruitsList= Arrays.asList(

                new Fruits("Banana",500,2500),
                new Fruits("Cherry ",550,2700),
                new Fruits("Mango",600,2800),
                new Fruits("Papaya",650,2900),
                new Fruits("Apple",700,3000),
                new Fruits("Grapes",750,3500)

        );


        //get salary by ascending order


        List<Integer> sortedSalary=fruitsList.stream().map(Fruits::getPrice).sorted().collect(Collectors.toList());

        System.out.println("--------------------asending order------------");
        System.out.println(sortedSalary);

        System.out.println("-----------------descending order quentity ---------------");
        List<Integer> al=fruitsList.stream().map(Fruits::getQuantity).sorted((a,b)->((a<b)?1:(a>b)?-1:0)).collect(Collectors.toList());

        System.out.println(al);

        System.out.println("-----------------descending order name ---------------");

        List<String> sortedSalary1= fruitsList.stream().map(Fruits::getName).sorted((a,b)->(-a.compareTo(b))).collect(Collectors.toList());

        System.out.println(sortedSalary1);



    }
}
