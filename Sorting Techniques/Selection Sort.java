import java.util.*;

public class Sorting {
    
    public static void selectionSort (int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        }

    public static void printArray (int arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
    public static void main(String[] args) {
        int arr [] = {4, 3, 5, 1, 2};
        selectionSort(arr);
        printArray(arr);
    }
    
}
