package com.ss.jkim.day03.appendtext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jeong Kim
 *
 * This class appends text to existing file
 *
 *
 */

public class Appendtext {


    public static void main(String[] args) {
        Appendtext fwrEx = new Appendtext();
        fwrEx.writeWithFiles("Hello SmoothStack\n");
    }


    //opens the printwriter to appends text to given directory
    public void writeWithFiles(String data) {
        try (FileWriter f = new FileWriter("/Users/jeongkim/Desktop/smmothstack/java/assignments/wk1_Day3/util/myfile.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);)
        {

             p.println("appending text into file");
             p.println(data);

        }

        catch (IOException i)

            { i.printStackTrace(); }

    }

}
