package ss_assignment1b;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        final int min = 1;
        final int max = 100;

        final int random = min + (int) (Math.random() * ((max - min) + 1));

        Scanner scanner = new Scanner(System.in);


        int value;
        int wrong_count = 0;

        while (true) {

            System.out.print("Guess a number betweem 1-100: ");
            value = scanner.nextInt();
            
            if ((random - 10) <= value && value <= (random + 10)) {
                System.out.println("Random number is " + random);
                break;
            }

            wrong_count++;

            if (wrong_count == 5) {

                System.out.println("Sorry random number was " + random);
                break;

            }

            System.out.println("Keep trying!");
        }
    }
}

