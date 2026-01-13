import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class sumAndAverageArray {
    public static void main(String[] args) {
        int[] Arrray = {1, 3, 5, 7, 8, 9};
        int[] array = {6, 7, 8, 9, 9};
        int sum = Arrays.stream(Arrray).sum();
        System.out.println("sum of all elements is :" + sum);
        double average = Arrays.stream(Arrray).average().getAsDouble();
        System.out.println("average of all elements is:" + average);
        //or
        double aaverage = (double) sum / Arrray.length;
        System.out.println("average is :" + aaverage);
        //or
        int summ = 0;
        for (int element : Arrray) { //element is a variable this loop execute for each element
            // :this symbol represents variable decleration from Array
            //int element;
            summ = summ + element;

        }
        System.out.println(summ);
//or
        int i = 0;
        int suum=0;
        int aver=0;
        while (i < array.length) {
            suum = suum + array[i];
            i++;
        }
        System.out.println ( " sum of all elements of second aaray  :" +suum);
        aver=suum/array.length;
        System.out.println( " average of all elements of second aaray :" +aver);
        System.out.println(":)(: finally");
        //OR
        int [] myaar=new int [4];
        myaar[0]=23;
        myaar[1]=93;
        myaar[2]=25;
        myaar[3]=86;
        int ssum=myaar[0]+myaar[1]+myaar[2]+myaar[3];
        System.out.println(ssum);
        int averageee=ssum/4;
        System.out.println(averageee);

    }


}