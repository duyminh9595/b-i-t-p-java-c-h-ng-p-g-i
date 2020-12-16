package bt85;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bt82.nguoi;
import bt84.SanPham;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class bt85 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt85 window = new bt85();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bt85() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);

		Dimension minimumSize = new Dimension(200, 100);
		panel.setMinimumSize(minimumSize);
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel_1);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Sinh Vien");
		lblNewLabel.setBounds(10, 11, 76, 21);
		panel.add(lblNewLabel);
		
		txtMa = new JTextField();
		txtMa.setBounds(10, 43, 180, 20);
		panel.add(txtMa);
		txtMa.setColumns(10);
		
		JLabel lblHTn = new JLabel("Họ Tên");
		lblHTn.setBounds(10, 74, 76, 21);
		panel.add(lblHTn);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(10, 106, 180, 20);
		panel.add(txtTen);
		
		JLabel lblGiiTnh = new JLabel("Mã Lớp");
		lblGiiTnh.setBounds(10, 137, 76, 21);
		panel.add(lblGiiTnh);
		
		JLabel lblimMn = new JLabel("Điểm Môn 1");
		lblimMn.setBounds(10, 200, 76, 21);
		panel.add(lblimMn);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(10, 232, 180, 20);
		panel.add(txt1);
		
		JLabel lblimMn_1 = new JLabel("Điểm Môn 2");
		lblimMn_1.setBounds(10, 263, 76, 21);
		panel.add(lblimMn_1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(10, 295, 180, 20);
		panel.add(txt2);
		
		JLabel lblimTrungBnh = new JLabel("Điểm Trung Bình");
		lblimTrungBnh.setBounds(10, 333, 76, 21);
		panel.add(lblimTrungBnh);
		
		txtTB = new JTextField();
		txtTB.setEditable(false);
		txtTB.setEnabled(false);
		txtTB.setColumns(10);
		txtTB.setBounds(10, 365, 180, 20);
		panel.add(txtTB);
		
		JLabel lblKtQu = new JLabel("Kết Quả");
		lblKtQu.setBounds(10, 396, 76, 21);
		panel.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setEnabled(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(10, 428, 180, 20);
		panel.add(txtKQ);
		
		JButton btnKtQu = new JButton("Kết Quả");
		btnKtQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt1.getText().isEmpty()&&!txt2.getText().isEmpty())
				{
					txtTB.setText(String.valueOf((Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText())/2)));
					if(Double.parseDouble(txtTB.getText())>=5)
						txtKQ.setText("Đậu");
					else
						txtKQ.setText("Rớt");
				}
			}
		});
		
		btnKtQu.setBounds(10, 459, 89, 23);
		panel.add(btnKtQu);
		
		JButton btnThm = new JButton("Thêm");
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinhVien sv=new SinhVien();
				sv.setMa(txtMa.getText());
				sv.setTen(txtTen.getText());
				sv.setLop(txtLop.getText());
				sv.setDiem1(Double.parseDouble(txt1.getText()));
				sv.setDiem2(Double.parseDouble(txt2.getText()));
				dsSv.add(sv);
				loadSV();
			}
		});
		btnThm.setBounds(109, 459, 89, 23);
		panel.add(btnThm);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
					dsSv.remove(row);
				loadSV();
			}
		});
		btnXa.setBounds(52, 496, 89, 23);
		panel.add(btnXa);
		
		txtLop = new JTextField();
		txtLop.setColumns(10);
		txtLop.setBounds(10, 169, 180, 20);
		panel.add(txtLop);
		panel_1.setLayout(new BorderLayout());
		frame.getContentPane().add(sp);
		dtm = new DefaultTableModel();
		dtm.addColumn("Mã SV");
		dtm.addColumn("Tên SV");
		dtm.addColumn("Ma Lop");
		dtm.addColumn("Diem 1");
		dtm.addColumn("Diem 2");
		dtm.addColumn("Diem TB");
		dtm.addColumn("Kết Quả");
		tbl = new JTable(dtm);
tbl.addMouseListener(new MouseListener() {
			
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
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
				{
					txtMa.setText((String)tbl.getValueAt(row, 0));
					txtTen.setText((String)tbl.getValueAt(row, 1));
					txtLop.setText((String)tbl.getValueAt(row, 2));
					txt1.setText(String.valueOf((double)tbl.getValueAt(row, 3)));
					txt2.setText(String.valueOf((double)tbl.getValueAt(row, 4)));
					txtKQ.setText(String.valueOf((Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText())/2)));
					if(Double.parseDouble(txtKQ.getText())>=5)
						txtKQ.setText("Đậu");
					else
						txtKQ.setText("Rớt");
				}
			}
		});
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel_1.add(sc,BorderLayout.CENTER);
	}
	protected void loadSV() {
		// TODO Auto-generated method stub
		dtm.setRowCount(0);
		for (SinhVien sv: dsSv) {
			Vector<Object> vec = new Vector<>();
			vec.add(sv.getMa());
			vec.add(sv.getTen());
			vec.add(sv.getLop());
			vec.add(sv.getDiem1());
			vec.add(sv.getDiem2());
			vec.add(txtTB.getText());
			vec.add(txtKQ.getText());
			dtm.addRow(vec);
		}
	}
	DefaultTableModel dtm;
	ArrayList<SinhVien>dsSv=new ArrayList<>();
	JTable tbl;
	private JTextField txtMa;
	private JTextField txtTen;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtTB;
	private JTextField txtKQ;
	private JTextField txtLop;

}
