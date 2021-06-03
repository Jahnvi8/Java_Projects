package swings_intro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class game implements ActionListener {

	Random ran = new Random();
	JFrame jf = new JFrame();
	JPanel pan = new JPanel();
	JPanel btn_pan = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;

	game() {

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(30, 30, 600, 600);
		jf.getContentPane().setBackground(new Color(50, 50, 50));
		jf.setLayout(new BorderLayout());

		textfield.setBackground(new Color(25, 25, 25));
		textfield.setBackground(new Color(25, 255, 0));
		textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setOpaque(true);
		textfield.setText("Tic-Tac-Toe");

		pan.setLayout(new BorderLayout());
		pan.setBounds(0, 0, 600, 80);

		btn_pan.setLayout(new GridLayout(3, 3));
		btn_pan.setBackground(new Color(150, 150, 150));

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			btn_pan.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
			buttons[i].setFocusable(false);
			buttons[i].setBackground(new Color(50, 70, 50));
			buttons[i].addActionListener(this);
		}

		pan.add(textfield);
		jf.add(pan, BorderLayout.NORTH);
		jf.add(btn_pan);

		jf.setVisible(true);
		first_turn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 9; i++) {
			if (e.getSource() == buttons[i]) {
				if (player1_turn) {
					if (buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(250, 0, 0));
						buttons[i].setText("X");
						player1_turn = false;
						textfield.setText("O turn");
						check();
					}
				} else {
					if (buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(0, 0, 250));
						buttons[i].setText("O");
						player1_turn = true;
						textfield.setText("X turn");
						check();
					}
				}
			}
		}

	}

	public void first_turn() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ran.nextInt(2) == 0) {
			player1_turn = true;
			textfield.setText("X turn");
		} else {
			player1_turn = false;
			textfield.setText("O turn");
		}
	}

	public void check() {
// x win
		if ((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X")) {
			xWins(0, 1, 2);
		}
		if ((buttons[3].getText() == "X") && (buttons[4].getText() == "X") && (buttons[5].getText() == "X")) {
			xWins(3, 4, 5);
		}
		if ((buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X")) {
			xWins(6, 7, 8);
		}
		if ((buttons[0].getText() == "X") && (buttons[3].getText() == "X") && (buttons[6].getText() == "X")) {
			xWins(0, 3, 6);
		}
		if ((buttons[1].getText() == "X") && (buttons[4].getText() == "X") && (buttons[7].getText() == "X")) {
			xWins(1, 4, 7);
		}
		if ((buttons[2].getText() == "X") && (buttons[5].getText() == "X") && (buttons[8].getText() == "X")) {
			xWins(2, 5, 8);
		}
		if ((buttons[0].getText() == "X") && (buttons[4].getText() == "X") && (buttons[8].getText() == "X")) {
			xWins(0, 4, 8);
		}
		if ((buttons[2].getText() == "X") && (buttons[4].getText() == "X") && (buttons[6].getText() == "X")) {
			xWins(2, 4, 6);
		}
		// o win
		if ((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O")) {
			oWins(0, 1, 2);
		}
		if ((buttons[3].getText() == "O") && (buttons[4].getText() == "O") && (buttons[5].getText() == "O")) {
			oWins(3, 4, 5);
		}
		if ((buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O")) {
			xWins(6, 7, 8);
		}
		if ((buttons[0].getText() == "O") && (buttons[3].getText() == "O") && (buttons[6].getText() == "O")) {
			oWins(0, 3, 6);
		}
		if ((buttons[1].getText() == "O") && (buttons[4].getText() == "O") && (buttons[7].getText() == "O")) {
			oWins(1, 4, 7);
		}
		if ((buttons[2].getText() == "O") && (buttons[5].getText() == "O") && (buttons[8].getText() == "O")) {
			oWins(2, 5, 8);
		}
		if ((buttons[0].getText() == "O") && (buttons[4].getText() == "O") && (buttons[8].getText() == "O")) {
			oWins(0, 4, 8);
		}
		if ((buttons[2].getText() == "O") && (buttons[4].getText() == "O") && (buttons[6].getText() == "O")) {
			oWins(2, 4, 6);
		}

	}

	public void xWins(int a, int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);

		for (int i = 0; i < 9; i++) {
			buttons[i].setEnabled(false);

		}
		textfield.setText("X wins");
	}

	public void oWins(int a, int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);

		for (int i = 0; i < 9; i++) {
			buttons[i].setEnabled(false);

		}
		textfield.setText("O wins");
	}

}

public class Tic_Tak_Toe {

	public Tic_Tak_Toe() {
	}

	public static void main(String[] args) {
		game ob = new game();

	}

}
