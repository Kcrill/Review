package JavaProjects.Review;

import java.util.Scanner;

public class Func2 {

    public static void check(int array[], int guess){

        boolean test = false;
        for (int element : array) {
            if (element == guess) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println("Is " + guess + " present in the array: " + test);

    }

    public static void main(String [] args){

        try(Scanner input = new Scanner (System.in)){

            int array[] = {5, 35, 30, 23, 11, 8, 100, 60, 24, 4};

            System.out.println("Type in a guess for a number between 1 and 100.");
            int guess = input.nextInt();

            check(array, guess);

        }
    }    
}
