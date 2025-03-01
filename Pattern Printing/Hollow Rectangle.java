import java.util.*;


public class JavaBasics {
   
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop - rows
        for (int i = 1; i <= totRows; i++){
            //inner loop - columns
            for (int j = 1; j <= totCols; j++){


                //boundary cells given as :


                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }


            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows of rectangle : ");
        int numOfRows = sc.nextInt();
        System.out.print("Enter number of columns of rectangle : ");
        int numOfCols = sc.nextInt();


        System.out.println("Printing holllow rectangle having " + numOfRows + " rows and " + numOfCols + " columns");


        hollow_rectangle(numOfRows, numOfCols);
    }
   
}
