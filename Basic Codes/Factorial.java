import java.util.*;


// factorial calculation


// NOTE : Using this code, we can calculate factorial for numbers upto 31 only. After that, the value of factorial goes beyond the range of int datatype.


public class JavaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int factnum = sc.nextInt();
       
        int res = 1;


        if(factnum < 0){
            System.out.println("Invalid input. Factorial can be calculated for positive numbers only.");
        } else {
            for(int i = factnum; i >= 1; i--){
                res = res * i;
            }


            System.out.println(factnum + "! = " + res);
        }
    }
}
