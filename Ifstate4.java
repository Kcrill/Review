package JavaProjects.Review;

import java.util.Scanner;

public class Ifstate4 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            double tanksz;
            double percfull;
            double kmperlit;
            double distance;
            double distanceleft;
            final double nxtgas = 200;
            String password;

            System.out.println("What is the password?");
            password = input.next();

            if (password.equals("car")){

            System.out.println("How big is your gas tank in litres?");
            tanksz = input.nextDouble();

            System.out.println("How full is your tank currently in percentage decimal format?");
            percfull = input.nextDouble();

            System.out.println("How many km per litre does your car get?");
            kmperlit = input.nextDouble();
            
            distance = (tanksz * percfull) * kmperlit;

            distanceleft = distance - nxtgas;

            percfull = percfull * 100;

            if(distanceleft >= 5){

                System.out.println("Size of tank: " + tanksz + "L.");
                System.out.println("Percent full: " + percfull + "%");
                System.out.println("Km per litre: " + kmperlit + "km/L.");
                System.out.println("You can go another " + distance + "km.");
                System.out.println("The next gas station is " + nxtgas +  "km away.");
                System.out.println("you can wait for the next station.");
            }

            else {

                System.out.println("Size of tank: " + tanksz + "L.");
                System.out.println("Percent full: " + kmperlit + "%");
                System.out.println("Km per litre: " + kmperlit + "km/L.");
                System.out.println("You can go another" + distance + "km.");
                System.out.println("The next gas station is 200km away.");
                System.out.println("YOU NEED TO STOP FOR GAS.");

            }


            }

            else {

                System.out.println("Incorrect password.");
            }



        }
    } 
}
