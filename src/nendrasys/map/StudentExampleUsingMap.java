package nendrasys.map;

import com.nendrasys.filter.Student;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentExampleUsingMap
{
    public static void main(String args[])
    {
        ArrayList<Student> studentArrayList =new ArrayList<>();

        studentArrayList.add(new Student(10,"abc",1400));
        studentArrayList.add(new Student(11,"abcd",1300));
        studentArrayList.add(new Student(12,"abcde",1400));
        studentArrayList.add(new Student(13,"abcdef",1300));
        studentArrayList.add(new Student(14,"abcdefg",1600));
        studentArrayList.add(new Student(15,"abcdefgh",17000));
        studentArrayList.add(new Student(16,"abcdefghi",1800));

        studentArrayList.stream().map(a->a.getId()-10).forEach(System.out::println);

        System.out.println("--------unique fee----------");

        studentArrayList.stream().map(v->v.getFee()).distinct().forEach(System.out::println);



        System.out.println("--------MAX digits----------");


        studentArrayList.stream().map(v->v.getFee()).limit(4).forEach(System.out::println);




        System.out.println("--------Sorted----------");

        studentArrayList.stream().map(v->v.getFee()).sorted().forEach(System.out::println);



        System.out.println("--------Converted set----------");

        Set<Integer> st=studentArrayList.stream().map(v->v.getFee()).collect(Collectors.toSet());
        System.out.println(st);







    }
}
