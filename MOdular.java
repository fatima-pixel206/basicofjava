import java.util.Scanner;

public class MOdular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n1");
        int a = input.nextInt();
        System.out.println("enter n2 :");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("sum is :" + sum);
        int d = a * b;
        System.out.println("product is :" + d);
        int e = a - b;
        System.out.println("difference is " + e);
        int g = a / b;
        System.out.println(" division is:"+g);
        int qou = a % b;
        System.out.println("quoteint is :" + qou);

    }
}