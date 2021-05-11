package swings_intro;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Myframe extends JFrame implements ActionListener {

	Container con;
	JLabel jl1, jl2;
	JTextField user;
	JPasswordField pass;
	JButton b;

	Myframe() {
		setTitle("Login Form");

		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 128, 128));
		con = getContentPane();
		con.setLayout(null);

		ImageIcon i = new ImageIcon("C:\\Users\\janvi\\OneDrive\\Desktop\\java\\src\\swings_intro\\user.jpg");
		setIconImage(i.getImage());

		jl1 = new JLabel("Username:");
		jl1.setFont(new Font("New Times Roman", Font.ITALIC + Font.BOLD, 16));
		jl1.setForeground(new Color(77, 0, 0));

		jl2 = new JLabel("Password:");
		jl2.setFont(new Font("New Times Roman", Font.BOLD + Font.ITALIC, 16));
		jl2.setForeground(new Color(77, 0, 0));

		jl1.setBounds(10, 40, 100, 20);
		jl2.setBounds(10, 80, 100, 20);

		con.add(jl1);
		con.add(jl2);

		user = new JTextField();
		user.setBounds(105, 40, 150, 20);
		con.add(user);
		pass = new JPasswordField();
		pass.setBounds(105, 80, 150, 20);
		con.add(pass);

		b = new JButton("Login");
		b.setBounds(105, 120, 100, 25);
		con.add(b);

		b.addActionListener(this);

		setVisible(true);

	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Username: " + user.getText());
		System.out.println("Password: " + pass.getText());
	}

}

public class login_form {

	public static void main(String[] args) {
		Myframe mf = new Myframe();

	}

}
