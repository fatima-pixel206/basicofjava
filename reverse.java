import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your number");
        int n=input.nextInt();
        int reverse=reverse(n);
        System.out.println(reverse);
    }
    public static int reverse(int n) {
        int newnu=0;//
        while(n>0){

            int digit=n%10; //212%10=2   digit=2

            newnu=newnu*10+digit;//0*10+2=2
            System.out.println(newnu);
            n=n/10;//249/10=24 24/10=2....//212/10=21
            System.out.println(n);

        }
        return newnu;

    }

}
