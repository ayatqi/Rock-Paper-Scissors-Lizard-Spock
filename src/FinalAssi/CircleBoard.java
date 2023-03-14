package FinalAssi;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;


public class CircleBoard extends JPanel {


	private static final long serialVersionUID = 1L;
	private int x1, y1, r1, x2, y2, r2;
	Ellipse2D ellipse, ellipse2;

	public CircleBoard(int x1, int y1, int r1, int x2, int y2, int r2) {
		this.x1 = x1;
        this.y1 = y1;
		this.r1 = r1;
		this.x2 = x2;
        this.y2 = y2;
		this.r2 = r2;

	}

	public CircleBoard(){
		this.x1 = 0;
        this.y1 = 0;
		this.r1 = 1;
		this.x2 = 0;
        this.y2 = 0;
		this.r2 = 1;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		 ellipse = new Ellipse2D.Double(x1, y1, r1, r1);
         ellipse2 = new Ellipse2D.Double(x2, y2, r2, r2);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		g2.draw(ellipse);
        g2.setColor(Color.red);
        g2.draw(ellipse2);
       
	}
}