package bt88;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.plaf.SeparatorUI;
import javax.swing.JMenu;

public class bt88 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt88 window = new bt88();
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
	public bt88() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("Open... \t Ctrl+0");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Rights  Management Service");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu mnNewMenu_13 = new JMenu("Credential Management...");
		mnNewMenu_3.add(mnNewMenu_13);
		
		JMenu mnNewMenu_14 = new JMenu("Server Setting...");
		mnNewMenu_3.add(mnNewMenu_14);
		
		mnNewMenu_3.add(new JSeparator());
		
		JMenu mnNewMenu_15 = new JMenu("Restricted Access");
		mnNewMenu_15.setEnabled(false);
		mnNewMenu_3.add(mnNewMenu_15);
		
		
		
		JMenu menu = new JMenu("Close \t Ctrl+W");
		mnNewMenu.add(menu);
		
		JMenu mnNewMenu_4 = new JMenu("Close All");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Save \t Ctrl+S");
		mnNewMenu_5.setEnabled(false);
		mnNewMenu.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Save As... \t Ctrl+S");
		mnNewMenu.add(mnNewMenu_6);

		mnNewMenu.add(new JSeparator());
		JMenu mnNewMenu_7 = new JMenu("Email...");
		mnNewMenu.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Share");
		mnNewMenu.add(mnNewMenu_8);
		mnNewMenu.add(new JSeparator());
		JMenu mnNewMenu_9 = new JMenu("Print... \t Ctrl+P");
		mnNewMenu.add(mnNewMenu_9);
		mnNewMenu.add(new JSeparator());
		JMenu mnNewMenu_10 = new JMenu("Properties... \t Ctrl+D");
		mnNewMenu.add(mnNewMenu_10);
		
		mnNewMenu.add(new JSeparator());
		
		JMenu mnNewMenu_11 = new JMenu("Recent Files");
		mnNewMenu.add(mnNewMenu_11);
		
		mnNewMenu.add(new JSeparator());
		
		JMenu mnNewMenu_12 = new JMenu("Exit \t Ctrl+Q");
		mnNewMenu.add(mnNewMenu_12);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_16 = new JMenu("Undo");
		mnNewMenu_16.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_16);
		
		JMenu mnNewMenu_17 = new JMenu("Path");
		mnNewMenu_17.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_17);
		
		mnNewMenu_1.add(new JSeparator());
		
		JMenu mnNewMenu_18 = new JMenu("Cut");
		mnNewMenu_18.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_18);
		
		JMenu mnNewMenu_19 = new JMenu("Copy");
		mnNewMenu_19.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_19);
		
		JMenu mnNewMenu_20 = new JMenu("Paste");
		mnNewMenu_20.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_20);
		
		JMenu mnNewMenu_21 = new JMenu("Delete");
		mnNewMenu_21.setEnabled(false);
		mnNewMenu_1.add(mnNewMenu_21);
		mnNewMenu_1.add(new JSeparator());
		
		JMenu mnNewMenu_22 = new JMenu("Select All");
		mnNewMenu_1.add(mnNewMenu_22);
		
		JMenu mnNewMenu_23 = new JMenu("Deselect All");
		mnNewMenu_1.add(mnNewMenu_23);
		
		mnNewMenu_1.add(new JSeparator());
		
		JMenu mnNewMenu_24 = new JMenu("Add Bookmarks");
		mnNewMenu_1.add(mnNewMenu_24);
		
		JMenu mnNewMenu_25 = new JMenu("Links");
		mnNewMenu_1.add(mnNewMenu_25);
		
		JMenu mnNewMenu_26 = new JMenu("Rectangle Links");
		mnNewMenu_25.add(mnNewMenu_26);
		
		JMenu mnNewMenu_27 = new JMenu("Polygon Links");
		mnNewMenu_25.add(mnNewMenu_27);
		
		mnNewMenu_1.add(new JSeparator());
		
		JMenu mnNewMenu_28 = new JMenu("Attach A File");
		mnNewMenu_1.add(mnNewMenu_28);
		
		mnNewMenu_1.add(new JSeparator());
		
		JMenu mnNewMenu_29 = new JMenu("Add Image");
		mnNewMenu_1.add(mnNewMenu_29);
		
		JMenu mnNewMenu_30 = new JMenu("Add Multimedia");
		mnNewMenu_1.add(mnNewMenu_30);
	}

}
