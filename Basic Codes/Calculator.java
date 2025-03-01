import java.util.*;


//calculator code


public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        //take input of 2 numbers from user


        System.out.print("Enter number 1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number 2 : ");
        float num2 = sc.nextFloat();


        System.out.println(); //extra line to enhance readability


        System.out.println("1 : Addition \n2 : Subtraction \n3 : Multiplication \n4 : Division \n5 : Return remainder");


        int operationChoice = sc.nextInt(); //asking user to choose an operation from list of options given above


        switch (operationChoice){
            case 1 : System.out.println("You have chosen addition operation."); float result1 = num1 + num2;
                     System.out.println("Addition result is : " + result1);
                     break;
           
            case 2 : System.out.println("You have chosen subtraction operation.");
                     float result2 = num1 - num2;
                     System.out.println("Subtraction result is : " + result2);
                     break;
           
            case 3 : System.out.println("You have chosen multiplication operation");
                     float result3 = num1 * num2;
                     System.out.println("Multiplication result is : " + result3);
                     break;
           
            case 4 : System.out.println("You have chosen division operation");
                     float result4 = num1 / num2;
                     System.out.println("Division result is : " + result4);
                     break;


            case 5 : System.out.println("You have chosen operation to return remainder after division");
                     float result5 = num1 % num2;
                     System.out.println("Remainder after dividing " + num1 + " by " + num2 + " is = " + result5);
                     break;


            default : System.out.println("Run code again and choose correct option");
        }
        System.out.println("Thank you");
    }
}
