package JavaProjects.Review;

import java.util.Scanner;

public class Input3 {

    public static void main(String [] args){

        try(Scanner input = new Scanner (System.in)){ 

            System.out.println("Enter your first mark: ");
            int mrk1 = input.nextInt();

            System.out.println("Enter your second mark: ");
            int mrk2 = input.nextInt();

            System.out.println("Enter your third mark: ");
            int mrk3 = input.nextInt();

            System.out.println("Enter your fourth mark: ");
            int mrk4 = input.nextInt();

            System.out.println("Enter your fifth and last mark: ");
            int mrk5 = input.nextInt();

            int avg = (mrk1 + mrk2 + mrk3+ mrk4 +mrk5) / 5;

            System.out.println("Your average of the five marks that you submitted is " + avg + ".");
        }
    }    
}
