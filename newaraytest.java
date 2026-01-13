import java.sql.SQLOutput;
import java.util.Scanner;

public class newaraytest {
    // array searching
    public static void main(String[] args) {
      int  [] newaray = {1, 2, 3, 4, 5, 66, 77, 8, 8, 99};
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array searching :");
        System.out.println("enter your finding num : ");
        int num = input.nextInt();
        boolean found = isfound(newaray, num);
        if (found) {
            System.out.println("your number is found");
        } else {
            System.out.println("your number is not found");
        }
    }
    public static boolean isfound(int[] newaray, int num) {
        int index = 0;
        while (index < newaray.length) {
            if (newaray[index] == num){
                return true;
            }
                index++;
        }
            return false;
        }

    }
