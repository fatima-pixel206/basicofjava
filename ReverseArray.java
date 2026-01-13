public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("welcome to reverese array  ;");
        int[]number=Arrayutility.inputofarray();
 reverse(number);
        System.out.println(" your reversed array is :");
        dispaly(number);
    //   Arrayutility.displayarr(number);
        System.out.println("max is ");
        int mx=MaxAndMinInArray.maximum(number);
        int min=MaxAndMinInArray.minimum(number);
        System.out.println(mx);
        System.out.println(" min is \n"+min);

    }


    public static void reverse(int[]arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];// -1 means last index and -i shows secondlast
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
    public static void dispaly(int[]number){
        int i=0;
            while(i< number.length){
                System.out.print(number[i]+" ");
                i++;
            }
            System.out.println( );
        }

    }


