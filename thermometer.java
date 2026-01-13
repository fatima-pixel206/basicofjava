import java.util.Scanner;

public class thermometer {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to sipmle thermometer :");
        System.out.println("Please enter your temperature in farhanite");
        float F=input.nextFloat();
        float C= (F-32)*5/9;
        System.out.println("  your fahanite tem change into celcisus :" +C);
    }
}
