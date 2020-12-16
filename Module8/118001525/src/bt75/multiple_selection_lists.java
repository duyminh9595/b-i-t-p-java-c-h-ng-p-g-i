package bt75;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class multiple_selection_lists extends JFrame {
	public multiple_selection_lists() {
		super("Multiple Selection Lists");
		addControls();
		addEvents();
	}

	DefaultListModel modelTen;
	DefaultListModel modelOut;
	JList<String> lst;
	JList<String> lst1;
	JButton btnC;

	private void addEvents() {
		// TODO Auto-generated method stub
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object[] arr = lst.getSelectedValues();
				for (Object data : arr) {
					modelOut.addElement(data);
				}
				lst1.setModel(modelOut);
				String data = "";
				for (int i = 0; i < lst1.getModel().getSize(); i++) {
					data += String.valueOf(lst1.getModel().getElementAt(i)) + ";";
				}
				luuTextFile("data",data);
			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
		modelTen = new DefaultListModel<>();
		modelTen.addElement("Black");
		modelTen.addElement("Blue");
		modelTen.addElement("Dark Gray");

		lst = new JList<>(modelTen);
		JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		lst.setVisibleRowCount(5);
		lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		btnC = new JButton("Copy >>>>");
		Font ft = new Font("Arial", Font.BOLD, 20);
		btnC.setFont(ft);
		modelOut = new DefaultListModel<>();
		String[]arr=docTextFile("data");
		if(arr!=null)
		{
			for(int i=0;i<arr.length;i++)
			{
				modelOut.addElement(arr[i]);
			}
		}
		lst1 = new JList<>(modelOut);
		lst1.setVisibleRowCount(5);
		JScrollPane sc1 = new JScrollPane(lst1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		con.add(sc);
		con.add(btnC);
		con.add(sc1);

	}

	void luuTextFile(String filename, String data) {
		try {
			FileOutputStream fOut = new FileOutputStream(filename);
			PrintWriter print = new PrintWriter(fOut, true);
			print.println(data);
			print.close();
			fOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	String[] docTextFile(String filename) {
		try {
			FileInputStream fIn = new FileInputStream(filename);
			Scanner sc = new Scanner(fIn);
			String[]data = null;
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				data=s.split(";");
			}
			fIn.close();
			sc.close();
			return data;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public void showWindown() {
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
