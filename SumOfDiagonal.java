import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[][]doblearray=Arrayutility.inputOfTwoD();
        double sumOfL=sumofLeftDiagonal(doblearray);
        double sumOfR=sumofRightDiagonal(doblearray);
        double finalSUm=sumOfL+sumOfR;
        if(doblearray.length%2!=0){
            int index= doblearray.length/2;
            finalSUm=finalSUm- doblearray[index][index];
            System.out.println("sum is all diagonal is "+  finalSUm);
        }
        System.out.println(" sum of Left diagonals elements is :");
        System.out.println(sumOfL);
        System.out.println("sum of right diagonal is :"+ sumOfR);
        System.out.println("your array is :");
        Arrayutility.dislpayTwoDArray(doblearray);

    }
       public static long sumofLeftDiagonal(int[][]doblearray){
        int i=0;
         //  int j = 0;
        int sum=0;
        while(i< doblearray.length){
           // if(doblearray[i][j]== doblearray[i][j])

           sum=sum+doblearray[i][i];
          //  j++;

            i++;
       }
        return sum;
}
    public static long sumofRightDiagonal(int[][]doblearray){

        long sum=0;
        int i=0;
        while( i < doblearray.length){
            int c= doblearray.length-1-i;
            sum+=doblearray[i][c];
            i++;


        }
        return sum;
    }
}