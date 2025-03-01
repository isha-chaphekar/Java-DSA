import java.util.*;


public class ArraysJava {
   
    public static void update (int marks[], int unchanged){
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }


        unchanged = 9;
    }


    public static void main (String args[]){
        int marks[] = {96, 98, 99};
        int unchanged = 5;


        update(marks, unchanged);
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }


        System.err.println(unchanged);
    }
}
