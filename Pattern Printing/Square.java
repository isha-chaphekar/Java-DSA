import java.util.*;


public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int testnum = sc.nextInt();


        for (int i = 1; i <= testnum; i++){
            for(int j = 1; j<= testnum; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
