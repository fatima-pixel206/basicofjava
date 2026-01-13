
import java.util.Scanner;

public class SumAndAverageOfTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" here you can calculate sum and average only : ");
        System.out.println("enter size of rows :");
        int row = input.nextInt();
        System.out.println(" enter size of columns :");
        int col = input.nextInt();
        int[][] d_2 = new int[row][col];
        int i = 0;
        while (i < d_2.length) {
            int j = 0;
            while (j < d_2[i].length) {
                System.out.print(" please enter element of rows  :" + (i + 1) + " columns : " + (j + 1) + " :");
                d_2[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("the final array is : ");
        int k = 0;
        while (k < row) {
            int l = 0;
            while (l < col) {
                System.out.print(d_2[k][l] + " ");
                l++;
            }
            System.out.println();
            k++;
        }
        if(d_2.length==0){
            System.out.println(" the length is zeroo");
        }
        long sum=sum(d_2);
        System.out.println( " sum of total elements is :"  +sum);
        int total=row*col;

        double average=sum / total;

        System.out.println( " average of total elements is :" +average);
        int len= d_2.length;
        System.out.println(len);

    }


    public static long sum(int[][] d_2) {
        int i = 0;
        long sum = 0;
        while (i < d_2.length) {
            int j = 0;
            while (j < d_2[i].length) {
                sum = sum + d_2[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
