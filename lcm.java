import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to lcm");
        System.out.println("enter first num");
        int n1=input.nextInt();
        System.out.println(" enter second number");
        int n2=input.nextInt();
        int lcm=Lcm(n1,n2);
        System.out.println(" lcm of two numbers is" +lcm);
    }
    public static int Lcm(int n1,int n2){
        int i=1;
        while(true){
            int factor=n1*i;
            if(factor%n2==0){
                return factor;
            }
            i++;
        }
       // return 0;//unrehable
    }


}
