import java.util.Scanner;
public class Final{
    public static void main(String[]args){
        Airthmetic object=new Airthmetic();

        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=input.nextInt();
        System.out.println("enter Second number");
        int n2=input.nextInt();
        object.setValue(n1,n2);
        System.out.println("subustractin is :" +object.sub());

        object.setsum(n1,n2);
        System.out.println("sum is :" +object.sum());

        object.setmult(n1,n2);
        System.out.println("product is :" +object.getMult());


    }
}