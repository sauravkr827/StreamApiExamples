package nendrasys.filter;

import java.util.ArrayList;

public class StudentFilterationBasedOnName
{

    public static void main(String args[]) {

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student(1, "saurav", 1500));
        studentArrayList.add(new Student(2, "kumar", 5000));
        studentArrayList.add(new Student(3, "kumar", 15007));
        studentArrayList.add(new Student(4, "kumar", 35000));
        studentArrayList.add(new Student(5, "kumar", 25009));

        studentArrayList.stream().filter(a-> a.getName().endsWith("r") && a.getFee()>30000).forEach(System.out::println);

    }
}
