public class SortedOfTwoDimensionalArray {
    public static void main(String[] args) {
        int[]num=Arrayutility.inputofarray();
        int[]num2=Arrayutility.inputofarray();
        boolean sorted=SortedArray.isIncreasing(num);
        if(sorted) {
            int[]merge=mergeOcomboOfArrays(num,num2);
            Arrayutility.displayarr(merge);
            System.out.println();
        }
        else{
            System.out.println("this array  is not sorted ,it can not run");
        }
 //     int[]merge=mergeOcomboOfArrays(num,num2);
   //   Arrayutility.displayarr(merge);
    }
    public static int[] mergeOcomboOfArrays(int[] num, int[] num2){
        int newsize=num.length+ num2.length;
        int[]newarray=new int[newsize];
        int i=0,j=0,k=0;//i for num,j for num2,k for newarray the first index of num2 will be compare and cpoid in newarray
        while( i < num.length ||j< num2.length){
            if(j==num2.length || (i<num.length && num[i]<num2[j])){

                newarray[k]=num[i];

                i++;
                k++;
            }
            else{
                newarray[k]=num2[j];
                k++;
                j++;
            }
        }
        return newarray;
    }
}
