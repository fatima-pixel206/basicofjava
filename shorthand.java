import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {
        int x=6;
        Scanner input=new Scanner(System.in);
        System.out.println(x);
        int x1=input.nextInt();
        x*=x1;
        System.out.println(x);
        int x2=input.nextInt();
        x*=x2;
        System.out.println(x);
        int x3=input.nextInt();
        x*=x3;
        System.out.println(x);
        int x4=input.nextInt();

x*=x4;
        System.out.println(x);

    }
}
