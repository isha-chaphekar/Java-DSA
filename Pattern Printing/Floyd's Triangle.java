// Floyd's triangle pattern


import java.util.*;


public class JavaBasics {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int numOfLines = sc.nextInt();


        // i => number of lines
        // j => count of nos. printed on each line


        int prntNum = 1;


        for (int i = 1; i <= numOfLines; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(prntNum + " ");
                prntNum++;
            }


            System.out.println();
        }
    }
}
