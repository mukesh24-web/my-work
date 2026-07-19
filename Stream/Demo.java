package Stream;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,10,7,8,9);
/*
        Stream<Integer> data = nums.stream(); // one time we can use it

        Stream<Integer> mappedData = data.map(n -> n*2);
        mappedData.forEach(n -> System.out.println(n));
        */

//        Stream<Integer> sortedData = data.sorted(); // return stream
//        sortedData.forEach(n -> System.out.println(n));

//        long count = data.count();
//        System.out.println(count);

//        data.forEach(n -> System.out.println(n));

//        for(int n:nums) {
//            System.out.println(n*2);
//        }
        /*
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2!=0;
            }
        };
        */

        // Predicate<Integer> predicate = (n) -> n%2!=0;

        /*
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        */

        nums.stream()
                // .filter(predicate)
                // or
                .filter(n -> n%2!=0) // filter odd value
                .sorted() // sort it
                .map(n -> n*2) // double it
                .forEach(n -> System.out.println(n));


    }
}
