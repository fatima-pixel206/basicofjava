import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name  :");
        String name=input.nextLine();

        String Final =reverse(name);
        System.out.println( " original name is :" +name);

        System.out.println("revesed name is "+ Final);

    }

    public static String reverse(String name) {
     String New ="";
        int i =name.length()-1;// it means start from last latter , loop  will end on last latter;
        while(i>=0){
            New=New +name.charAt(i);// charAt(i) means it start from last latter it is also write as char latter=nam.CharAt(i)'
            i--;
        }
       return New;

    }

}
