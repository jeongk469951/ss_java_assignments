package com.ss.jkim.day05.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**&
 * @author jeong kim
 *
 * Basic lambda assignment
 *
 */
public class LambdaSort {

    public static void main(String[] args) {


        //predefined arrat and list
        String[] string_list = new String[]{"hello", "Jeong","aim","smoothstack","week1","due","eeeeeee"};
        List<Integer> integerList = Arrays.asList(314, 431,3, 5, 678, 7, 89, 3, 4, 5);



        //sort by length
        List<String> length = Arrays.stream(string_list)
                                .sorted(Comparator.comparingInt(String::length))
                                .collect(Collectors.toList());


        //sort by length but reversed
        List <String> reverseLength = Arrays.stream(string_list)
                                .sorted(Comparator.comparingInt(String::length).reversed())
                                .collect(Collectors.toList());

        //sort by Alphabet
        List <String> byAlpha = Arrays.stream(string_list)
                                .map(s->Character.toLowerCase(s.charAt(0)) + s.substring(1))
                                .sorted()
                                .collect(Collectors.toList());

        //sort by containg E
         List <String> byE = Arrays.stream(string_list)
                            .sorted(Comparator.comparing(item -> !item.contains("e")))
                            .collect(Collectors.toList());


        System.out.println(length.toString());
        System.out.println(reverseLength.toString());
        System.out.println(byAlpha.toString());
        System.out.println(byE.toString());
        System.out.println(commmaDeli(integerList));
        System.out.println(startWithLetterAandContainThree(string_list));








    }


    /**
     *
     * @param arg list of integers to be evaluated
     * @return string with comma deliminated
     */
    public static String commmaDeli(List<Integer> arg) {

        return arg.stream().map(item -> (item % 2 == 0 ? "e" : "o") + item)
                .collect(Collectors.joining(","));


    }

    /**
     *
     * @param arg list if strings to be filetered
     * @return list of strings with a and length 3
     */
    public static List<String> startWithLetterAandContainThree(String[] arg){

        return Arrays.stream(arg).filter(item -> item.length() == 3 && item.startsWith("a")).collect(Collectors.toList());

    }




}
