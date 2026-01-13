import java.util.Scanner;

public class onceAgainodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter any number ");
        int num=input.nextInt();
       // int num;
        int sum=sum(num);
        System.out.println(sum);

    }

    public static <num> int sum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
            i+=2;

            System.out.println(i);
        }
      //  System.out.println(sum);


       return sum;
    }
}
