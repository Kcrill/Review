package JavaProjects.Review;

import java.util.Scanner;

public class String2 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            String frst;
            String lst;
            String lgn;
            String atmpt;

            System.out.println("Type in your first name: ");
            frst = input.next();

            System.out.println("Type in your last name: ");
            lst = input.next();

            frst = frst.substring(0,4);
            lst = lst.substring(0,4);

            lgn = lst.concat(frst);

            System.out.println("What is the password for this program:");
            atmpt = input.next();

            if(atmpt.equals(lgn)){

                System.out.println("Congrats!");
            }

            else{
                
                System.out.println("Incorrect, account locked.");
            }

        }
    }   
}
