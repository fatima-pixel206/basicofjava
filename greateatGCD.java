import java.util.Scanner;

public class greateatGCD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=input.nextInt();
        System.out.println("enter secomd number");
        int n2=input.nextInt();
        int gcd=Gcd(n1,n2);
        System.out.println(gcd);
    }
    public static int Gcd(int nn1,int nn2) {
        int gcd=1;
        int i=2;
        int least=least(nn1,nn2);
        while(i<=least){
            if(nn1%i==0&&nn2%i==0){
             gcd=i;
            }
            i++;
        }

        return gcd;
    }
    public static int least(int n1,int n2){
        if(n1<n2){
            return n1;
        }
        else{
            return n2;
        }
    }

}
