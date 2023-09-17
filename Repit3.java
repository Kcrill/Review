package JavaProjects.Review;

import java.util.Scanner;

public class Repit3 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            int usern;
            int limit;
            
            System.out.println("What multiplication table do you want?");
            usern = input.nextInt();

            System.out.println("What is going to be the limit for this table.");
            limit = input.nextInt();

            for(int i = 0; i <=limit; i++){
                
                System.out.println(usern + " * " + i + " = " + (usern * i));

            }

        }
    }    
}
