import java.util.Scanner;

public class prime{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter any  number :");
        int num = input.nextInt();
        boolean prime = primeis(num);
        if (prime) {
            System.out.println(" prrime ");//when return true
        } else {
            System.out.println("not prime");// when return false
        }
    }
    public static boolean primeis(int num){
         int i=2;
         while(i<num){
             if(num%i==0){
                 return false;
             }
             i++;
         }
         return true;
    }
}