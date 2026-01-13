import java.util.Scanner;

public class laapyear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter any year");
        int year = input.nextInt();

        if (year % 400 == 0 ||(year%4==0&&year%100!=0))  {
            System.out.println("leap year");
        }

        else {
            System.out.println("not");
        }
        }
    }

