package JavaProjects.Review;

import java.util.Scanner;

public class Func3 {

    public static void check(String userinp){

        int lngth = userinp.length() - 1;
        int i = 0;

        while(i < lngth){

            if(userinp.charAt(i) != userinp.charAt(lngth)){

                System.out.println(userinp + " is not a palindrome.");
                System.exit(0);
            }

            i++;
            lngth--;
        }

        System.out.println(userinp + " is a palindrome.");
    }
    
    public static void main(String [] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("Enter a word that you think is a palindrome and we will check for you. :)");
            String userinp = input.next();

            check(userinp);
            
        }
    }
}
