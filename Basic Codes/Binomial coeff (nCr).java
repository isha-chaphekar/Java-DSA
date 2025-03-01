// factorial function


import java.util.*;


public class JavaBasics {
   
    public static int biCoeff(int num_n, int num_r){
        int n_fact = factorial(num_n);
        int r_fact = factorial(num_r);
        int n_rfact = factorial(num_n - num_r);


        int B_C = (n_fact)/(r_fact * n_rfact);
        return B_C;
    }
   
    public static int factorial(int num){
        int fact = 1;


        for (int i = num; i >= 1; i--){
            fact = fact * i;
        }


        return fact;
    }
      
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter total number of items (n) : ");
        int totalNum = sc.nextInt();
        System.out.print("Enter number of items to be chosen from the set (r) : ");
        int itemsChosen = sc.nextInt();


        System.out.println("The number of ways to choose " + itemsChosen + " from " + totalNum + " items is : " + biCoeff(totalNum, itemsChosen));
    
}
}
