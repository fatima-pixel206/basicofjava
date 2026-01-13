public class inputofarray {
    public static void main(String[] args) {
        int[] numArray = Arrayutility.inputofarray();//here use another class.
        // u can use directly with name of class method calls

        System.out.println("sum and average");
        long sum=sum(numArray);
        double average=average(numArray);
        System.out.println("sum of the numbers is " +sum);
        System.out.println("average of the numbers is  "+ average);
    }
public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
}
    public static double average(int[] numArray) {
        double sum=  sum(numArray);
double average=sum/numArray.length;
        return average;
    }
}