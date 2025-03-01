import java.util.*;


public class ArraysBasics{
   
    public static int binarySearch (int numbers[], int key){
        int start = 0, end = numbers.length-1;


        while (start <= end){
            int mid = (start + end)/2; // mid is index value


            if (numbers[mid] == key){ // key found
                return mid;
            }


            if (numbers[mid] > key) { //left
                end = mid - 1;
            } else {
                //if (mid < key) - 2nd half condition
                start = mid + 1;
            }
        }


        return -1; //key not found
    }
   
    public static void main (String args[]) {
        int numbers [] = {2, 4, 6, 8, 10, 12, 14};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
       
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("The key doesn't exist in the given array");
        } else {
            System.out.println("The key is at index " + index + " in the given array");
        }		    }			}
