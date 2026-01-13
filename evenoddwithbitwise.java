import java.util.Scanner;

public class evenoddwithbitwise {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("add a number");
        int n=input.nextInt();
        if((n&1)==0){
            System.out.println("even");
        }else {
            System.out.println(" odd");
        }
    }
}
