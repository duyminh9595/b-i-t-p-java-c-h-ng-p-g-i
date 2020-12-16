package bt66;

import javax.swing.JFrame;

public class MyWindows extends JFrame{
    public MyWindows()
    {
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        MyWindows ui =new MyWindows();
        ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
