package JavaProjects.Review;

import java.util.Scanner;

public class Repit5 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            String contin;

            System.out.println("Hello, Type 'more' to continue.");
            contin = input.next();

            while(contin.equals ("more")){
   
                for(int i = 1; i > 0; i++){

                    if(i % 2 ==0){

                        System.out.println("Loop exec. number " + i + ".");
                        System.out.println("This is an even number.");
                        System.out.println("Type 'more' if you wish to continue.");
                        contin = input.next();
                    }

                    else{

                        System.out.println("Loop exec. number " + i + ".");
                        System.out.println("This is an odd number.");
                        System.out.println("Type 'more' if you wish to continue.");
                        contin = input.next();  
                    }
                }

            }

        }
    }   
}
