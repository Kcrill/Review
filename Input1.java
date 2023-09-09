package JavaProjects.Review;

import java.util.Scanner;

public class Input1{

    public static void main (String [] args){

        try (Scanner input = new Scanner(System.in)){

            System.out.println("What is your name?");
        
            String Name = input.next();

            System.out.println("Hello" + Name + ".");


        }
    }
}
