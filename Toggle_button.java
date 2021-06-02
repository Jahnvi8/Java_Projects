package swings_intro;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Toggle_button extends JFrame implements ActionListener {

	private Color cd;
	JToggleButton bt = new JToggleButton("SWITCH ME ON");
	Container c = getContentPane();

	public Toggle_button() {
		setBounds(10, 10, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		c.setLayout(null);
		cd = c.getBackground();
		bt.setBounds(70, 90, 150, 40);
		c.add(bt);

		bt.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (bt.isSelected()) {
			c.setBackground(Color.YELLOW);
			bt.setText("SWITCH ME OFF");
		} else {
			c.setBackground(cd);
			bt.setText("SWITCH ME ON");
		}
	}

	public static void main(String[] args) {
		new Toggle_button();

	}

}
