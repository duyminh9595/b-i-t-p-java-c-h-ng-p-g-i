package bt69;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borderlayout extends JFrame{
    public Borderlayout()
    {
        super("BorderLayout");
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth,BorderLayout.NORTH );
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast,BorderLayout.EAST );
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        getContentPane().add(pnBorder);
    }
    public static void main(String[]args)
    {
        Borderlayout ui =new Borderlayout();
        ui.setSize(400,200);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
