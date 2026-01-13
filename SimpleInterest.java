import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to interest calculator");
        System.out.println("please enter principal : ");
        float P = input.nextInt();
        System.out.println("please enter your rate of year :");
        float R=input.nextInt();
        System.out.println(" please enter your years for borrowing :");
        float T=input.nextInt();
        float simpleint=(P*R*T)/100;
        System.out.println(" your simple interset is : " + simpleint);
    }
}
