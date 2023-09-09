package JavaProjects.Review;

import java.util.Scanner;

public class Ifstate1 {

    public static void main(String[] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("Hello, what is your're name?");
            String name = input.next();

            if (name.equals("Bob") || name.equals("Alice"))
            {
                System.out.println("Hello, " + name + "." );
            }
            else
            {
                System.out.println("Sorry, I do not recognize your name.");
            }
            


        }
    } 
}
