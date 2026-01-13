import java.util.Scanner;

public class lecturetask {
    public static void main(String[] args) {

        Object system;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first number :");
        int n1=input.nextInt();
        System.out.println("Please enter your second number :");
        int n2=input.nextInt();
        int sum=n1+n2;
        System.out.println("sum is : " +sum);
        int sub =n1-n2;
        System.out.println("sub is : " +sub);
        int mult =n1*n2;
        System.out.println("multi is :"+mult);
        float divi=n1/n2;
        System.out.println("divi is :" + divi);
        int reminder =n1%n2;
        System.out.println("reminder is : " + reminder);



    }

}
