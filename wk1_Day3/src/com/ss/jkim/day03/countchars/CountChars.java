package com.ss.jkim.day03.countchars;

import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jeong Kim
 *
 * This class takes in character as argument and prints number of occurences from specified file
 *
 */


public class CountChars {


    /**
     *
     * @param args char from command line
     *
     * opens the text file from util and checks for null values of argument and pass the char to
     * compute_number method
     *
     */
    public static void main (String[] args) {

        var validate = new CountChars();

        String some = "fff";



        try(BufferedReader bufRe = new BufferedReader(new FileReader("/Users/jeongkim/Desktop/smmothstack/java/assignments/wk1_Day3/util/myfile.txt"))){

            nullCheck(args);

            char character = args[0].charAt(0);

            validate.compute_number(bufRe,character);

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * @param arg takes in bufferedreader to iterate the file
     * @param alpha takes in character to count
     * @throws IOException
     * counts number of occurences by using filter function and count which will be added to count variable
     * and be printed
     */
    public void compute_number(BufferedReader arg, char alpha) throws IOException{

        long count = 0;

        String line = arg.readLine();
        while(line != null) {
            double count_line = line.chars().filter(ch -> ch == alpha).count();

            count += count_line;

            line = arg.readLine();
        }

        System.out.println("Number of occurences of \""+alpha+ "\" is "+count);


    }

    //Check if argument is null or not and throws exception
    private static void nullCheck(String[] args) throws NullPointerException{

        if(args.length == 0){
            throw new NullPointerException();
        }

    }

}
