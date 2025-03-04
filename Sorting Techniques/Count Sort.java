import java.util.*;

public class Sorting {

    //counting sort - used for small ranges, and for positive numbers only
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //counting array - counts frequency of numbers
        int count [] = new int[largest+1];
        //largest + 1 cause largest is a number, and we have to consider an array from 0 to that number
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            //we taking array element as index and updating its count in the countArray
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++; //advancing to next position in original array
                count[i]--; //decreasing frequency count
            }
        }
    }

    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}

