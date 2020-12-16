package bt90;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

import bt89.ImageAnimation;

public class ImageAnimation2 extends JFrame {
	private static final long serialVersionUID =1L;
	Timer timer;
	private int pos=0;
	public ImageAnimation2(String title)
	{
		super(title);
		timer=new Timer(599, null);
	}
	public void doShow()
	{
		setSize(500, 550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addControl();
		setVisible(true);
	}
	private void addControl() {
		// TODO Auto-generated method stub
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth=new JPanel();
		JButton btnBrowser=new JButton("Browser");
		JButton btnStart=new JButton("Start");
		JButton btnStop=new JButton("Stop");
		pnNorth.add(btnBrowser);
		pnNorth.add(btnStart);
		pnNorth.add(btnStop);
		pnBorder.add(pnNorth,BorderLayout.NORTH);
		
		final JPanel pnCenter=new JPanel();
		pnCenter.setLayout(new CardLayout());
		pnBorder.add(pnCenter,BorderLayout.CENTER);
		pnCenter.setBackground(Color.red);
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timer.start();
				timer.addActionListener(new TimerPanel(pnCenter));
			}
		});
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timer.stop();
			}
		});
		
		btnBrowser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser jfc=new JFileChooser();
				jfc.setMultiSelectionEnabled(true);
				if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
				{
					File[] files=jfc.getSelectedFiles();
					for(int i=0;i<files.length;i++)
					{
						File f=files[i];
						ImageIcon icon=new ImageIcon(f.getPath());
						JPanel pn=new JPanel();
						JLabel lbl=new JLabel(icon);
						pn.add(lbl);
						pnCenter.add(pn,"card"+i);
					}
					showImage(pnCenter, "card0");
				}
			}
		});
		
		Container con=getContentPane();
		con.add(pnBorder);
	}
	private void showImage(JPanel pnCenter, String string) {
		// TODO Auto-generated method stub
		CardLayout cl=(CardLayout)pnCenter.getLayout();
		cl.show(pnCenter, string);
	}
	private class TimerPanel implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			showImage(pn, "card"+pos);
			pos++;
			if(pos>=10)
				pos=1;
		}
		JPanel pn=null;
		public TimerPanel(JPanel pn)
		{
			this.pn=pn;
		}
	}
	public static void main(String[]args)
	{
		ImageAnimation2 ui=new ImageAnimation2("Image animation!");
		ui.doShow();
	}
}
