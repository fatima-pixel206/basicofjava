import java.util.Scanner;

public class multiplicationOfNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter any number for table");
        int n=input.nextInt();
        int i=1;
        while(i<=10){
          //  int table=i*n;
           // System.out.print(i +"*"+ n    );
            System.out.println( i+ "*" +n +  "="   +i*n);
            i++;
        }
    }
}
