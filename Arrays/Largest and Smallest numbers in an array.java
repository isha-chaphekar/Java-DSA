import java.util.*;


public class ArraysJava {
   
    public static int LS_numbers(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }


            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }


        System.out.println("Smallest value in given array is : " + smallest);
        return largest;
       
    }
   
    public static void main (String args []){
        int numbers[] = {1, 3, 5, 7, 2, 10, -8};
        int result = LS_numbers(numbers);
        System.out.println("The largest number in the given array is : " + result);
    }
}
