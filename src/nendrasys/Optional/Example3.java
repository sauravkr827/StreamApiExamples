package nendrasys.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3
{
    public static void main(String args[])
    {

//Without Using Optional Class



       /*
                String[] str = new String[10];
                //Getting the substring
                String str2 = str[9].substring(2, 5);
                //Displaying substring
                System.out.print(str2);


 */
/*
        Exception in thread "main" java.lang.NullPointerException
        at Example.main(Example.java:5)   */







        //Using Optional Class

        String[] str = new String[10];
        //Getting the substring
        Optional<String> optionalS=Optional.ofNullable(str[9]);
        //Displaying substring
        System.out.print(optionalS);



    }
}


