package JavaProjects.Review;

import java.util.Scanner;

public class Ifstate2 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){
            
            double pretotal;
            final double txhst =  1.13;
            final double disc1 = 0.9;
            final double disc2 = 0.8;
            double fin;

            System.out.println("Today we have discounts, 10% off purchases of $10 or lower, and 20% off purchases greater than $10. ");
            System.out.println("Hello, what is your total?");
            pretotal = input.nextDouble();

            if (pretotal <= 10){

                fin = (pretotal * disc1) * txhst;

                System.out.println("Your final total after tax is: " + fin + ".");
            }

            else if (pretotal > 10){

                fin = (pretotal * disc2) * txhst;

                System.out.println("Your final total after tax is:" + fin + ".");

            }

        }
    }  
}
