/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt68;

import java.awt.Color;import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dangh
 */
public class Boxlayout extends JFrame{
    public Boxlayout()
    {
        super("Box_LayOut_X_Axis");
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        Font font=new Font("Arial",Font.BOLD|Font.ITALIC,25);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);
        pnBox.add(btn2  );
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);
        Container con=getContentPane();
        con.add(pnBox);
        
    }
    public static void main(String[]args)
    {
        Boxlayout ui = new Boxlayout();
        ui.setSize(600,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
