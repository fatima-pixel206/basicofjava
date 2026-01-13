import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        String[] aary=new String[6];
        String[] naaa={"fati ","asad" ,"atiqa" };
        aary[0]="fatima";
        aary[1]= "asad";
        aary[2]= " zeehan";
        aary[3]="araim";
        aary[4]="iqra";
        aary[5]="alli";
        System.out.println(naaa.length);
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String name=input.nextLine();
        boolean done=foundname(aary,name);
        if(done){
            System.out.println("you are in list");
        }
        else{
            System.out.println("your are not selected");
        }
        System.out.println(aary[0]);
        System.out.println(aary[1]);
        System.out.println(aary[2]);
        System.out.println(aary[3]);
        System.out.println(aary[4]);
        System.out.println(aary[5]);
       /// System.out.println(newnaaa.length);

       int i=0;
       while(i<naaa.length){
           System.out.println(naaa[i]);
           i++;
       }

    }
    public static boolean foundname( String [] naaa,String name){
       int index=0;
       while(index < naaa.length){
           if(naaa[index] ==name){
               return true;

           }
           index++;
       }
        return false;
    }
}
