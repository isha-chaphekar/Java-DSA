import java.util.*;


public class JavaBasics{
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);


        do{
            System.out.print("Enter any integer : ");
            int number = sc.nextInt();
           
            if((number % 10) == 0){
                break;
            }
           
            System.out.println(number);
        } while (true);


        System.out.println("You entered a multiple of 10. I have exited the loop.");
    }
}
