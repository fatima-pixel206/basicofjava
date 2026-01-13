public class methodTask {
    public static void main(String[] args) {

        leftTriangle();
    }



    public static void leftTriangle() {


        int r=0;
        while(r<2){
            System.out.print("*");
            int i=0;
            while(i<r){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            r++;
        }
    }

  }

