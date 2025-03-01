//prime numbers in given range


import java.util.*;


public class JavaBasics {
   
    public static void primesInRange(int range){
        for (int i = 2; i <= range; i++){
            if (isPrime(i) == true){
                System.out.print(i + "  ");
            }
        }
    }
   
   
    public static boolean isPrime (int num){
        if (num == 2){
            return true;
        }
       
        for (int i = 2; i <= Math.sqrt(num); i++){
            if ((num % i) == 0){
                return false;
            }
        }


        return true;
    }
   
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter range : ");
        int range = sc.nextInt();
        primesInRange(range);


    }
}
