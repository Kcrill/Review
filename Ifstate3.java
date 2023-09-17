package JavaProjects.Review;

import java.util.Scanner;

public class Ifstate3 {
    
    public static void main(String [] args){

        try(Scanner input = new Scanner(System.in)){

            String gender;
            int year;
            final int CurYear = 2023;
            int age;

            System.out.println("Hi, this message is from a soccer team questionaire.");
            System.out.println("Type 'f' if you are female and type 'm' if your're a male.");

            gender = input.next();

            if (gender.equals ("m")){

                System.out.println("Sorry, this is an all girls soccer team. :(");
            }

            else if (gender.equals("f")){

                System.out.println("What year are you born in?");

                year = input.nextInt();

                age = CurYear - year;

                if (age >= 10 && age <= 12){

                    System.out.println("Congratulations you are eligible for the team!");

                }

                else {

                    System.out.println("I'm sorry you do not qualify to play for this team.");

                }

            }
            
        }
    }
}
