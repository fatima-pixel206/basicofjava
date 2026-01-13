import javax.swing.*;

public class Option {
        public static void main(String []args){
            String n1= JOptionPane.showInputDialog("enter first number");
            String n2=JOptionPane.showInputDialog("enter second number");
            String n3=JOptionPane.showInputDialog("enter tthidr number");
            String n4=JOptionPane.showInputDialog("enter first number");

            int num1=Integer.parseInt(n1);
            int num2=Integer.parseInt(n2);
            int num3=Integer.parseInt(n3);
            int num4=Integer.parseInt(n4);

            int sum=num1+num2+num3+num4;
            int sub=num1-num2-num3-num4;
            int mult=num1*num2*num3*num4;

            String nu1=" "+sum;
            String nu2=" "+sub;
            String nu3=" "+mult;
            String result="sum is"+nu1+"\n"+"sub is "+nu2+"\n"+"mult is"+nu3;
            JOptionPane.showMessageDialog(null,result);
        }
    }

