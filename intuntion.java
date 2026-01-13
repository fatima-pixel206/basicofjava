import java.util.Scanner;

public class intuntion {
    public static void main(String[] args) {
        good();
 int f=sumber()*2;
    int s=sumber()*4;
     int sum=f+s;
     // sumber();
      //  System.out.println(sumber());
     System.out.println("sum is " +sum);
    }
    public static int sumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int num=input.nextInt();
//        System.out.println("enter number");
//        int num2=input.nextInt();

//i

        return num;
    }

    public static void good() {
        System.out.println("good morning");
        System.out.println(" welcome to the calculator");

    }
}
