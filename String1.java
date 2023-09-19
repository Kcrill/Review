package JavaProjects.Review;

import java.util.Scanner;

public class String1 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            String fin;
            String userL;
            String h1;
            String h2;
            int lngth;
            int unl = 0;


            for(int i = 1; i > unl;) {
                System.out.print("Type a word of your choosing: ");
                userL = input.next();

                lngth = userL.length();

                h1 = userL.substring(0, lngth/2);
                h2 = userL.substring(lngth/2, lngth);
                h1 = h1.toUpperCase();
                h2 = h2.toLowerCase();

                System.out.println(h1+h2);
                System.out.print("Type 'stop' if you wish to end the program.");
                fin = input.next();

                if(fin.equals ("stop"));

            }   
            
        }
    }   
}
