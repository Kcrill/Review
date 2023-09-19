package JavaProjects.Review;

import java.util.Scanner;

public class Func6 {

    public static boolean check(int myarray[]){

        for(int i = 0; i < myarray.length - 1; i++){

            if (myarray[i]>myarray[i+1]){

                return true;
            }
        }

        return false;

    }

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            int myarray[] = new int[10];

            for(int i = 0; i < 10; i++){

                System.out.println("Enter a number: ");
                myarray[i] = input.nextInt();
            }

            if (check(myarray)){
                
                System.out.println("It's not in order.");

                for(int i = 0; i < myarray.length - 1; i++){

                    if (myarray[i]>myarray[i+1]){
                        System.out.println(myarray[i] + "   This is the problem in the array.");
                        break;
                    }
                }

            }

            else{
                System.out.println("It is in order. :)");
            }
        }
    }
    
}
