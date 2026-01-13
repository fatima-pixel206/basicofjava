import java.util.Scanner;

public class palidrom {

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("enter your number");
            int n=input.nextInt();
            int reverse=reverse(n);
            System.out.println(reverse);
            boolean palindorm=palindrom(n);
            if(palindorm){
                System.out.println("yes its palindorm");
            }
            else {
                System.out.println("not palinorm");
            }
//            if(n==reverse){
//                System.out.println("pandilom");
//            }
//            else {
//                System.out.println("not");
//            }
        }
        public static boolean palindrom(int n){
            int revese=reverse(n);
            return n==revese;

        }
        public static int reverse(int n) {
            int ne=0;
            while(n>0){
                int digit=n%10;//212%10=2
                //digit=2
                ne=ne*10+digit;//0*10+2=
                n=n/10;
            }
            return ne;

        }

    }

