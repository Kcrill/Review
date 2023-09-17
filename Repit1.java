package JavaProjects.Review;

import java.util.Scanner;

public class Repit1 {
    
    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            double usern;
            double lastn;

            System.out.println("Hello, please select any number and then type it in below. :)");
            usern = input.nextDouble();

            lastn = usern + 1;

            for (double i = 1; i<lastn; i++){

                System.out.println("Here are your numbers: " + i + ".");
            }

        }
    }
}
