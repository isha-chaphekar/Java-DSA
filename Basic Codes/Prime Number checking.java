import java.util.*;


//checking for prime number


public class JavaBasics {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int chknum = sc.nextInt();
        boolean isPrime = true;


        if(chknum == 2){
            System.out.println("2 is a prime number");
        } else{
            for(int i = 2; i < Math.sqrt(chknum); i++){
                if((chknum % i) == 0){
                    isPrime = false;
                    break;
                }
            }


            if(isPrime == true){
                System.out.println(chknum + " is a prime number");
            } else{
                System.out.println(chknum + " is not a prime number");
            }
        }        
    }
}
