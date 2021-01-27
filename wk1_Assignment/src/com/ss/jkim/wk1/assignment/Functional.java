package com.ss.jkim.wk1.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional {


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(16,8,886,8,1);
        System.out.println(rightDigit(integerList));
        List<String> strings = Arrays.asList("ax","bb","cx");
        System.out.println(noX(strings));
        System.out.println(doubling(integerList));
    }



    public static List<Integer> rightDigit(List<Integer> arg) {

        return arg.stream()
                .map(num -> num%10)
                .collect(Collectors.toList());

    }

    public static List<Integer> doubling(List<Integer> arg) {

        return arg.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

    }

    public static List<String> noX(List<String> arg) {

        return arg.stream()
                    .map(word -> word.replaceAll("x",""))
                    .collect(Collectors.toList());
    }



}
