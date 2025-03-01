import java.util.*;


public class JavaBasics {
   
    public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;


        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            n = n / 2;
            pow++;


        }


        System.out.println("The corresponding binary number is : " + binNum);
    }
   
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter decimal number : ");
        int decNum = sc.nextInt();


        decToBin(decNum);


    }
}
