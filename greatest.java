import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int n1 = input.nextInt();
        System.out.println("enter second number:");
        int n2 = input.nextInt();
        System.out.println(" enter third number:");
int n3= input.nextInt();
   int largest;
        if (n1>n2&&n1>n3) {
            largest=n1;
            System.out.println(n1+ " is larger");
        }
       else if (n2 > n1&&n2>n3) {
            largest=n3;
            System.out.println(n2 + " is larger ");
        }
       else if(n3>n1&&n3>n2){
            System.out.println(n3+" is larger");
        }

        }
    }
