package JavaProjects.Review;

import java.util.Scanner;

public class Input5 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("Enter your full name:");
            String name = input.next();

            System.out.println("Enter the amount of hours you worked:");
            double hours = input.nextDouble();

            System.out.println("Enter the amount of money you make per hour:");
            double wage = input.nextDouble();

            double grospay = wage * hours;

            double cpp = 0.035 * grospay;
            cpp = Math.round(cpp*100)/100;

            double ei = 0.0295 * grospay;
            ei = Math.round(ei*100)/100;

            double it = 0.25 * grospay;
            it = Math.round(it*100)/100;

            double netpay = grospay - (cpp+ ei + it);
            netpay = Math.round(netpay*100)/100;

            System.out.println("The CPP of your gross pay is " + cpp + ".");

            System.out.println("The EI of your gross pay is " + ei + ".");
            
            System.out.println("The Income tax of your gross pay is " + it + ".");

            System.out.println(name + "'s final net pay is " + netpay);


            
        }   
    }    
}
