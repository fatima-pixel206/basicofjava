public class SortedArray {
    public static void main(String[] args) {
        System.out.println("check array is increasing or decreasing");
        int []myArray=Maxutility.MaxAndMinInArray();
        boolean increase=isIncreasing(myArray);
boolean decrease=isDecreasing(myArray);
if(increase){
    System.out.println("your array is sorted :");
    System.out.println("it is increasing");
}
 else if(decrease){
    System.out.println("your aaray is sorted  :\n it is decreasing :");
 }
else{
    System.out.println("array is not sorted it is constant :");
}
    }
    public static boolean isIncreasing(int[]myArray ){
        if(myArray.length==0){
            return false;
        }
        int i=1;
        while(i<myArray.length){
            if(myArray[i]<myArray[i-1]){//agar ek element phly elemenet sy chota hai
                return false;
            }


            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[]myArray){
        if(myArray.length==0){
            return false;
        }
        int i=1;
        while(i< myArray.length){
            if(myArray[i]> myArray[i-1]){
                return false;
            }
            i++;
        }
     return true;
    }
}



