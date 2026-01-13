import java.util.Scanner;

public class OcuureneceTwiD {public static int occurence(int[][] array, int num){
    int occ=0;
    int i=0;
    while(i<array.length){
        int j=0;
        while(i<array[i].length)
        {
            if(array.length==num){
                occ++;
            }
            System.out.println(array[i][j]+" ");
            j++;
        }
        i++;
    }
    return occ;
}
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[][]arr=Arrayutility.inputOfTwoD();
        System.out.println("enter n ");
            int n=scanner.nextInt();
    int oc=occurence(arr,n);

    }

}
