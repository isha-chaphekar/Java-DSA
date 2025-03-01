import java.util.*;

//ternary operator test code

public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        System.out.println("The input number is " + number);


        String type = (( number % 2 ) == 0)? "even" : "odd";


        System.out.println("The input number " + number + " is " + type);
    }
}
