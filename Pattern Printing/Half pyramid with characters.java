import java.util.*;


// half pyramid pattern with characters


public class JavaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int numOfLines = sc.nextInt();


        // i => number of lines
        // j => number of characters


        char chcnt = 'A'; //character count variable to keep track of, and increment character value


        for (int i = 1; i <= numOfLines; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(chcnt + " ");
                chcnt ++;
            }


            System.out.println();
        }
    }
}
