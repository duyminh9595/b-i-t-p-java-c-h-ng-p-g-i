package bt77;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input extends JDialog {
	public Input(String title)
	{
		this.setTitle(title);
		addControls();
		addEvents();
	}
	JTextField txt;
	JButton btnOk,btnThoat;
	private void addEvents() {
		// TODO Auto-generated method stub
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Favourite_Philosophers.model.addElement(txt.getText());
				dispose();
			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnLeft=new JPanel();
		pnLeft.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblHinh=new JLabel();
		lblHinh.setIcon(new ImageIcon("src/bt77/hinh.png"));
		pnLeft.add(lblHinh);
		con.add(pnLeft,BorderLayout.WEST);
		
		JPanel pnRight=new JPanel();
		pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));
		JLabel lbl=new JLabel("Enter Name");
		Font ft=new Font("Arial",Font.BOLD,24);
		lbl.setFont(ft);
		pnRight.add(lbl);
		txt=new JTextField(15);;
		pnRight.add(txt);
		
		JPanel pnBut=new JPanel();
		pnBut.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnOk=new JButton("OK");
		btnThoat=new JButton("Cancel");
		pnBut.add(btnOk);
		pnBut.add(btnThoat);
		pnRight.add(pnBut);
		
		con.add(pnRight,BorderLayout.CENTER);
	}
	public void showWindown() {
		this.setSize(400, 150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
