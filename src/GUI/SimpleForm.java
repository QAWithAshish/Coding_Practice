package GUI;

import javax.swing.*;

public class SimpleForm {

    public static void main(String[] args) {

        String userName = JOptionPane.showInputDialog("Please Enter Your Name ");
        JOptionPane.showMessageDialog(null,"Hello "+userName);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Height"));
        JOptionPane.showMessageDialog(null,"You are height is "+height);


    }
}
