package bt81;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class philosopher extends JFrame {
	public philosopher() {
		super("Favourite Philosophers");
		addControls();
		addEvents();
	}

	JButton btnThem, btnXoa;
	static DefaultTableModel dtm;
	JTable tbl;

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnTop = new JPanel();
		con.add(pnTop, BorderLayout.NORTH);
		btnThem = new JButton("Add Philopsopher");
		pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTop.add(btnThem);
		btnXoa = new JButton("Remove Selected Philosopher");
		pnTop.add(btnXoa);
		JPanel pnMid = new JPanel();
		con.add(pnMid, BorderLayout.CENTER);
		dtm = new DefaultTableModel();
		dtm.addColumn("First Name");
		dtm.addColumn("Last Name");
		dtm.addColumn("Years");
		tbl = new JTable(dtm);
		pnMid.setLayout(new BorderLayout());
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnMid.add(sc, BorderLayout.CENTER);

	}

	public static ArrayList<nguoi> ds = new ArrayList<>();

	private void addEvents() {
		// TODO Auto-generated method stub
		btnThem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add a = new add();
				a.showWindown();
				loadData();
			}
		});
		btnXoa.addMouseListener(new MouseListener() {

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
					ds.remove(row);
				loadData();
			}
		});
	}

	protected static void loadData() {
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

	public void showWindown() {
		this.setSize(400, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
