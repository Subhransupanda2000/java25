package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(9);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        List<Integer> li=arr.stream().filter(i->i % 2==0).collect(Collectors.toList());
        for (Integer l:li)
        {
            System.out.println(l);
        }

    }
}
