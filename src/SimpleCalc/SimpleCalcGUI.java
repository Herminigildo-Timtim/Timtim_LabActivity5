package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleCalcGUI  extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;


    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator();
            }
        });
        tfNumber1.addKeyListener(new KeyListener() {
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
        tfNumber2.addKeyListener(new KeyListener() {
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
    }
    public void calculator(){

        try{
            double res = 0;
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            String op = cbOperations.getSelectedItem().toString();
            switch(op){
                case "+":
                    res = num1+num2;
                    break;
                case "-":
                    res = num1-num2;
                    break;
                case "*":
                    res = num1*num2;
                    break;
                case "/":
                    res = num1/num2;
                    break;
            }
            lblResult.setText(String.valueOf(res));
        }catch(Exception hermi){
            JOptionPane.showMessageDialog(panel1, hermi.toString());
        }
    }
    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setVisible(true);
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(700,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
