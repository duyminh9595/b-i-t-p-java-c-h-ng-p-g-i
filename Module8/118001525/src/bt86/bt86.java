package bt86;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class bt86 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt86 window = new bt86();
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
	public bt86() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int i=0;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTree tree = new JTree();
		frame.getContentPane().add(tree, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAddChild = new JButton("Add Child");
		btnAddChild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
				DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("Con "+(i+1));
				++i;
				selectedNode.add(newNode);
				
				DefaultTreeModel model=(DefaultTreeModel)tree.getModel();
				model.reload();
			}
		});
		panel.add(btnAddChild);
		
		JButton btnAddSibling = new JButton("Add Sibling");
		btnAddSibling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("Con "+(i+1));
				++i;
				DefaultMutableTreeNode t=(DefaultMutableTreeNode)tree.getModel().getRoot();
				t.add(newNode);
				DefaultTreeModel model=(DefaultTreeModel)tree.getModel();
				model.reload();
			
			}
		});
		panel.add(btnAddSibling);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
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
		panel.add(btnNewButton);
	}

}
