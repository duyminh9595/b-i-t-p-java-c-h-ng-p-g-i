package bt77;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class Favourite_Philosophers extends JFrame {
	public static DefaultListModel<String>model;
	JList<String>lst;
	JButton btnThem,btnXoa;
	public Favourite_Philosophers()
	{
		super("Favourite Philosophers ");
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int k=lst.getSelectedIndex();
				if(k!=-1)
				{
					((DefaultListModel) lst.getModel()).remove(k);
				}
			}
		});
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Input ui=new Input("Input");
				ui.showWindown();
			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnTop=new JPanel();
		pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnThem=new JButton("Add Philosopher");
		pnTop.add(btnThem);
		btnXoa=new JButton("Remove Selected Philosopher");
		pnTop.add(btnXoa);
		con.add(pnTop,BorderLayout.NORTH);
		
		model=new DefaultListModel<>();
		model.addElement("Plato");
		model.addElement("Arisotle");
		lst=new JList<>(model);
		lst.setVisibleRowCount(5);
		lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		con.add(sc,BorderLayout.CENTER);
	}
	public void showWindown() {
		this.setSize(400, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
