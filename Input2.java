package JavaProjects.Review;

import java.util.Scanner;

public class Input2 {

    public static void main (String [] args){

        try (Scanner input = new Scanner (System.in)){

            System.out.println("Type your first number:");

            int num1 = input.nextInt();

            System.out.println("Type your second number:");

            int num2 = input.nextInt();

            int total = num1 + num2;

            System.out.println("The total of your two numbers is " + total + ".");

        }
    }
    
}