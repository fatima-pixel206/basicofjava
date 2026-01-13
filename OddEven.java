import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
            System.out.println("enter any numbr");
            int num=input.nextInt();
            if(num%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");
            }
    }
}
