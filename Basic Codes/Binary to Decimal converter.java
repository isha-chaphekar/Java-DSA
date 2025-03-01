// binary to decimal conversion


import java.util.*;


public class JavaBasics {
   
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;


        while (binNum > 0) {
            int lastDigit = (binNum % 10);
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }


        System.out.println ("The decimal number is : " + decNum);


}
   
   
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter binary number : ");
        int inputNum = sc.nextInt();
        binToDec(inputNum);


    }
}
