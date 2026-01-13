public class twoDarray {
    public static void main(String[] args) {
        int [][] d2= {{1,2,9},{3,9,5},{9, 9,7}};
        System.out.println(d2[0][0]);
        System.out.println(d2[0][1]);
        System.out.println(d2[0][2]);
        System.out.println(d2[1][0]);
        System.out.println(d2[1][1]);
        System.out.println(d2[1][2]);
        System.out.println(d2[2][0]+"  " +d2[2][1]+" "+d2[2][2]);
        int i=0;
        while(i<d2.length){// represents rows
            int j=0;
            while(j<d2[i].length){//represents columns
                System.out.print(d2[i][j] +" ");
                j++;
            }
            System.out.println( );
            i++;// traversal
        }
int [][] myarray= new int[3][3];
myarray[0][0]=99;
        myarray[0][1]=98;
        myarray[0][2]=75;
                myarray[1][0]=85;
        myarray[1][1]=65;
                myarray[1][2]=75;
        myarray[2][0]=56;
                myarray[2][1]=32;
        myarray[2][2]=37;
        System.out.println();

int row=0;
while(row< myarray.length){//also use while(row<3)
    int column=0;
    while(column< myarray.length){// coulmn<3
        System.out.print(myarray[row][column]+" ");
        column++;
    }
    System.out.println();
    row++;
}

    }
}
