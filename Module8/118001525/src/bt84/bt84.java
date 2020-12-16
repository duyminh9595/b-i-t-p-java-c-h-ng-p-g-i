package bt84;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import bt83.NhanVien;

import java.awt.Font;
import java.awt.color.CMMException;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
public class bt84 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt84 window = new bt84();
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
	public bt84() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Write Data to Disk");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Open Data from Disk");
		mnNewMenu.add(mnNewMenu_2);
		
		mnNewMenu.add(new JSeparator());
		
		JMenu mnNewMenu_3 = new JMenu("Exit");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mnNewMenu_3);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD S\u1EA3n Ph\u1EA9m");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 736, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 52, 736, 479);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		LineBorder linedBorder = new LineBorder(Color.RED);
		panel_1.setBorder(BorderFactory.createTitledBorder(linedBorder,"Danh mục sản phẩm"));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel_1, panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 509, 169);
		
		
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Chi Tiết");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, BorderLayout.NORTH);
		dtm = new DefaultTableModel();
		dtm.addColumn("ID");
		dtm.addColumn("Name");
		dtm.addColumn("UnitPrice");
		dtm.addColumn("Quantity");
		dtm.addColumn("Description");
		tbl = new JTable(dtm);
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		tbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
				{
					sp3=new SanPham();
					sp3.setID((String)tbl.getValueAt(row, 0));
					sp3.setName((String)tbl.getValueAt(row, 1));
					sp3.setPrice((int)tbl.getValueAt(row, 2));
					sp3.setQuantity(((int)tbl.getValueAt(row, 3)));
					sp3.setDessciption((String)tbl.getValueAt(row, 4));
					
					txtID.setText(sp3.getID());
					txtName.setText(sp3.getName());
					txtPrice.setText(String.valueOf(sp3.getPrice()));
					txtQ.setText(String.valueOf(sp3.getQuantity()));
					txtTxtd.setText(sp3.getDessciption());
					
				}
			}
		});
		panel_3.add(sc, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Category:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(111, 191, 98, 20);
		panel_2.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mặt hàng điện tử", "Mặt hàng hóa chất", "Mặt hàng gia dụng", "Hàng hàng"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(258, 191, 207, 20);
		panel_2.add(comboBox);
		
		JLabel lblProductId = new JLabel("Product ID");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductId.setBounds(111, 222, 98, 20);
		panel_2.add(lblProductId);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtID.setBounds(258, 222, 207, 20);
		panel_2.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtName.setColumns(10);
		txtName.setBounds(258, 253, 207, 20);
		panel_2.add(txtName);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductName.setBounds(111, 253, 98, 20);
		panel_2.add(lblProductName);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrice.setColumns(10);
		txtPrice.setBounds(258, 284, 207, 20);
		panel_2.add(txtPrice);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUnitPrice.setBounds(111, 284, 98, 20);
		panel_2.add(lblUnitPrice);
		
		txtQ = new JTextField();
		txtQ.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtQ.setColumns(10);
		txtQ.setBounds(258, 315, 207, 20);
		panel_2.add(txtQ);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQuantity.setBounds(111, 315, 98, 20);
		panel_2.add(lblQuantity);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescription.setBounds(111, 365, 98, 37);
		panel_2.add(lblDescription);
		
		txtTxtd = new JTextField();
		txtTxtd.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTxtd.setColumns(10);
		txtTxtd.setBounds(258, 346, 207, 74);
		panel_2.add(txtTxtd);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SanPham sp=new SanPham();
				sp.setDanhmuc((String)comboBox.getSelectedItem());
				sp.setID(txtID.getText());
				sp.setName(txtName.getText());
				sp.setPrice(Integer.parseInt(txtPrice.getText()));
				sp.setQuantity(Integer.parseInt(txtQ.getText()));
				sp.setDessciption(txtTxtd.getText());
				lst.add(sp);
				for(SanPham sp1:lst)
				{
					if(sp1.getDanhmuc().equals((String)list.getSelectedValue()))
					{
						Vector<Object> vec = new Vector<>();
						vec.add(sp1.getID());
						vec.add(sp1.getName());
						vec.add(sp1.getPrice());
						vec.add(sp1.getQuantity());
						vec.add(sp1.getDessciption());
						dtm.addRow(vec);
					}
							
				}
			}
		});
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNew.setBounds(93, 437, 89, 29);
		panel_2.add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dtm.setRowCount(0);
				for(int i=0;i<lst.size();i++)
				{
					if(lst.get(i).getID().equals(sp3.getID())&&lst.get(i).getName().equals(sp3.getName()))
					{
						lst.remove(i);
						break;
					}
				}
				sp3.setDanhmuc((String)comboBox.getSelectedItem());
				sp3.setID(txtID.getText());
				sp3.setName(txtName.getText());
				sp3.setPrice(Integer.parseInt(txtPrice.getText()));
				sp3.setQuantity(Integer.parseInt(txtQ.getText()));
				sp3.setDessciption(txtTxtd.getText());
				lst.add(sp3);
				for(SanPham sp1:lst)
				{
					if(sp1.getDanhmuc().equals((String)list.getSelectedValue()))
					{
						Vector<Object> vec = new Vector<>();
						vec.add(sp1.getID());
						vec.add(sp1.getName());
						vec.add(sp1.getPrice());
						vec.add(sp1.getQuantity());
						vec.add(sp1.getDessciption());
						dtm.addRow(vec);
					}
							
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(208, 437, 89, 29);
		panel_2.add(btnSave);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = tbl.getSelectedRow();
				if (row == -1)
					return;
				else
				{
					SanPham sp=new SanPham();
					sp.setID((String)tbl.getValueAt(row, 0));
					sp.setName((String)tbl.getValueAt(row, 1));
					for(int i=0;i<lst.size();i++)
					{
						if(lst.get(i).getID().equals(sp.getID())&&lst.get(i).getName().equals(sp.getName()))
						{
							lst.remove(i);
							break;
						}
					}
					dtm.setRowCount(0);
					for(SanPham sp1:lst)
					{
						if(sp1.getDanhmuc().equals((String)list.getSelectedValue()))
						{
							Vector<Object> vec = new Vector<>();
							vec.add(sp1.getID());
							vec.add(sp1.getName());
							vec.add(sp1.getPrice());
							vec.add(sp1.getQuantity());
							vec.add(sp1.getDessciption());
							dtm.addRow(vec);
						}
								
					}
				}
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRemove.setBounds(334, 437, 89, 29);
		panel_2.add(btnRemove);
		Dimension minimumSize = new Dimension(200, 100);
		panel_1.setMinimumSize(minimumSize);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				dtm.setRowCount(0);
				for(SanPham sp:lst)
				{
					if(sp.getDanhmuc().equals((String)list.getSelectedValue()))
					{
						Vector<Object> vec = new Vector<>();
						vec.add(sp.getID());
						vec.add(sp.getName());
						vec.add(sp.getPrice());
						vec.add(sp.getQuantity());
						vec.add(sp.getDessciption());
						dtm.addRow(vec);
					}
							
				}
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.BOLD, 14));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mặt hàng điện tử", "Mặt hàng hóa chất", "Mặt hàng gia dụng", "Hàng hàng"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.add(list, BorderLayout.CENTER);
		panel.add(sp);
		lst=new ArrayList<>();
		
		
	}
	String danhmucSelected="";
	ArrayList<SanPham>lst;
	DefaultTableModel dtm;
	JTable tbl;
	JList list;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtPrice;
	private JTextField txtQ;
	SanPham sp3;
	private JTextField txtTxtd;
}
