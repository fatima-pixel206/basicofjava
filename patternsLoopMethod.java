import java.util.Scanner;

public class patternsLoopMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number for rows :");
        int row = input.nextInt();
        Triangle(row);
        System.out.println();
        triangle(row);
        System.out.println();
        reversetriangle(row);
        System.out.println();
        reverse(row);
        thirdprint(row);

    }
    public static void Triangle(int r){
        int i=1;
        while(i<=r){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }

public static void triangle(int r) {
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
}
 public static void reversetriangle(int r){
        int i=1;
        while(i<=r){
            System.out.print(" * ");
            int j=1;
            while(j<=r+1-i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
 }
 public static void reverse(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

 }
  public static void thirdprint(int mr){
        int r=mr;
        while(r>0){

            int j=0;
            while(j<r-1){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while(i<=(mr-r)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
r--;
        }
  }
    }

