import java.util.Scanner;
public class ReverseArrayName{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter size of array");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] nameArray = new String[size];
        int i = 0;
        while (i < size) {
            System.out.println("please enter name " + (i + 1));
            nameArray[i] = scanner.nextLine();
            i++;
        }
        String name ="";

        String[] reverseNme = reverseName(nameArray,name);
       System.out.println(reverseNme);
    }


    public static String[] reverseName(String[] nameArray,String name) {
        int i = name.length()-1;
       //// int newsizw = nameArray.length;
    //    String[] newarry = new String[newsizw];
        String naame = "";
        while (i < nameArray.length) {
           naame+=naame.charAt(i);
           i++;

            }
        String[] newstring=new String[name.length()];
        System.out.println(naame);
        return newstring;
    }
}