package JavaProjects.Review;

import java.util.Scanner;

public class String4 {

    public static void main (String [] args){

        try (Scanner input = new Scanner (System.in)){

            String contin;
            String rvrs = "";

            System.out.println("Type 'continue' ");
            contin = input.next();

            while(contin.equals("continue")){

                System.out.println("Type an animal's name: ");
                String anim = input.next();

                for(int i = anim.length() - 1; i >= 0; i--){

                    rvrs = rvrs + anim.substring(i,i+1);
                }

                System.out.println(rvrs);

                System.out.println("Type 'continue' if you wish to continue.");
                contin = input.next();
            }
        }
    }
    
}
