import java.util.Scanner;

public class sumofOdd{
    public static void main(String[] args) {
        sumoffirstodd();
        sumofodd();

    }
    public static int sumoffirstodd()
    {

        Scanner input=new Scanner (System .in);
        System.out.println("enter any number");
        int n=input.nextInt();
        int odd=1;
        int sum=0;
        int i=0;
        while(i<=n){
          sum+=odd;
          odd=odd+2;
            i++;
            System.out.println(i);
          //  return sum=sum+odd;
        }
        System.out.println("sum of 20 odd numbers is " +sum);
        return sum;
    }
    public static int sumofodd (){
        System.out.println("enter any number");
        Scanner input=new Scanner (System.in);
        System.out.println("enter any number");
        int n=input.nextInt();
        int sum=0;
       // int n2=1;
        for(int i=1; i<=n;i+=2){
          //  sum=sum+
            sum=sum+i;

            System.out.println(i);

        }
        System.out.println(sum);

        return sum;
    }


}
