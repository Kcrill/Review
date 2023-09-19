package JavaProjects.Review;

public class SrchSort1 {

    public static void main (String [] args){

        int[] myarray = {5, 8, 2, 57, 45, 0, 10, 43, 56, 70};

        for(int i = 0; i < myarray.length; i++){

            if(myarray[i] == 10){
            i=i+1; 

            System.out.println("The number '10' is found in spot: " + i);
            }
        }
    } 
}
