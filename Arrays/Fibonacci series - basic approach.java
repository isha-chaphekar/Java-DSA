import java.util.*;


public class ArraysJava {
   
    public static void fiboSeries (int N){
        if (N <=1) {
            System.out.print(N);
        }


        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= N; i++){
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
        System.out.println("Done");
    }
   
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int N = sc.nextInt();


        fiboSeries(N);
    }
}
