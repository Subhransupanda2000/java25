package org.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighest {
    public static void main(String[] args) {

        ArrayList arr=new ArrayList<>();
        arr.add(9);
        arr.add(7);
        arr.add(3);
        arr.add(1);
        Optional res=arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        res.ifPresent(System.out::println);


    }
}
