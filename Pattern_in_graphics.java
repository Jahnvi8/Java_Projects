package swings_intro;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class graphic extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.ORANGE);
		g2.setStroke(new BasicStroke(3));

		g2.drawLine(250, 250, 0, 0);
		g2.drawLine(250, 250, 0, 250);
		g2.drawLine(250, 250, 0, 500);
		g2.drawLine(250, 250, 500, 250);
		g2.drawLine(250, 250, 250, 0);
		g2.drawLine(250, 250, 500, 0);
		g2.drawLine(250, 250, 500, 500);
		g2.drawLine(250, 250, 250, 500);

		g2.drawOval(250, 250, 100, 100);
		g2.drawOval(0, 0, 100, 100);
		g2.drawOval(250, 150, 100, 100);
		g2.drawOval(150, 150, 100, 100);
		g2.drawOval(150, 250, 100, 100);
		g2.drawOval(400, 400, 100, 100);
		g2.drawOval(400, 0, 100, 100);
		g2.drawOval(0, 400, 100, 100);
		g2.drawOval(115, 224, 50, 50);
		g2.drawOval(224, 115, 50, 50);
		g2.drawOval(332, 224, 50, 50);
		g2.drawOval(224, 332, 50, 50);
		g2.drawOval(237, 384, 25, 25);
		g2.drawOval(382, 237, 25, 25);
		g2.drawOval(237, 87, 25, 25);
		g2.drawOval(89, 237, 25, 25);

		g2.setColor(Color.LIGHT_GRAY);
		g2.drawOval(85, 85, 80, 80);

		g2.setColor(Color.RED);
		g2.drawOval(76, 76, 80, 80);
		g2.drawOval(95, 95, 80, 80);

		g2.setColor(Color.LIGHT_GRAY);
		g2.drawOval(333, 85, 80, 80);

		g2.setColor(Color.RED);
		g2.drawOval(344, 72, 80, 80);
		g2.drawOval(325, 95, 80, 80);

		g2.setColor(Color.LIGHT_GRAY);
		g2.drawOval(83, 334, 80, 80);

		g2.setColor(Color.RED);
		g2.drawOval(90, 322, 80, 80);
		g2.drawOval(75, 345, 80, 80);

		g2.setColor(Color.LIGHT_GRAY);
		g2.drawOval(340, 334, 80, 80);

		g2.setColor(Color.RED);
		g2.drawOval(330, 322, 80, 80);
		g2.drawOval(350, 344, 80, 80);

		int[] x = { 0, 250, 500, 250 };
		int[] y = { 250, 0, 250, 500 };
		g2.setColor(Color.GREEN);
		g2.drawPolygon(x, y, x.length);

		int[] x2 = { 0, 270, 500, 230 };
		int[] y2 = { 230, 0, 270, 500 };
		g2.setColor(Color.BLUE);
		g2.drawPolygon(x2, y2, x2.length);

		int[] x1 = { 0, 230, 500, 270 };
		int[] y1 = { 270, 0, 230, 500 };
		g2.setColor(Color.RED);
		g2.drawPolygon(x1, y1, x1.length);

		int[] x3 = { 0, 210, 500, 290 };
		int[] y3 = { 290, 0, 210, 500 };
		g2.setColor(Color.YELLOW);
		g2.drawPolygon(x3, y3, x3.length);

		int[] x4 = { 0, 190, 500, 310 };
		int[] y4 = { 310, 0, 190, 500 };
		g2.setColor(Color.PINK);
		g2.drawPolygon(x4, y4, x4.length);

		int[] x5 = { 0, 290, 500, 210 };
		int[] y5 = { 210, 0, 290, 500 };
		g2.setColor(Color.LIGHT_GRAY);
		g2.drawPolygon(x5, y5, x5.length);

		int[] x6 = { 0, 310, 500, 190 };
		int[] y6 = { 190, 0, 310, 500 };
		g2.setColor(Color.CYAN);
		g2.drawPolygon(x6, y6, x6.length);

		GradientPaint p = new GradientPaint(0, 0, Color.BLUE, 500, 250, Color.RED);
		g2.setPaint(p);
		g2.fillOval(250, 250, 100, 100);
		g2.fillOval(250, 150, 100, 100);
		g2.fillOval(150, 250, 100, 100);
		g2.fillOval(150, 150, 100, 100);

		g2.fillOval(115, 224, 50, 50);
		g2.fillOval(224, 115, 50, 50);
		g2.fillOval(332, 224, 50, 50);
		g2.fillOval(224, 332, 50, 50);

		g2.fillOval(237, 384, 25, 25);
		g2.fillOval(382, 237, 25, 25);
		g2.fillOval(237, 87, 25, 25);
		g2.fillOval(89, 237, 25, 25);

		GradientPaint p1 = new GradientPaint(0, 0, Color.BLUE, 400, 350, Color.PINK);
		g2.setPaint(p1);
		g2.fillOval(400, 400, 100, 100);
		g2.fillOval(0, 0, 100, 100);
		g2.fillOval(400, 0, 100, 100);
		g2.fillOval(0, 400, 100, 100);

	}
}

class frame extends JFrame {
	graphic g_obj1 = new graphic();

	public frame() {
		setBounds(50, 50, 515, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		add(g_obj1);
		setResizable(false);
	}
}

public class Pattern_in_graphics {

	public static void main(String[] args) {
		frame o2 = new frame();
	}

}
