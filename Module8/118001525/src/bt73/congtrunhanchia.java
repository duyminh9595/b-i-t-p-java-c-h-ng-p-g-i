package bt73;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class congtrunhanchia extends JFrame {
	public congtrunhanchia() {
		super("Cộng-Trừ-Nhân-Chia");
		addControls();
		addEvents();
	}

	JButton btnGiai, btnXoa, btnThoat;
	JTextField txtA, txtB, txtKQ;
	JRadioButton rdC, rdT, rdN, rdChia;

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
				txtA.setText("");
				txtB.setText("");
				txtKQ.setText("");
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
				double soA = 0, soB = 0;
				if (rdC.isSelected()) {
					if (txtA.getText().isEmpty()) {
						soA = 0;
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					} else {
						soA = Double.parseDouble(txtA.getText());
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					}

					txtKQ.setText(String.valueOf(soA + soB));
				}
				else if(rdT.isSelected())
				{
					if (txtA.getText().isEmpty()) {
						soA = 0;
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					} else {
						soA = Double.parseDouble(txtA.getText());
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					}

					txtKQ.setText(String.valueOf(soA - soB));
				}
				else if(rdN.isSelected())
				{
					if (txtA.getText().isEmpty()) {
						soA = 0;
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					} else {
						soA = Double.parseDouble(txtA.getText());
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					}

					txtKQ.setText(String.valueOf(soA *soB));
				}
				else if(rdChia.isSelected())
				{
					if (txtA.getText().isEmpty()) {
						soA = 0;
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					} else {
						soA = Double.parseDouble(txtA.getText());
						if (txtB.getText().isEmpty()) {
							soB = 0;
						} else
							soB = Double.parseDouble(txtB.getText());
					}

					txtKQ.setText(String.valueOf(soA /soB));
				}
				else
					JOptionPane.showMessageDialog(null, "Chua chon phep toan");

			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel pnTop = new JPanel();
		JLabel lblTitle = new JLabel("Cộng Trừ Nhân Chia");
		Font ft = new Font("Arial", Font.BOLD, 24);
		lblTitle.setFont(ft);
		lblTitle.setForeground(Color.BLUE);
		pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTop.add(lblTitle);
		con.add(pnTop, BorderLayout.NORTH);

		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BorderLayout());
		con.add(pnCenter, BorderLayout.CENTER);

		JPanel pnLeft = new JPanel();
		pnLeft.setLayout(new GridLayout(7, 3));

		btnGiai = new JButton("Giải");
		btnXoa = new JButton("Xóa");
		btnThoat = new JButton("Thoát");

		btnXoa.setPreferredSize(btnThoat.getPreferredSize());
		btnGiai.setPreferredSize(btnThoat.getPreferredSize());
		JPanel pn1 = new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.add(btnGiai);
		pn1.setBackground(new Color(220, 220, 220));
		pnLeft.add(pn1);
		JPanel pn2 = new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn2.add(btnXoa);
		pn2.setBackground(new Color(220, 220, 220));
		pnLeft.add(pn2);
		JPanel pn3 = new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn3.add(btnThoat);
		pn3.setBackground(new Color(220, 220, 220));
		pnLeft.add(pn3);
		pnLeft.setBackground(new Color(220, 220, 220));
		TitledBorder borderLeft = new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Chon tác vụ");
		pnLeft.setBorder(borderLeft);
		pnCenter.add(pnLeft, BorderLayout.WEST);

		JPanel pnRight = new JPanel();
		pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));

		JPanel pnA = new JPanel();
		pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblA = new JLabel("nhập a:");
		txtA = new JTextField(15);
		pnA.add(lblA);
		pnA.add(txtA);
		pnRight.add(pnA);

		JPanel pnB = new JPanel();
		pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblB = new JLabel("nhập b:");
		txtB = new JTextField(15);
		pnB.add(lblB);
		pnB.add(txtB);
		pnRight.add(pnB);

		ButtonGroup group = new ButtonGroup();

		JPanel pnGroup = new JPanel();
		pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
		pnGroup.setSize(new Dimension(100, 300));
		JPanel pnHang1 = new JPanel();
		pnHang1.setLayout(new FlowLayout(FlowLayout.CENTER));
		rdC = new JRadioButton("Cộng");
		rdT = new JRadioButton("Trừ");
		rdN = new JRadioButton("Nhân");
		rdChia = new JRadioButton("Chia");
		group.add(rdC);
		group.add(rdT);
		group.add(rdN);
		group.add(rdChia);

		pnHang1.add(rdC);
		pnHang1.add(rdT);
		pnGroup.add(pnHang1);

		JPanel pnHang2 = new JPanel();
		pnHang2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnHang2.add(rdN);
		pnHang2.add(rdChia);
		TitledBorder borderGroup = new TitledBorder(BorderFactory.createLineBorder(Color.black), "Chon phep toan");
		pnGroup.setBorder(borderGroup);
		pnGroup.add(pnHang2);
		pnRight.add(pnGroup);

		JPanel pnKQ = new JPanel();
		pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblKQ = new JLabel("Ket qua");
		txtKQ = new JTextField(15);
		pnKQ.add(lblKQ);
		pnKQ.add(txtKQ);
		pnRight.add(pnKQ);
		txtKQ.setEnabled(false);
		TitledBorder borderRight = new TitledBorder(BorderFactory.createLineBorder(Color.red), "Nhap 2 so a va b");
		pnRight.setBorder(borderRight);
		pnCenter.add(pnRight, BorderLayout.CENTER);

		JPanel pnBot = new JPanel();
		pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lbl = new JLabel("Day la 3 hinh vuong nha :3");
		pnBot.add(lbl);
		pnBot.setBackground(new Color(255, 192, 203));
		con.add(pnBot, BorderLayout.SOUTH);
		btnGiai.setFocusable(false);
		btnXoa.setFocusable(false);
		btnThoat.setFocusable(false);
	}

	public void showWindown() {
		this.setSize(500, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
