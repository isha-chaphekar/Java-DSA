import java.util.*;

//Print subarrays, find max and min subarray sum - Brute force method

public class ArraysJava {
   
    public static void printSubarrays (int numbers []){
        int totSubarrays = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i <numbers.length; i++){
            int start = i;
            System.out.println(numbers[i] + " : ");
            for (int j = i; j < numbers.length; j++){
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.println("  |Array sum = " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                totSubarrays++;
                System.out.println();
            }
            System.out.println("--x--");
        }
        System.out.println("Total subarrays = " + totSubarrays);
        System.out.println("Max sum : " + maxSum);
        System.out.println("Min sum : " + minSum);
    }
   
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);   	  }			}
