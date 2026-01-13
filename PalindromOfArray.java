import java.util.Scanner;

public class PalindromOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter size of an array :");
        int size= scanner.nextInt();
        int[] array=new int[size];
        int i=0;
        while(i<size){
            System.out.println("please enter elemnet " +(i+1));
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.println();
        reverse(array);
        System.out.println("now your array is :"   );
        display(array);
        boolean ispalin=ispalindrom(array);
        if(ispalin){
            System.out.println("yes this is palindrom array :");
        }
        else{
            System.out.println("this array is not palindrom");
        }

    }
    public static int reverse(int[] array){
        int i=0;
        while(i<array.length/2){
            int swap=array[i];
            array[i]=array[(array.length-1)-i];
            array[(array.length-1)-i]=swap;
            i++;
        }
        return i;
    }
    public static void display(int[]array){
        int i=0;
        while(i<array.length){
            System.out.println(array[i]+" ");
            i++;
        }
    }
    public static boolean ispalindrom(int[]array){
        int i=0;


        while(i<array.length){
            if(array[i]!=array[(array.length-1)-i]){

                return false;

            }
            i++;
        }
        return true;
    }
}
