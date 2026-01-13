import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        System.out.println(" welcome to perimeter calculator :");
        Scanner input =new Scanner(System.in);
        System.out.println("enter first side of perimeter  in cm :");
        double s1=input.nextDouble();
        System.out.println("enter second side of perimeter in cm :");
        double s2=input.nextDouble();
        System.out.println("enter third side of perimeter in cm :");
        double s3=input.nextDouble();
        System.out.println("enter fourth side of perimeter  in cm :");
        double s4=input.nextDouble();
        double perimeter=s1+s2+s3+s4;
        System.out.println("perimeter is :" +perimeter +"cm");


    }
}
