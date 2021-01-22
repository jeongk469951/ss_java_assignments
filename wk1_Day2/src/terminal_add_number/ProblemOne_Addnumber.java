package terminal_add_number;


/**
 * Jeong Kim
 *
 * Class to take argument from commandline and print out sum.
 */

public class ProblemOne_Addnumber {

    /**
     *
     * @param String argument from command line
     */

    public static void main(String[] args) {

        int total = 0;

        try {
            //check for null
            nullCheck(args);

            for(String arg: args){

                //Conver string to int but if not goes to catch block
                int number = Integer.parseInt(arg);

                total = total + number;
            }
            System.out.println("Total sum is " + total);
        }

        catch(NullPointerException e){

            System.out.println("Number is required please input numbers");
        }

        catch(NumberFormatException e) {

            System.out.println("You must input a number not characters");
        }

    }

    /**
     *
     * @param String array from commandline
     * @throws NullPointerException
     */

    public static void nullCheck(String[] args) throws NullPointerException{

        if(args.length == 0){
            throw new NullPointerException();
        }

    }

}
