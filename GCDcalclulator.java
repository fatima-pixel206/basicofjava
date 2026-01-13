
    import java.util.Scanner;

    class GCDcalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int gcd = findGCD(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

           // input.close();
        }

        public static int findGCD(int a, int b) {
            while (b >0) {
                int temp = b;//18
                b = a % b;//48%18=12
                a = temp;//18%12=6
            }
            return a;
        }
    }

