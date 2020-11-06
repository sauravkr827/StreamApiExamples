package nendrasys.methodReference;

import java.util.function.BiFunction;


public class Example2 {
    public static int add(int a, int b){
        return a+b;
    }
}

class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Example2::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

