package com.ss.jkim.wk1.assignment;

import java.util.stream.IntStream;

public class Lambdas {

    public static void main(String[] args){

        System.out.println(isOdd().apply(4));
        System.out.println(isPrime().apply(5));
        System.out.println(isPalindrome().apply(898));
        System.out.println(isOdd().apply(3));
        System.out.println(isPrime().apply(12));


    }


    public static PerformOperation isOdd() {

        return num -> num%2 != 0 ? "ODD" : "EVEN";

    }

    public static PerformOperation isPrime() {

        return number -> number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0)) ? "PRIME" : "COMPOSITE";

    }

    public static PerformOperation isPalindrome() {

        return num -> Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString()) ? "PALINDROME" : "NOT PALINDROME";

    }



}
