import java.util.Scanner;

public class Seprating {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter five digits number :");
        int digit= input.nextInt();
        int d1=digit /10000;
        int d2=(digit%10000)/1000;
        int d3=(digit%1000)/100;
        int d4=(digit%100)/10;
        int d5=(digit%10);
        System.out.printf(" %d   %d   %d   %d   %d",d1,d2,d3,d4,d5);


    }
}
