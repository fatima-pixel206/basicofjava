import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to left shift /case op");
        System.out.println("enter number");
        int n=input.nextInt();
        int result=n>>2;
        System.out.println("your number is " + result);

    }
}


