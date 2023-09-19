package JavaProjects.Review;

import java.util.Scanner;

public class Arrays1 {

    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("How many numbers do you wish to input in the array: ");
            int num = input.nextInt();

            int arr[] = new int[num];

            int sum = 0;

            for (int i = 0; i<num; i++){

            System.out.print("Enter number: ");
            arr[i] = input.nextInt();

            sum = sum+arr[i];
            }


            System.out.println("The sum of the numbers in your array are:  " + sum);

        }
    }   
}
