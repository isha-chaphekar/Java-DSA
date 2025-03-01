import java.util.*;

// code to find largest of 3 numbers

public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); //taking user input
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        //printing input numbers on screen
        System.out.println("The input numbers are : " + A + " , " + B + " , " + C + " . ");

        //applying conditions to find largest of 3 numbers
        if ( ( A == B) && ( A == C) ){
            System.out.println("All three input numbers are equal. The largest number is " + A);
        }
        else if ( ( A >= B) && ( A >= C) ){
            System.out.println("The largest number is A, having value of " + A);
        }
        else if ( ( B >= C) ){
            System.out.println("The largest number is B, having value of " + B);
        }
        else{
            System.out.println("The largest number is C, having value of " + C);
        }
    }
}
