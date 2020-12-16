package bt76;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test_jcombobox extends JFrame {
	JComboBox<String>cmb;
	JLabel lbl;
	public test_jcombobox()
	{
		super("Testing JcomboBox");
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		cmb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i=cmb.getSelectedIndex();
				if(i==0)
				{
					ImageIcon icon=new ImageIcon("src/bt76/home_50px.png");
					lbl.setIcon(icon);
				}
				else if(i==1)
				{
					ImageIcon icon=new ImageIcon("src/bt76/search_50px.png");
					lbl.setIcon(icon);
				}
				else
				{
					ImageIcon icon=new ImageIcon("src/bt76/student_male_100px.png");
					lbl.setIcon(icon);
				}
			}
		} );
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
		String[]arr= {"hinh1","hinh2","hinh3"};
		cmb=new JComboBox<>(arr);
		con.add(cmb);
		lbl=new JLabel();
		ImageIcon icon=new ImageIcon("src/bt76/home_50px.png");
		lbl.setIcon(icon);
		con.add(lbl);
	}
	public void showWindown() {
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
