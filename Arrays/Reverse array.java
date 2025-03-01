import java.util.*;


public class ArraysJava {


    public static void reverseArray (int numbers[]){
        int first = 0, last = numbers.length -1;


        while (first < last) {
            //swapping cha code
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first ++;
            last --;
        }    
    }
   
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6};
       
        reverseArray(numbers);


        //print reversed array
        System.out.print("Reversed array : {");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("}");
    }
}
