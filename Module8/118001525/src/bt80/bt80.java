package bt80;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bt80 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt80 window = new bt80();
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
	public bt80() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLabel label_1,label,lblNewLabel;
	JSlider slider,slider_1,slider_2;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		slider = new JSlider();
		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblNewLabel.setText("Red "+slider.getValue());

				panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
			}
		});
		slider.setMaximum(250);
		slider.setBounds(10, 32, 200, 26);
		frame.getContentPane().add(slider);
		
		slider_1 = new JSlider();
		slider_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("Blue "+slider_1.getValue());

				panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
			}
		});
		slider_1.setBounds(10, 112, 200, 26);
		frame.getContentPane().add(slider_1);
		
		slider_2 = new JSlider();
		slider_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				label_1.setText("Green "+slider_2.getValue());
				panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
			}
		});
		slider_2.setBounds(10, 198, 200, 26);
		frame.getContentPane().add(slider_2);
		
		panel = new JPanel();
		panel.setBounds(294, 50, 130, 130);
		frame.getContentPane().add(panel);
		
		lblNewLabel = new JLabel("Red");
		lblNewLabel.setBounds(10, 11, 93, 20);
		frame.getContentPane().add(lblNewLabel);
		
		label = new JLabel("Blue");
		label.setBounds(10, 83, 93, 20);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("Green");
		label_1.setBounds(10, 163, 93, 20);
		frame.getContentPane().add(label_1);

		panel.setBackground(new Color(slider.getValue(),slider_1.getValue(),slider_2.getValue()));
	}
	JPanel panel;
}
