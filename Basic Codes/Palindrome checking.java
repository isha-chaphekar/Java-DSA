// palindrome checking


import java.util.*;


public class JavaBasics {
   
    public static void palindromechk (int n) {
        int palindrome = n;
        int revNum = 0;
       
        while (palindrome>0){
            int lastDigit = palindrome % 10;
            revNum = (revNum * 10) + lastDigit;
            palindrome = palindrome/10;
        }
       
        if(revNum == n){
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }
   
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int chkNum = sc.nextInt();


        palindromechk(chkNum);


    }
}
