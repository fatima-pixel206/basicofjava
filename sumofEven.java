import java.util.Scanner;

public class sumofEven {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter any numbr");
        int num=input.nextInt();
        int sum=0;
        int sum2=0;
       // int eve
        for(int i=1; i<=num;i++){
            if(num%2==0){
                sum=sum+num;

                System.out.println(sum);
            }
            else if(num%2!=0){
                sum2=sum2+num;
                System.out.println(sum2);

            }
            else {
                System.out.println("nothing");
            }

        }
        System.out.println("total sum is " +sum);
        System.out.println(sum2);
     //   else if(num%2!=0)
    }
}
