import java.util.Scanner;

import static java.lang.Long.sum;

public class factorial {
    public static void main(String[] args) {
          fact();


    }

    public static long fact() {
        Scanner input = new Scanner(System.in);
        long factorail = 1;
        System.out.println("enter any number for factorial");
        System.out.println(" kindly enter a number less than 20 ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n > 0) {
                factorail = factorail * i;
              //  System.out.println(factorail);
            } else if (n < 0) {

                System.out.println("negtive numbers are not for factorail");
            }

        }
        System.out.println(factorail);
        return factorail;
    }
}

