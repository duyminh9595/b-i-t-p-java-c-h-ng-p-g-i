package bt67;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flowlayout extends JFrame{
    public Flowlayout()
    {
        super("Demo Flowlayout");
        JPanel pnFlow=new JPanel() ;
        pnFlow.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnFlow.setBackground(Color.pink);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Add cac control");
        JButton btn3=new JButton("Tren 1 dong");
        JButton btn4=new JButton("Het cho chua");
        JButton btn5=new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);
    }
    public static void main(String[]args)
    {
        Flowlayout ui=new Flowlayout();
        ui.setSize(400,100);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
