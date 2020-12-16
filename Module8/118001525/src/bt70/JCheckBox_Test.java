package bt70;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCheckBox_Test extends JFrame {

    JCheckBox chkBold;
    JCheckBox chkItalic;
    JTextField txtInput;

    public JCheckBox_Test() {
        super("JCheckBox Test");
        addControls();
        addEvents();

    }

    private void addControls() {

        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        txtInput = new JTextField(15);
        pnTop.add(txtInput);
        con.add(pnTop, BorderLayout.CENTER);
        JPanel pnBot = new JPanel();
        chkBold = new JCheckBox("Bold");
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        chkItalic = new JCheckBox("Italic");
        pnBot.add(chkBold);
        pnBot.add(chkItalic);
        con.add(pnBot, BorderLayout.SOUTH);
    }

    private void addEvents() {
        chkBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkBold.isSelected()) {
                    if (chkItalic.isSelected()) {
                        Font ft = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    } else {
                        Font ft = new Font("Arial", Font.BOLD, 14);
                        txtInput.setFont(ft);
                    }
                } else {
                    if (chkItalic.isSelected()) {
                        Font ft = new Font("Arial",  Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    } else {
                        Font ft = new Font("Arial", Font.PLAIN, 14);
                        txtInput.setFont(ft);
                    }
                }
            }
        });
        chkItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkBold.isSelected()) {
                    if (chkItalic.isSelected()) {
                        Font ft = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    } else {
                        Font ft = new Font("Arial", Font.BOLD, 14);
                        txtInput.setFont(ft);
                    }
                } else {
                    if (chkItalic.isSelected()) {
                        Font ft = new Font("Arial",  Font.ITALIC, 14);
                        txtInput.setFont(ft);
                    } else {
                        Font ft = new Font("Arial", Font.PLAIN, 14);
                        txtInput.setFont(ft);
                    }
                }
            }
        });
    }

}
