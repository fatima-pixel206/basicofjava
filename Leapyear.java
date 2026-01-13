import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the finding leap year with java code :");
        System.out.println("please enter year :");
        int year=input.nextInt();
        if(year%4==0&&year%400==0){
            System.out.println("laep year");
        }
        else if(year%100!=0){
            System.out.println("not leap year");
        }
        else{
            System.out.println("enter a year");
        }
    }
}
