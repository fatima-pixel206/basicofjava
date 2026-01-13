import java.util.Scanner;

public class newstringclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to name list :");
        System.out.println("please enter your name :");
        String naame = input.nextLine();
        String[] Name = {"fatima", "alina", "ali", "abid", "latif", "bilal", "saqib", "alishba", "emaan", "akash", "rabia", "mairaj"};
        System.out.println("here are the total students :" + Name.length);
//        boolean nameis = findingname(Name, naame);
        System.out.println("here is list ");
        int ind = 0;
        while (ind < Name.length) {
            System.out.println(ind + "   " );
            ind++;
        }

        if (Name[ind]==naame){
            System.out.println("yes");
        }
        else {
            System.out.println("mo");
        }
        //
//
//        if (nameis) {
//            System.out.println("you are selectedt :)");
//        } else {
//            System.out.println("soory");
//
        for(int index=0;index<Name.length;index++){
            if(Name[index]==naame){
                System.out.println(Name[index]);
            }
            else{
                System.out.println("your are  not selcted ");
            }
            //   System.out.println();
        }
    }
//    public static boolean findingname(String[] Name,String naame){
//      //;
//       for(int inde
//       x=0;index<Name.length;index++){
//           if(Name[index]==naame){
//               return true;
//           } else{
//               return false;
//           }
//        //   System.out.println();
//       }
//       return false;
//    }
//}}
}
