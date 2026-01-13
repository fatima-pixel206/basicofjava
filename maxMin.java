import java.util.Arrays;
import java.util.OptionalInt;


public class maxMin {
    public static void main(String[] args) {
        int []maxxminn={1,34,54,56,765,8767,574,-77,346,54,35,35,243,2435,11};
        OptionalInt maxz= Arrays.stream(maxxminn).max();
        System.out.println("maximum number of array is :" + maxz);
        OptionalInt minn=Arrays.stream(maxxminn).min();
        System.out.println("maximum number is :" +  minn);
      //  boolean mult=Arrays.stream(maxxminn).equals();



    }

}
