import java.util.Scanner;

public class gradechecker {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("welcome to result day  :");

        System.out.println("please enter your marks");
        int marks=input.nextInt();
        String grade=input.nextLine();
        if(marks==50)
        {
            System.out.println("pass");
            grade="D";
            System.out.println("grade is " + grade);
        }
        else if(marks>60&&marks<=50)
        {
            System.out.println("pass");
            grade="C";
            System.out.println("grade is " + grade);
        }
        else if(marks>60&&marks<=70){
            System.out.println("pass");
            grade="B";
            System.out.println("grade is " +grade);

        }
        else if(marks>80&&marks<=90){
            System.out.println("pass");
            grade="A";
            System.out.println("grade is " +grade);


        }
        else if(marks>90&&marks<100){
            System.out.println("pass");
grade="A+";
            System.out.println("grade is " +grade );

        }
        else {
            System.out.println("fail");
            grade="F";

            System.out.println("grade is " + grade);

        }
    }
}