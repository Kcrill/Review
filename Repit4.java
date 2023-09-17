package JavaProjects.Review;

import java.util.Scanner;

public class Repit4 {

    public static void main (String [] args){

        try(Scanner input = new Scanner (System.in)){

            int i =0;
            int num =0;
            int limit;

            System.out.println("What is the limit.");
            limit = input.nextInt();
    
            String  primeNumbers = "";
     
            for (i = 1; i <= limit; i++)         
            { 		  	  
               int counter=0; 	  
               for(num =i; num>=1; num--)
           {
                  if(i%num==0)
              {
              counter = counter + 1;
              }
           }
           if (counter ==2)
           {
              //Appended the Prime number to the String
              primeNumbers = primeNumbers + i + " ";
           }	
            }	
            System.out.println(primeNumbers);

        }
    }  
}
