package bt78;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bt78 {

	private JFrame frame;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt78 window = new bt78();
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
	public bt78() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Input Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 85, 26);
		panel_1.add(lblNewLabel);

		txtInput = new JTextField();
		txtInput.setBounds(97, 14, 178, 20);
		panel_1.add(txtInput);
		txtInput.setColumns(10);

		JButton btnAdd = new JButton("Add Item");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = txtInput.getText();
				demoList.addElement(s);
			}
		});
		btnAdd.setBounds(10, 48, 89, 23);
		panel_1.add(btnAdd);

		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(indexOf!=-1)
				{
					demoList.remove(indexOf);
					indexOf=-1;
				}
			}
		});
		btnRemoveItem.setBounds(107, 48, 106, 23);
		panel_1.add(btnRemoveItem);

		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(indexOf!=-1)
				{
					demoList.add(indexOf, txtInput.getText()); 
					demoList.remove(indexOf+1);
					indexOf=-1;
				}
			}
		});
		btnEditItem.setBounds(228, 48, 89, 23);
		panel_1.add(btnEditItem);
		Dimension minimumSize = new Dimension(100, 100);
		panel.setMinimumSize(minimumSize);
		panel.setLayout(new BorderLayout(0, 0));
		demoList = new DefaultListModel<String>();
		list = new JList(demoList);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(list.getSelectedIndex()!=-1)
				{
					indexOf=list.getSelectedIndex();
					txtInput.setText(demoList.elementAt(indexOf));
				}
				
			}
		});
		panel.add(list, BorderLayout.CENTER);
		frame.getContentPane().add(sp);
		
	}
	int indexOf;
	DefaultListModel<String> demoList;
	JList list;
}
