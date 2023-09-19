package JavaProjects.Review;

import java.util.Scanner;

public class String5 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            String contin;

            System.out.println("Type 'continue' ");
            contin = input.next();

            while(contin.equals("continue")){

                System.out.println("Enter a word and we will check if it ends in 'tion'. ");
                String wrd = input.next();

                if(wrd.endsWith("tion")){

                    System.out.println("The word indeed ends with 'tion'. ");
                }

                else {
                    System.out.println("The word does not end in 'tion'. ");
                }

                System.out.println("Type 'continue' if you wish to continue.");
                contin = input.next();
            }

        }
    }  
}
