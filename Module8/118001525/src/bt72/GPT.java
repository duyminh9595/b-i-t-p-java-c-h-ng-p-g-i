package bt72;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class GPT extends JFrame {
	public GPT()
	{
		super("GIai phuong trinh bac 2");
		addControls();
		addEvents();
	}
	JTextField txtA,txtB,txtC,txtKQ;
	JButton btnGiai,btnXoa,btnThoat;
	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel pnTop=new JPanel();
		JLabel lblTitle=new JLabel("Giai phuong trinh bac 2");
		Font ft=new Font("Arial", Font.BOLD, 24);
		lblTitle.setFont(ft);
		lblTitle.setForeground(Color.black);
		pnTop.setBackground(Color.gray);
		pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTop.add(lblTitle);
		con.add(pnTop,BorderLayout.NORTH);
		
		JPanel pnCenter=new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));

		con.add(pnCenter,BorderLayout.CENTER);
		
		JPanel pnA=new JPanel();
		pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblA=new JLabel("a: ");
		Font ftlabel=new Font("Arial", Font.BOLD, 14);
		lblA.setFont(ftlabel);
		txtA=new JTextField(20);
		pnA.add(lblA);
		pnA.add(txtA);
		pnCenter.add(pnA);
		
		JPanel pnB=new JPanel();
		pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblB=new JLabel("b: ");
		lblB.setFont(ftlabel);
		txtB=new JTextField(20);
		pnB.add(lblB);
		pnB.add(txtB);
		pnCenter.add(pnB);
		
		JPanel pnC=new JPanel();
		pnC.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblC=new JLabel("c: ");
		lblC.setFont(ftlabel);
		txtC=new JTextField(20);
		pnC.add(lblC);
		pnC.add(txtC);
		pnCenter.add(pnC);
		
		JPanel pnKQ=new JPanel();
		pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblKQ=new JLabel("Ket Qua");
		lblKQ.setFont(ftlabel);
		pnKQ.add(lblKQ);
		pnCenter.add(pnKQ);
		
		JPanel pnOutput=new JPanel();
		txtKQ=new JTextField(22);
		txtKQ.setEnabled(false);
		txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
		pnOutput.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnOutput.add(txtKQ);
		pnCenter.add(pnOutput);
		
		TitledBorder borderCenter=new TitledBorder(BorderFactory.createLineBorder(Color.red), 
				"Nhap a,b,c");
		pnCenter.setBorder(borderCenter);
		
		JPanel pnBot=new JPanel();
		pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnGiai=new JButton("Giai");
		btnXoa=new JButton("Xoa trang");
		btnThoat=new JButton("Thoat");
		pnBot.add(btnGiai);
		pnBot.add(btnXoa);
		pnBot.add(btnThoat);
		TitledBorder borderBot=new TitledBorder(BorderFactory.createLineBorder(Color.blue), 
				"Chon thao tac");
		pnBot.setBorder(borderBot);
		con.add(pnBot,BorderLayout.SOUTH);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnThoat.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
		btnXoa.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				txtKQ.setText("");
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
			}
		});
		btnGiai.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					double a=Double.parseDouble(txtA.getText());
					double b=Double.parseDouble(txtB.getText());
					double c=Double.parseDouble(txtC.getText());
					double delta = b*b - 4*a*c;
					double x1;
					double x2;
			        // tính nghiệm
			        if (delta > 0) {
			            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
			            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
			           txtKQ.setText("x1 = " + x1 + " và x2 = " + x2);
			        } else if (delta == 0) {
			            x1 = (-b / (2 * a));
			            txtKQ.setText("x1 = x2 = " + x1);
			        } else {
			        	txtKQ.setText("Phương trình vô nghiệm!");
			        }
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Input khong hop le");
				}
			}
		});
	}
	public void showWindown()
	{
		this.setSize(500, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
