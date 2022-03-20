package com.chang;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SteamTest2 {

    public static void main(String[] args) {
        Integer a2[]={151,5156,15,48,156,4545,45,1,6,465,98,454,98,5,89,54,98,52651,5484};

        Stream<Integer> stream4 = Stream.of(a2);
        Object[] ss =  stream4.filter(i -> i % 2 == 0).toArray();

        System.out.println(Arrays.toString(ss));
        System.out.println("________________________________________");

        Stream<Integer> stream5 = Stream.of(a2);
       // stream5.forEach(System.out::println);
       stream5.filter((i)->i<50).forEach((i)->System.out.print(i+" "));
        int sum = Stream.of(a2).filter((i) -> i < 50).mapToInt(Integer::new).sum();
        System.out.println(sum);

        Stream<Integer> a21 = Stream.of(a2);
        long count = a21.count();
        System.out.println(count);

        List<String> list =new ArrayList<>();

        list.forEach(System.out::println);




    }
}
