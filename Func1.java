package JavaProjects.Review;

import java.util.Scanner;

public class Func1 {

    public static void calculations (int q, int d, int n, int p){

        double endprod;

        endprod = (q*0.25)+(d*0.1)+(n*0.05)+(p*0.01);

        System.out.println("Your final balance is: " + endprod );

    }
    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            System.out.println("How many quarters do you have: ");
            int q = input.nextInt();

            System.out.println("How many dimes do you have: ");
            int d = input.nextInt();

            System.out.println("How many nickels do you have: ");
            int n = input.nextInt();

            System.out.println("How many pennies do you have: ");
            int p = input.nextInt();

            calculations(q, d, n, p);

        }
    }
}
