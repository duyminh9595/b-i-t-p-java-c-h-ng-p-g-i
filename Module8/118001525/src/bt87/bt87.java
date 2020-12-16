package bt87;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bt87 {

	private JFrame frame;
	private JTextField txtMa;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt87 window = new bt87();
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
	public bt87() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);

		Dimension minimumSize = new Dimension(200, 100);
		panel.setMinimumSize(minimumSize);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("M\u00E3 SV");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 92, 28);
		panel_1.add(lblNewLabel);

		txtMa = new JTextField();
		txtMa.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtMa.setBounds(112, 11, 216, 28);
		panel_1.add(txtMa);
		txtMa.setColumns(10);

		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTen.setColumns(10);
		txtTen.setBounds(112, 55, 216, 28);
		panel_1.add(txtTen);

		JLabel lblHTn = new JLabel("H\u1ECD T\u00EAn");
		lblHTn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHTn.setBounds(10, 55, 92, 28);
		panel_1.add(lblHTn);

		JTree tree = new JTree();
		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi T\u00EDnh");
		lblGiiTnh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGiiTnh.setBounds(10, 94, 92, 28);
		panel_1.add(lblGiiTnh);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Nam");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(112, 90, 97, 32);
		panel_1.add(chckbxNewCheckBox);

		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinhVien sv = new SinhVien();
				sv.setMa(txtMa.getText());
				sv.setTen(txtTen.getText());
				if (chckbxNewCheckBox.isSelected())
					sv.setGt("Nam");
				else
					sv.setGt("Nữ");
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath()
						.getLastPathComponent();
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(sv);
				selectedNode.add(newNode);

				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				model.reload();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(39, 145, 89, 43);
		panel_1.add(btnNewButton);

		JButton btnXa = new JButton("X\u00F3a");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
				if(selectedNode!=tree.getModel().getRoot())
				{
					DefaultTreeModel model=(DefaultTreeModel)tree.getModel();
					model.removeNodeFromParent(selectedNode);
					model.reload();
				}
			}
		});
		btnXa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXa.setBounds(168, 145, 89, 43);
		panel_1.add(btnXa);
		panel.setLayout(new BorderLayout(0, 0));

		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("JTree") {
			{
				add(new DefaultMutableTreeNode("NCTH2A"));
				add(new DefaultMutableTreeNode("NCTH2B"));
				add(new DefaultMutableTreeNode("NCTH2C"));
				add(new DefaultMutableTreeNode("NCTH2k"));
			}
		}));
		panel.add(tree, BorderLayout.CENTER);
		frame.getContentPane().add(sp);
	}
}
