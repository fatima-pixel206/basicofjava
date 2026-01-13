import java.util.Scanner;

public class Maxutility {
    public static int[]MaxAndMinInArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number for array size :");
        int size= input.nextInt();
        int[]array= new int [size];
        int i=0;
        while(i<size){
            System.out.println("please enter an elemnet no "+(i+1));
            array[i]= input.nextInt();
            i++;
        }
        return array;
    }
}
