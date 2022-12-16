package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator();
            }
        });
    }

    public void calculator(){

        try{
            int flag = 0;
            double res = 0;
            double discounted = 0;
            if(cPizza.isSelected()){
                res+=100;
                flag=1;
            }
            if(cBurger.isSelected()){
                res+=80;
                flag=1;
            }
            if(cFries.isSelected()){
                res+=65;
                flag=1;
            }
            if(cSoftDrinks.isSelected()){
                res+=55;
                flag=1;
            }
            if(cTea.isSelected()){
                res+=50;
                flag=1;
            }
            if(cSundae.isSelected()){
                res+=40;
                flag=1;
            }

            int flag2=0;
                if (rb5.isSelected()) {
                    discounted = (res * 0.05);
                    res -= discounted;
                    flag2=1;
                } else if (rb10.isSelected()) {
                    discounted = (res * 0.10);
                    res -= discounted;
                    flag2=1;
                } else if (rb15.isSelected()) {
                    discounted = res * 0.15;
                    res -= discounted;
                    flag2=1;
                }

                if(flag ==0 && flag2==0){
                    JOptionPane.showMessageDialog(panel1,"Please check again if you have checked at least one on Foods and Discount");
                }else{
                    JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f ", res));
                }
        }catch (Exception hermi){
            JOptionPane.showMessageDialog(panel1, hermi.toString());
        }
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setVisible(true);
        app.setSize(700,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
