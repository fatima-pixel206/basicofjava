public class parameter2 {
    public static void main(String[] args) {
       int num=subodftwo(3,6);
        System.out.println(num);
       System.out.println(" sum is " +subodftwo(8,90));//this is called arguement
        System.out.println(" sum is " +subodftwo(8,7));
        System.out.println(subodftwo(8,9));
    }
    public static int subodftwo(int n1,int n2){// this is called parameter
        System.out.println("first num is :" +n1);
        System.out.println("second num is :"+ n2);
       // int sum=n1+n2;
        return n1+n2;
    }
}