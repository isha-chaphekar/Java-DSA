import java.util.*;


public class JavaBasics {
   
    public static void diamond_pattern (int n){
        //1ST HALF
        //outer loop - lines
        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }


            //stars
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("* ");
            }


            System.out.println();
        }


        //2ND HALF
        //outer loop - lines
        for (int i = n; i >= 1; i--){
            //spaces
            for (int j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }


            //stars
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("* ");
            }


            System.out.println();
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int inputNum = sc.nextInt();


        diamond_pattern(inputNum);
    }
}
