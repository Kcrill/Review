package JavaProjects.Review;

import java.util.Scanner;

public class Input4 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("Enter a number of yoru choice:");
            int num1 = input.nextInt();

            int random = (int) (Math.random()*10);

            int fin = num1 + random;

            System.out.println("The final number is " + fin + ".");

        }
    }    
}
