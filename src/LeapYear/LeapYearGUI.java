package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    private LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checker();
            }
        });
        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    checker();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public void checker(){
        try{
            int year = Integer.parseInt(tfYear.getText());
            if (year % 400 == 0 || ((year % 4 == 0) && (year%100!=0))) {
                JOptionPane.showMessageDialog(panel1, "Leap year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a leap year");
            }
        } catch (Exception hermi) {
            JOptionPane.showMessageDialog(panel1, hermi.toString());
        }
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
        app.setContentPane(app.panel1);
        app.setSize(300,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
