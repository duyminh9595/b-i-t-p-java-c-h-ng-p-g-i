package bt71;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TestRadioButton extends JFrame{
	public TestRadioButton()
	{
		super("RadioButton Test");
		addControls();
		addEvents();
	}
	JRadioButton rdPlain,rdBold,rdItalic,rdBoldAndItalic;
	JTextField txtInput;
	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		JPanel pnTop=new JPanel();
		pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		txtInput=new JTextField(30);
		pnTop.add(txtInput);
		con.add(pnTop);
		
		
		JPanel pnBot=new JPanel();
		pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
		ButtonGroup btnGroup=new ButtonGroup();
		rdPlain=new JRadioButton("Plain");
		btnGroup.add(rdPlain);
		pnBot.add(rdPlain);
		rdBold=new JRadioButton("Bold");
		btnGroup.add(rdBold);
		pnBot.add(rdBold);
		rdItalic=new JRadioButton("Italic");
		btnGroup.add(rdItalic);
		pnBot.add(rdItalic);
		rdBoldAndItalic=new JRadioButton("Bold/Italic");
		btnGroup.add(rdBoldAndItalic);
		pnBot.add(rdBoldAndItalic);
		con.add(pnBot);
	}
	
	private void addEvents() {
		// TODO Auto-generated method stub
		rdBold.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Font ft=new Font("Arial", Font.BOLD, 14);
				txtInput.setFont(ft);
			}
		});
		rdItalic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Font ft=new Font("Arial", Font.BOLD, 14);
				txtInput.setFont(ft);
			}
		});
		rdBoldAndItalic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Font ft=new Font("Arial", Font.BOLD|Font.ITALIC, 14);
				txtInput.setFont(ft);
			}
		});
		rdPlain.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Font ft=new Font("Arial", Font.PLAIN, 14);
				txtInput.setFont(ft);
			}
		});
	}
	public void showWindow()
	{
		this.setSize(400, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
