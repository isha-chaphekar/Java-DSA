import java.util.*;


public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int N = sc.nextInt();


        int sum = 0;


        for(int i = 1; i <= N; i++){
            sum += i;
        }


        System.out.println("Sum = " + sum);
    }
}
