import java.util.Scanner;

public class Numberofoccurence {
    public static void main(String[] args) {
        int[] theArray = Arrayutility.inputofarray();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your finding number");
        int num = input.nextInt();
        int numIs = numOfOcccurance(theArray, num);
        System.out.println("number " + numIs     +   " " +"times");
    }

    public static int numOfOcccurance(int[] theArray, int num) {
        int occ = 0;
        int i = 0;
        while (i < theArray.length) {
            if(theArray[i]==num){
                occ++;
            }

            i++;
        }
            return occ;


    }
}