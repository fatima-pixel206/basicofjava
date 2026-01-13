import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter number:");
        int n= input.nextInt();
        int positve;
        int negative;
        int zero;
        if(n>1){
            positve=n;
            System.out.println(" positive number");
        }
        else if(n<1&&n<0){
            negative=n;
            System.out.println(" number is negative ");
        }
        else if(n==0){
            zero=n;
            System.out.println(" number is zero:");
        }
    }
}
