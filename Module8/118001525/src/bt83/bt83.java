package bt83;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import bt82.nguoi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class bt83 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtChuan;
	private JTextField txtLuong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt83 window = new bt83();
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
	public bt83() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 Nh\u00E2n Vi\u00EAn");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 183, 35);
		frame.getContentPane().add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt1.setBounds(203, 11, 384, 35);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblSSn = new JLabel("S\u1ED1 S\u1EA3n Ph\u1EA9m");
		lblSSn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSSn.setBounds(10, 57, 183, 35);
		frame.getContentPane().add(lblSSn);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBounds(203, 57, 384, 35);
		frame.getContentPane().add(txt2);
		
		JLabel lblPhnXng = new JLabel("Ph\u00E2n X\u01B0\u1EDFng");
		lblPhnXng.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhnXng.setBounds(10, 103, 111, 35);
		frame.getContentPane().add(lblPhnXng);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox.getSelectedIndex()!=0)
					txtChuan.setText("500");
				else
					txtChuan.setText("300");
			}
		});
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(116, 103, 111, 29);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSSnPhm = new JLabel("S\u1ED1 S\u1EA3n Ph\u1EA9m Chu\u1EA9n");
		lblSSnPhm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSSnPhm.setBounds(247, 103, 183, 35);
		frame.getContentPane().add(lblSSnPhm);
		
		txtChuan = new JTextField();
		txtChuan.setText("300");
		txtChuan.setEnabled(false);
		txtChuan.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtChuan.setColumns(10);
		txtChuan.setBounds(450, 103, 104, 35);
		frame.getContentPane().add(txtChuan);
		
		JLabel lblTinLng = new JLabel("Ti\u1EC1n L\u01B0\u01A1ng");
		lblTinLng.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTinLng.setBounds(10, 149, 183, 35);
		frame.getContentPane().add(lblTinLng);
		
		txtLuong = new JTextField();
		txtLuong.setBackground(Color.CYAN);
		txtLuong.setHorizontalAlignment(SwingConstants.CENTER);
		txtLuong.setEnabled(false);
		txtLuong.setForeground(Color.CYAN);
		txtLuong.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtLuong.setColumns(10);
		txtLuong.setBounds(203, 149, 384, 35);
		frame.getContentPane().add(txtLuong);
		
		JButton btnNewButton = new JButton("T\u00EDnh L\u01B0\u01A1ng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt2.getText().isEmpty())
				{
					if(Integer.parseInt(txt2.getText())<=Integer.parseInt(txtChuan.getText()))
						txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format((30000*(Integer.parseInt(txt2.getText()))))));
					else
						txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format((20000*Integer.parseInt(txt2.getText())-Integer.parseInt(txtChuan.getText())+30000*(Integer.parseInt(txt2.getText()))))));
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 198, 111, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnThm = new JButton("Th\u00EAm");
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt2.getText().isEmpty() && !txt1.getText().isEmpty() )
				{
					NhanVien nv=new NhanVien();
					nv.setMaNV(txt1.getText());
					nv.setPhanXuong((String) comboBox.getSelectedItem());
					nv.setSoSP(Integer.parseInt(txt2.getText()));
					ds.add(nv);
					loadNV();
				}
			}
		});
		btnThm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThm.setBounds(131, 198, 111, 47);
		frame.getContentPane().add(btnThm);
		
		JButton btnSa = new JButton("S\u1EEDa");
		btnSa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
				{
					NhanVien nv=new NhanVien();
					nv.setMaNV(txt1.getText());
					nv.setSoSP(Integer.parseInt(txt2.getText()));
					nv.setPhanXuong((String) comboBox.getSelectedItem());
					ds.add(row, nv);
					ds.remove(row+1);
				}
				loadNV();
			}
		});
		btnSa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSa.setBounds(252, 198, 111, 47);
		frame.getContentPane().add(btnSa);
		
		JButton btnXa = new JButton("X\u00F3a");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
					ds.remove(row);
				loadNV();
			}
		});
		btnXa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXa.setBounds(373, 198, 111, 47);
		frame.getContentPane().add(btnXa);
		
		JButton btnng = new JButton("\u0110\u00F3ng");
		btnng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnng.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnng.setBounds(486, 198, 101, 47);
		frame.getContentPane().add(btnng);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 256, 577, 274);
		panel.setLayout(new BorderLayout());
		dtm = new DefaultTableModel();
		dtm.addColumn("Mã Nhân Viên");
		dtm.addColumn("Phân Xưởng");
		dtm.addColumn("Số SP");
		dtm.addColumn("Vượt Chuẩn");
		tbl = new JTable(dtm);
		panel.setLayout(new BorderLayout());
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(sc, BorderLayout.CENTER);
		frame.getContentPane().add(panel);
	}
	protected void loadNV() {
		// TODO Auto-generated method stub
		dtm.setRowCount(0);
		for (NhanVien o : ds) {
			Vector<Object> vec = new Vector<>();
			vec.add(o.getMaNV());
			vec.add(o.getPhanXuong());
			vec.add(o.getSoSP());

			if(Integer.parseInt(txt2.getText())>Integer.parseInt(txtChuan.getText()))
				vec.add(("x"));
			dtm.addRow(vec);
		}
	}
	DefaultTableModel dtm;
	JTable tbl;
	public static ArrayList<NhanVien> ds = new ArrayList<>();
}
