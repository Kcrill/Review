package JavaProjects.Review;

import java.util.Scanner;

public class Func5 {

    public static void finaloutput (int lrgst){

        System.out.println("The largest number out of all is: " + lrgst);

    }
    public static void main (String [] args){

        try(Scanner input = new Scanner(System.in)){
    
		int i = 0;
		int nmb = 0;
		int lrgst = 0;

		System.out.println("Please enter 10 integers: ");

		for (i = 1; i <= 10; i++) {
			nmb = input.nextInt();

			if (i == 1) {
				lrgst = nmb;
			}

			else if (nmb > lrgst) {
				lrgst = nmb;
			}
		}
		
        finaloutput(lrgst);

        }
    }    
}
