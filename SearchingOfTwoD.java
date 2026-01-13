import java.util.Scanner;

public class SearchingOfTwoD {
    public static void main(String[] args) {
        int[][]array=Arrayutility.inputOfTwoD();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number ");
        int nn= scanner.nextInt();
        boolean isnum=searching(array ,nn);

        if(isnum){

            System.out.println("this num is in array :");

        }
        else{
            System.out.println(" not finding ");
        }
        System.out.println(" enter finding  number :");
        int n= scanner.nextInt();
       int oc=occurence(array, n);
       System.out.println( n+" occures "  +oc+"  times");
    }
    public static boolean searching(int[][]array,int num){
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length) {
                if (array[i][j]== num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
     public static int occurence(int[][] array,int num){
      int occ=0;
        int r=0;
        while(r<array.length){
            int c=0;
                while(c < array[r].length){
                    if(array[r][c]==num){
                        occ++;
                    }
                c++;
           }
r++;
        }
        return occ;
    }
            }
