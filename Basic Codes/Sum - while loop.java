import java.util.*;


public class JavaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int N = sc.nextInt();


        int sum = 0;
        int i = 1;


        while(i <= N){
            sum += i;
            i ++;
        }
        System.out.println("Sum of numbers from 1 to " + N + " is = " + sum);
    }
}
