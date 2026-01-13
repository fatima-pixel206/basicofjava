import java.util.Scanner;

public class sumOfDigits {
    /*

     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter any number which have more then 1 digit");
        int n=input.nextInt();
        int sum=0;
        int digit;
        while(n>0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
           // n++;
        }
        System.out.println(sum);
    }
}
