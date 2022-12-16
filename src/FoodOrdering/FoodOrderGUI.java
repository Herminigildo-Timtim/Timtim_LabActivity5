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
        panel1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    calculator();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator();
            }
        });
    }

    public void calculator(){
        try{
            double res = 0;
            if(cPizza.isSelected()){
                res+=100;
            }
            if(cBurger.isSelected()){
                res+=80;
            }
            if(cFries.isSelected()){
                res+=65;
            }
            if(cSoftDrinks.isSelected()){
                res+=55;
            }
            if(cTea.isSelected()){
                res+=50;
            }
            if(cSundae.isSelected()){
                res+=40;
            }

            if(rb5.isSelected()){
                res *=0.5;
            }else if(rb10.isSelected()){
                res*=0.10;
            }else if(rb15.isSelected()){
                res*=0.15;
            }


        }catch (Exception hermi){
            JOptionPane.showMessageDialog(panel1, hermi.toString());
        }
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setVisible(true);
        app.setSize(300,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
