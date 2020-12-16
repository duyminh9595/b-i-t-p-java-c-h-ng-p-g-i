package bt74;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class listdemo extends JFrame {
	JList<String>lst;
	JLabel lbl;
	public listdemo()
	{
		super("Listdemo");
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		lst.addMouseListener(new MouseListener() {
			
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
				lbl.setText(String.valueOf(lst.getSelectedValue()));
			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		lbl=new JLabel("Ngay");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		con.add(lbl,BorderLayout.NORTH);
		DefaultListModel ngayModel=new DefaultListModel<>();
		ngayModel.addElement("Monday");
		ngayModel.addElement("Tuesday");
		ngayModel.addElement("Wednesday");
		ngayModel.addElement("Thursday");
		ngayModel.addElement("Friday");
		ngayModel.addElement("Saturday");
		ngayModel.addElement("Sunday");
		
		lst=new JList(ngayModel);
		lst.setSelectedIndex(0);
		lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lbl.setText(String.valueOf(lst.getSelectedValue()));
		JScrollPane sc=new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS	, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		con.add(sc,BorderLayout.CENTER	);
		
		
	}
	public void showWindown() {
		this.setSize(200, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
