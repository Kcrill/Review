package JavaProjects.Review;

import java.util.Scanner;

public class Output2 {

    public static void main (String [] args){

    

        try (Scanner Input = new Scanner(System.in)){


            int week = 7;
            int minutes = 1440;
    
            int totalminutes = week * minutes;

            System.out.println("There are" + totalminutes + " minutes in a week.");
 
            
        }
    }
}
