

import java.util.Scanner;

// tilclick the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{


        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter your name");

            String a=input.nextLine();



            System.out.println(" please enter your second name");
            String b=input.nextLine();
            System.out.println("Please enter your age");
            int A=input.nextInt();

            System.out.println("enter your seocnd age :");
            int B =input.nextInt();
            String a3 =a;
            a=b;
            b=a3;
            System.out.println("now yur name is :"+ a);
            System.out.println("now your seocond name is :"+ b);
            int C=A;
            A=B;
            B=C;
            System.out.println("now your age is : "+ A);
            System.out.println("noe your seocond age is  :" + B);

        }

    }


