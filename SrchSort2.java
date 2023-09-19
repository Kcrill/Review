package JavaProjects.Review;

public class SrchSort2 {

    public static void main (String [] args){

        int [] myarray = {23, 27, 29, 31, 35, 39, 40 , 41, 42, 52, 66, 71, 74, 75, 90, 99};

        for(int i = 0; i < myarray.length; i++){

            if(myarray[i] == 74){
            i=i+1; 

            System.out.println("The number '74' is found in spot: " + i);
            }

            if(myarray[i] == 35){
            i=i+1;

            System.out.println("The number '35' is found in spot: " + i);
            }

            if(myarray[i] ==62){
                i=i+1;

                System.out.println("The number '62' is found in spot: " + i);
         
            }
        }
    }
    
}
