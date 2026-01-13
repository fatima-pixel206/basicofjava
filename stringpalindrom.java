import java.util.Scanner;

public class stringpalindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name :");
        String name=input.nextLine();
        String reverse=reverse(name);
        boolean nam=isPalindrom(name);
        if(nam){
            System.out.println("yes it is palindrom : \n "  + name +  "=" +"  "  + reverse);
        }
        else{
            System.out.println("no! it is not palindrom  :" + name +" !=  " +"   "+reverse);
        }


    }
    public static String reverse(String str){
        String reverse="";
        int i=str.length()-1;
        while(i>=0){
            reverse=reverse + str.charAt(i);
            i--;
        }
        return reverse;

    }
    public static boolean isPalindrom(String str){
        String reversed=reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
}
