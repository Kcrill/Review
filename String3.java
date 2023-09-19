package JavaProjects.Review;

import java.util.Scanner;

public class String3 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            String w1;
            String w2;
            String w3;
            int lngth;
            int avg;

            System.out.println("Enter a word:");
            w1 = input.next();
            
            System.out.println("Enter a word:");
            w2 = input.next();

            System.out.println("Enter a word:");
            w3 = input.next();

            lngth = w1.length() + w2.length() + w3.length();

            avg = lngth / 3;

            System.out.println("the total number of letters is: " + lngth);
            System.out.println("The average word length is: " + avg);
            
        }
    }   
}
