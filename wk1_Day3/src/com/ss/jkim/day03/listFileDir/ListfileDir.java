package com.ss.jkim.day03.listFileDir;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author jeongkim
 *
 * This class takes arg of path of directory and prints all directories and files
 */



public class ListfileDir {


    public static void main(String[] args) {

        String path;
        File mainDir;


        //try clause to check for null values and valid path and executes accordingly
        try{

            nullCheck(args);
            path = args[0];


            mainDir = new File(path);
            validDircheck(mainDir);


            File arr[] = mainDir.listFiles();
            listallFileDir(arr,0,0);



        }
        catch(NullPointerException e ){

            System.out.println("please enter a path for directory");
        }
        catch(FileNotFoundException e) {

            System.out.println("Wrong directory");
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }



    private static void listallFileDir(File arr[], int index, int level) {

        // terminate condition
        if(index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if(arr[index].isFile())
            System.out.println(arr[index].getName());

            // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");

            // recursion for sub-directories
            listallFileDir(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        listallFileDir(arr,++index, level);


    }


    //Throws exception when its not valid directory and type is not directory
    private static void validDircheck(File maindir) throws FileNotFoundException {

        if(!maindir.exists() && !maindir.isDirectory()){

            throw new FileNotFoundException();
        }

    }


    //Check if argument is null or not and throws exception
    private static void nullCheck(String[] args) throws NullPointerException{

        if(args.length == 0){
            throw new NullPointerException();
        }

    }


}
