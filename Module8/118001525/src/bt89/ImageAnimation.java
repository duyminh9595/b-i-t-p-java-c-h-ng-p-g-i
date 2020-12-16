package bt89;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageAnimation extends JFrame {
		private static final long serialVersionUID=1L;
		private int pos=1;
		Timer timer;
		public ImageAnimation(String title)
		{
			super(title);
			timer=new Timer(500,null);
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
			JButton btnStart=new JButton("Start");
			JButton btnStop=new JButton("Stop");
			pnNorth.add(btnStart);
			pnNorth.add(btnStop);
			pnBorder.add(pnNorth,BorderLayout.NORTH);
			
			final JPanel pnCenter=new JPanel();
			pnCenter.setLayout(new CardLayout());
			pnBorder.add(pnCenter,BorderLayout.CENTER);
			pnCenter.setBackground(Color.red);
			JPanel []pnArr=new JPanel[10];
			addImage(pnCenter,pnArr);
			showImage(pnCenter,"card1");
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
			Container con=getContentPane();
			con.add(pnBorder);
		}
		private void showImage(JPanel pnCenter, String string) {
			// TODO Auto-generated method stub
			CardLayout cl=(CardLayout)pnCenter.getLayout();
			cl.show(pnCenter, string);
		}
		private void addImage(JPanel pnCenter, JPanel[] pnArr) {
			// TODO Auto-generated method stub
			for(int i=0;i<pnArr.length;i++)
			{
				pnArr[i]=new JPanel();
				JLabel lbl=new JLabel();
				ImageIcon icon=new ImageIcon("E:\\hoa\\"+i+".jpg");
				lbl.setIcon(icon);
				pnArr[i].add(lbl);
				pnCenter.add(pnArr[i],"card"+i);
			}
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
			ImageAnimation ui=new ImageAnimation("Image animation!");
			ui.doShow();
		}
}
