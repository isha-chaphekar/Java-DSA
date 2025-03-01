import java.util.*;


public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to be flipped : ");


        for (int flpnum = sc.nextInt(); flpnum > 0; flpnum /= 10 ){
            int lastDigit = flpnum % 10;
            System.out.print(lastDigit);
        }
    }
}
