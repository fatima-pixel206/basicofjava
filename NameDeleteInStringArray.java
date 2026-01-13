import java.util.Scanner;

public class NameDeleteInStringArray {
    public static void main(String[] args) {
        String[] nameList=StringUtility.StringOccurenceInArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name for deleting :");
        String nameToDelete= scanner.nextLine();
        String []newarray=deletingName(nameList,nameToDelete);
        System.out.println("here is new array ");
        displayNewaArr(newarray);
   //     System.out.println(newa);

    }
    public static  String[] deletingName( String[]nameList, String nameToDelete){

       // Object namOfOcuurence=
      //  Object StringOccureneInArray;
        int occ=StringOccurenceInArray.namOfOcuurence(nameList,nameToDelete);
        int newSize= nameList.length-occ;
        String[] newarray=new String[nameList.length];
        int i=0,j=0;
        while(i<nameList.length){
            if(!nameList[i].equalsIgnoreCase(nameToDelete)){
                newarray[j]=nameList[i];
                j++;
            }
            i++;
        }
        String []finall=new String[j];
        i=0;
        while(i<j){

            finall[i]=newarray[i];
            i++;



        }

        return finall;
    }
    public static void displayNewaArr(String[]nameList){

        int i=0;
        while(i< nameList.length){
            System.out.print(nameList[i]+" ");
            i++;
        }
        System.out.println();

    }
}
