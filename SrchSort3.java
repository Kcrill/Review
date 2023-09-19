package JavaProjects.Review;

public class SrchSort3 {

    public static void bubble(int[] myarray){
        int n = myarray.length;  
        int tmp = 0;  
         for(int i = 0; i < n; i++){  
                 
            for(int j = 1; j < (n - i); j++){  
                          
                if(myarray[j - 1] > myarray[j]){  
  
                    tmp = myarray[j - 1];  
                    myarray[j - 1] = myarray[j];  
                    myarray[j] = tmp;  
                }                
            }  
         }  
    } 
    
    public static void main (String [] args){

        int [] myarray = {5, 10, 5, 4, 9, 7};

        System.out.println("Array Before Sort"); 

        for(int i = 0; i < myarray.length; i++){ 

            System.out.print(myarray[i] + " ");  
        } 
        
        bubble(myarray);

        System.out.println("Array After Sort"); 

        for(int i = 0; i < myarray.length; i++){  

            System.out.print(myarray[i] + " ");
        }
    }
}
