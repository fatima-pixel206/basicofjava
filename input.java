import java.io.InputStream;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);
        System.out.println("enter first num:");
        int num1 = inpput.nextInt();
        System.out.println("enter second num: ");
        int num2 = inpput.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is multiples of " + num2);
        }
        else {
            System.out.println(num1+" is not multiples of"+num2);
        }


    }
}