package JavaProjects.Review;

import java.util.Arrays;

public class Func4 {

    public static void rvrswrk(int[] array){

        int[] rvrsdarr = new int[array.length];
        int indx = 0;

        for(int i = array.length - 1; i>=0; i--){

            rvrsdarr[i]=array[indx];

            indx++;
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("The reversed version is: " + Arrays.toString(rvrsdarr));

    }

    public static void main(String [] args){

        int[] myarray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        rvrswrk(myarray);
    }
    
}
