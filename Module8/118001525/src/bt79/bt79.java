package bt79;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.List;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Checkbox;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class bt79 {

	private JFrame frame;
	private JTextField txtInPut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt79 window = new bt79();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bt79() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thao t\u00E1c tr\u00EAn JList - CheckBox");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 614, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		LineBorder linedBorder = new LineBorder(Color.RED);
		panel.setBounds(234, 87, 390, 363);
		panel.setBorder(BorderFactory.createTitledBorder(linedBorder,"Nhập thông tin:"));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNhp = new JButton("Nhập");
		btnNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Double d = Double.parseDouble(txtInPut.getText());
					if(checkam%2==0)
					{
						demoList.addElement(Math.abs(d));
					}
					else
					{
						demoList.addElement(Math.abs(d)*(-1));
					}
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Khong phai so");
				}
				txtInPut.setText("");
			}
		});
		btnNhp.setBounds(10, 26, 111, 42);
		panel.add(btnNhp);
		
		txtInPut = new JTextField();
		txtInPut.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		txtInPut.setBounds(131, 26, 137, 42);
		panel.add(txtInPut);
		txtInPut.setColumns(10);
		
		checkbox = new Checkbox("Cho Âm");
		checkbox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				++checkam;
			}
		});
		checkbox.setBounds(274, 23, 95, 45);
		panel.add(checkbox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 95, 370, 257);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		demoList = new DefaultListModel<Double>();
		list = new JList(demoList);
		panel_2.add(list, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-19, 64, 388, 363);
		panel_1.setBounds(10, 87, 216, 363);
		panel_1.setBorder(BorderFactory.createTitledBorder(linedBorder,"Chọn tác vụ:"));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn1 = new JButton("Tô Đen Số Chẵn");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list.setBackground(Color.white);
				int[]a=new int[demoList.getSize()];
				for(int i=0;i<demoList.getSize();i++)
				{
					a[i]=-1;
					if(demoList.get(i)%2==0)
					{
						a[i]=i;
					}
				}

				list.setSelectedIndices(a);
				list.setSelectionBackground(Color.BLUE);
			}
		});
		btn1.setBounds(10, 24, 196, 42);
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("Tô Đen Số Lẻ");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[]a=new int[demoList.getSize()];
				list.setBackground(Color.white);
				for(int i=0;i<demoList.getSize();i++)
				{
					a[i]=-1;
					if(demoList.get(i)%2==1)
					{
						a[i]=i;
					}
				}

				list.setSelectedIndices(a);
				list.setSelectionBackground(Color.BLUE);
			}
		});
		btn2.setBounds(10, 75, 196, 42);
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("Tô Đen Số Nguyên Tố");
		btn3.setBounds(10, 128, 196, 42);
		panel_1.add(btn3);
		
		JButton btn4 = new JButton("Bỏ Tô Đen");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setSelectionBackground(Color.white);
			}
		});
		btn4.setBounds(10, 181, 196, 42);
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("Xóa Các Giá Trị Tô Đen");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[]as=list.getSelectedIndices();
				int a=demoList.getSize()-1;
				for(int i=as.length-1;i>=0;i--)
				{
					for(int j=a;j>=0;j--)
					{
						if(j==as[i])
						{
							demoList.remove(j);
							a=j;
							break;
						}
						
					}
				}
			}
		});
		btn5.setBounds(10, 234, 196, 42);
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("Tổng Các Giá Trị Trong JList");
		btn6.setBounds(10, 287, 196, 42);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d=0;
				for(int i=0;i<demoList.getSize();i++)
					d+=demoList.get(i);
				JOptionPane.showMessageDialog(null, "Tong la: "+d);
			}
		});
		panel_1.add(btn6);
	}
	DefaultListModel<Double> demoList;
	JList list;
	Checkbox checkbox;
	int checkam=0;
}
