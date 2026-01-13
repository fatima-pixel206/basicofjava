import java.util.Scanner;

public class paramter {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
String ask="enter first number ";

        System.out.print(ask);
int num=input.nextInt();

String ask2="enter second number  ";
        System.out.print(ask2);
        int num2=input.nextInt();
      //  int result=sum(9,9);;
        System.out.println( " sum is :" +summm(num,num2));
        System.out.println(" sub is :" +subb(num,num2));
    }

    public static int summm(int n1,int n2) {
        int summm=n1+n2;
        return summm;

    }
    public static int subb(int n1,int n2) {


        int sub = n1 - n2;
        return sub;
    }

}
