package bt82;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bt82.nguoi;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class bt82 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt82 window = new bt82();
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
	public bt82() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Number");
		lblNewLabel.setBounds(10, 11, 144, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(164, 11, 260, 23);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblAccountName = new JLabel("Account Name");
		lblAccountName.setBounds(10, 48, 144, 26);
		frame.getContentPane().add(lblAccountName);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(164, 48, 260, 23);
		frame.getContentPane().add(txt2);
		
		JLabel lblAccountMoney = new JLabel("Account Money");
		lblAccountMoney.setBounds(10, 85, 144, 26);
		frame.getContentPane().add(lblAccountMoney);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(164, 85, 260, 23);
		frame.getContentPane().add(txt3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 122, 414, 284);
		panel.setLayout(new BorderLayout());
		dtm = new DefaultTableModel();
		dtm.addColumn("Acc Name");
		dtm.addColumn("Acc Number");
		dtm.addColumn("Acc Money");
		tbl = new JTable(dtm);
		panel.setLayout(new BorderLayout());
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(sc, BorderLayout.CENTER);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nguoi o=new nguoi();
				o.setFirstName(txt1.getText());
				o.setLastName(txt2.getText());
				o.setYears(txt3.getText());
				ds.add(o);
				loadData();
			}
		});
		btnNewButton.setBounds(82, 417, 89, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
					ds.remove(row);
				loadData();
			}
		});
		btnClear.setBounds(181, 417, 89, 48);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(280, 417, 89, 48);
		frame.getContentPane().add(btnExit);
	}
	protected void loadData() {
		// TODO Auto-generated method stub
		dtm.setRowCount(0);
		for (nguoi o : ds) {
			Vector<Object> vec = new Vector<>();
			vec.add(o.getFirstName());
			vec.add(o.getLastName());
			vec.add(o.getYears());

			dtm.addRow(vec);
		}
	}
	DefaultTableModel dtm;
	JTable tbl;
	public static ArrayList<nguoi> ds = new ArrayList<>();
}
