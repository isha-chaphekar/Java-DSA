import java.util.*;


public class ArraysJava {


    public static void printSubarrays (int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            //if we put start=numbers[i], start gets value of index say 2, and not the actual index i.e. 0.
            //so k loop starts from index 2, as we are accessing numbers[k]
            //this works fine for the first loop, but later triggers an Array Out of Bound error.


            for (int j = i; j < numbers.length; j++) {
                int end = j;


                for (int k = start; k < end; k++) {
                    System.out.println(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10};
    }
}
