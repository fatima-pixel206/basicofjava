import java.util.Scanner;

public class StringUtility {
    public static String[] StringOccurenceInArray() {
      //  Scanner input = new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter size of array :");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] nameArray = new String[size];

//    int i=0;
//    while(i < size){
//        System.out.println("please enter name " + (i+1)+":");
//        nameArray[i]= input.nextLine();
//        i++;
//    }
        int i = 0;
        while (i < size) {
            System.out.println("enter name " + (i + 1));
            nameArray[i] = scanner.nextLine();
            i++;
        }
        return nameArray;
    }

}