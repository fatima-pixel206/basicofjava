import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = input.nextInt();
        System.out.println("enter second number");
        int n2 = input.nextInt();
        System.out.println("enter third number");
        int n3 = input.nextInt();
        System.out.println("enter fourth number");
        int n4 = input.nextInt();
        System.out.println("enter fifth number");
        int n5 = input.nextInt();
        int largest = n1;
        int smallest = n1;
        if (n2 > largest)
            largest = n2;
        if (n3 > largest)
            largest = n3;
        if (n4>largest)
            largest = n4;
        if (n4 > largest)
            largest = n5;
        //smallest
        if (n2 < smallest)
            smallest = n2;
        if (n3 < smallest)
            smallest = n3;
        if (n4 < smallest)
            smallest = n4;
        if (n5 < smallest)
            smallest = n5;
        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);


    }
}