import java.util.Scanner;

public class searchingTwoDarray {
    public static void main(String[] args) {
        int[][] myarr = {{123, 345, 33, 34}, {47, 43, 57, 45}, {874, 6, 35, 245}};
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter number :");
//        int num = input.nextInt();
//


            int i = 0;

            while (i < myarr.length) {
                int j = 0;
                while (j < myarr.length) {
                    int aarr = myarr[i][j];
                    //System.out.print(arr);
                    System.out.print(myarr[i][j] + " ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }




