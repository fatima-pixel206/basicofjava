import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[]newArray=Maxutility.MaxAndMinInArray();
      //  Scanner input=new Scanner(System.in);
       // int num=input.nextInt();
        int maxx=maximum(newArray);
        System.out.println(" maximum nymber is " +maxx);
        int min=minimum(newArray);
        System.out.println("minimum number is  "+min);
    }
    public static int maximum(int[]newArray){
if(newArray.length==0){
    return Integer.MIN_VALUE;
}
        int max=newArray[0];
        int i=0;
        while(i< newArray.length){
           if(i>max) {
               max=newArray[i];
           }
            i++;
        }
        return max;
    }
    public static int minimum(int[]newArray){
        if(newArray.length==0){
            return Integer.MAX_VALUE;
        }
        int min=newArray[0];
        int i=0;
        while(i< newArray.length){
            if(i<min){
                min=newArray[i];

            }
            i++;
        }
        return min;
    }
}
