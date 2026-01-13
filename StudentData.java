
import javax.swing.*;


public class StudentData{
    public static void main(String[] args){
        String sName=JOptionPane.showInputDialog("enter your name:");
        String secondName=JOptionPane.showInputDialog("enter your second name:");
        String cNIC=JOptionPane.showInputDialog("enter your CNIC:");
        String age=JOptionPane.showInputDialog("enter your age:");
        String rollno=JOptionPane.showInputDialog("enter your roll no:");

        String address= JOptionPane.showInputDialog("enter your addres:");
        String depa=JOptionPane.showInputDialog("enter your department:");
        int age2=Integer.parseInt(age);
        double cnic2= Integer.parseInt(cNIC);

        String ageFinal=" "+age2;
        String finalcnic=" "+cnic2;
        String finall="Name :"+sName+" \n surname is ....."+secondName+"\n CNIC....." +finalcnic
                +"\n age...."+ageFinal+"\n roll no..."+rollno+"\n addres..."+address+"\n department..."+depa;

        JOptionPane.showMessageDialog(null," Student card"+finall);
    }
}







