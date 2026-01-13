import java.util.Scanner;

public class StringOccurenceInArray {
    public static void main(String[] args) {
       String[] nameArray=StringUtility.StringOccurenceInArray();
        System.out.println("please enter name for check:");
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();
        int occ=namOfOcuurence(nameArray,name);
        System.out.println("this name is "+occ +"times");


    }
    public static int namOfOcuurence(String[]nameArray,String name){
        int occ=0;
        int i=1;
        while(i<nameArray.length){
            if(nameArray[i].equalsIgnoreCase(name)){
                occ++;

            }
            i++;

        }
        return occ;
    }
}
