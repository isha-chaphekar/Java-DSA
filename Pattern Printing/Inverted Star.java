import java.util.*;


public class JavaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int numOfLines = sc.nextInt();


        // i => no. of lines
        // j => no. of stars


        for (int i = 1; i <= numOfLines; i++){
            for (int j = 1; j <= (numOfLines - i + 1); j++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
