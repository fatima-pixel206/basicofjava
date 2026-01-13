import java.util.Scanner;

public class Taskno1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int positive= input.nextInt();
        int nrgative= input.nextInt();
        int zero= input.nextInt();
        System.out.println("please enter a number");
        int n= input.nextInt();
        if(n>0)
        {
            System.out.println("this is a positive number");
        }
       else if(n<0)
        {
            System.out.println("this is a negative number");
        }
       else if(n==0){
            System.out.println("this number is equal to zero");
        }
       else {
            System.out.println("please enter a number");
        }
    }
}
