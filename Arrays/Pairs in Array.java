import java.util.*;


public class ArraysJava {
   
    public static void PairsInArray (int numbers []){
        int totPairs = 0;
        for (int i = 0; i < numbers.length; i++){
            int current = numbers [i];
            System.out.print(current + " :  ");
            for (int j = i+1 ; j < numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")  ");
                totPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totPairs);
    }
   
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10};


        PairsInArray(numbers);
    }
}
