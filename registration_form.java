
package swings_intro;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class frame extends JFrame implements ActionListener {

	Container c;
	JLabel title, name, mno, gender, dob, add, res;
	JTextField tname, tmno;
	JTextArea tadd, tout, resadd;
	JRadioButton male, female;
	JComboBox date, month, year;
	JCheckBox term;
	JButton reset, sub;
	ButtonGroup gengp;

	String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
			"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	String months[] = { "January", "february", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
			"2020", "2021" };

	@SuppressWarnings("unchecked")
	public frame() {
		setTitle("Registration Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
		getContentPane().setBackground(new Color(204, 204, 255));

		title = new JLabel("Registration form");
		title.setFont(new Font("Times New Roman", Font.BOLD, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		title.setForeground(new Color(0, 0, 128));
		c.add(title);

		name = new JLabel("Name: ");
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		name.setForeground(new Color(0, 0, 128));
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tname.setSize(200, 20);
		tname.setLocation(200, 100);
		tname.setForeground(new Color(0, 0, 128));
		c.add(tname);

		mno = new JLabel("Mobile: ");
		mno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mno.setSize(190, 20);
		mno.setLocation(100, 150);
		mno.setForeground(new Color(0, 0, 128));
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tmno.setSize(200, 20);
		tmno.setLocation(200, 150);
		tmno.setForeground(new Color(0, 0, 128));
		c.add(tmno);

		gender = new JLabel("Gender: ");
		gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		gender.setForeground(new Color(0, 0, 128));
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Times New Roman", Font.BOLD, 20));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		male.setForeground(new Color(0, 0, 128));
		male.setBackground(new Color(204, 204, 255));
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Times New Roman", Font.BOLD, 20));
		female.setSelected(false);
		female.setSize(95, 20);
		female.setForeground(new Color(0, 0, 128));
		female.setBackground(new Color(204, 204, 255));
		female.setLocation(300, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB: ");
		dob.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		dob.setForeground(new Color(0, 0, 128));
		c.add(dob);

		date = new JComboBox<Object>(dates);
		date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		date.setSize(80, 20);
		date.setLocation(200, 250);
		date.setForeground(new Color(0, 0, 128));
		c.add(date);

		month = new JComboBox<Object>(months);
		month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		month.setSize(80, 20);
		month.setLocation(280, 250);
		month.setForeground(new Color(0, 0, 128));
		c.add(month);

		year = new JComboBox<Object>(years);
		year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		year.setSize(80, 20);
		year.setLocation(360, 250);
		year.setForeground(new Color(0, 0, 128));
		c.add(year);

		add = new JLabel("Address: ");
		add.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add.setSize(100, 20);
		add.setLocation(100, 300);
		add.setForeground(new Color(0, 0, 128));
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tadd.setSize(210, 80);
		tadd.setLocation(200, 300);
		tadd.setLineWrap(true);
		tadd.setForeground(new Color(0, 0, 128));
		c.add(tadd);

		term = new JCheckBox("I Accept Terms And Conditions");
		term.setFont(new Font("Times New Roman", Font.BOLD, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		term.setForeground(new Color(0, 0, 128));
		term.setBackground(new Color(204, 204, 255));
		c.add(term);

		sub = new JButton("SUBMIT");
		sub.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sub.setSize(120, 20);
		sub.setLocation(150, 450);
		sub.setForeground(new Color(0, 0, 128));
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("RESET");
		reset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		reset.setSize(120, 20);
		reset.setLocation(270, 450);
		reset.setForeground(new Color(0, 0, 128));
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		tout.setForeground(new Color(0, 0, 128));
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data = "Name : " + tname.getText() + "\n" + "Mobile : " + tmno.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male" + "\n";
				else
					data1 = "Gender : Female" + "\n";
				String data2 = "DOB : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
						+ (String) year.getSelectedItem() + "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registration Successfull..");
			} else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the" + " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}

class registration_form {

	public static void main(String[] args) {
		frame ob = new frame();

	}

}
