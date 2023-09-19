package JavaProjects.Review;

import java.util.Arrays;

public class SrchSort4 {

    public static void main (String [] args){

        int [] myarray = {9, 5, 11, 6, 4, 10, 7};

        Arrays.sort(myarray);

        System.out.println("Sorted array: ");

        for(int i = 0; i < myarray.length; i++){

            System.out.println(myarray[i]);
        }
    }
    
}
