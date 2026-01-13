import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("welcome to fibonacci series");
        System.out.println("enter number");
        int n=input.nextInt();
        System.out.println("here is series " );
        printfibonacci(n);
    }
    public static void printfibonacci(int n){
        if(n<0) return;// it is allowed

System.out.print("0 ");

        if(n==0) return;

        //   System.out.print("1 ");
        int f=0,s=1;
        while( f+s<=n){
            int third=f+s;
            System.out.print(third + " ");
            f=s;
            s=third;



        }

    }
}
