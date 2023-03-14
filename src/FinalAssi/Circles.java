package FinalAssi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
public class Circles extends JFrame implements ActionListener,MouseListener, MouseMotionListener {

 public JPanel Panel,Panel1, Panel2, Panel3, Panel4, Panel5, Panel6, Panel7, BoardPanel;
 public JButton Redraw;
 public static String ans = "Two circles intersect? ";
 public static Label circlesIntersect;
 public JTextField x1txt, y1txt, r1txt, x2txt, y2txt, r2txt;
 public int x1,y1,r1,x2,y2,r2;
 public int x_1,y_1,x_2,y_2;


 CircleBoard circleBoard = new CircleBoard(50, 50, 100, 100, 70, 50);

 public Circles() {
     super();
     
     Panel = new JPanel();
     circlesIntersect = new Label(ans + "No");
	 Panel.add(circlesIntersect);
     
     Border blackline = BorderFactory.createLineBorder(Color.black);
     GridLayout layout = new GridLayout(1,1);
     layout.setHgap(0);

     GridLayout layout2 = new GridLayout(2,1);
     layout2.setHgap(0);

     Panel1 = new JPanel(layout2);
     Panel1.setPreferredSize(new Dimension(600, 340));
   
     circleBoard.setPreferredSize(new Dimension(600, 340));
     Panel1.add(circleBoard);
		
     
     Panel2 = new JPanel();
     Panel2.setLayout(layout2);
     Panel2.setBorder(blackline);
     
     
     // This panel  will contain the data of two circles
     Panel4 = new JPanel();
     Panel4.setLayout(layout);
    
     
     // This panel  will contain the data of circle one
     Panel5 = new JPanel();
     Panel5.setPreferredSize(new Dimension(100,50));
     Panel5.setBorder(blackline);

     
     JLabel lb2 = new JLabel("Enter circle 1 info :");
     JPanel SubPanel1 = new JPanel();
     SubPanel1.setLayout(new GridLayout(3,1));
     JLabel Centerx1 =  new JLabel("Center x : ");
     x1txt = new JTextField(5);
     
     JLabel Centery1 =  new JLabel("Center y : ");
     y1txt = new JTextField(5);
     JLabel Centerr1 =  new JLabel("Radius r : ");
     r1txt = new JTextField(5);
     
     Panel5.add(lb2);
     SubPanel1.add(Centerx1);
     SubPanel1.add(x1txt);
     SubPanel1.add(Centery1);
     SubPanel1.add(y1txt);
     SubPanel1.add(Centerr1);
     SubPanel1.add(r1txt);
     Panel5.add(SubPanel1);
     add(circleBoard);
     // This panel  will contain the data of circle two
     
     Panel6 = new JPanel();
     Panel6.setPreferredSize(new Dimension(140,110));
     Panel6.setBorder(blackline);
     
     JLabel lb3 = new JLabel("Enter circle 2 info :");
     
     JLabel Centerx2 =  new JLabel("Center x : ");
     x2txt = new JTextField(5);
     JLabel Centery2 =  new JLabel("Center y : ");
     y2txt = new JTextField(5);
     JLabel Centerr2 =  new JLabel("Radius r : ");
     r2txt = new JTextField(5);
     
     Panel6.add(lb3);
     JPanel SubPanel2 = new JPanel();
     SubPanel2.setLayout(new GridLayout(3,1));
     SubPanel2.add(Centerx2);
     SubPanel2.add(x2txt);
     SubPanel2.add(Centery2);
     SubPanel2.add(y2txt);
     SubPanel2.add(Centerr2);
     SubPanel2.add(r2txt);
     Panel6.add(SubPanel2);
     
     
     Panel4.add(Panel5);
     Panel4.add(Panel6);
     
     
     Panel7 = new JPanel();
     Redraw = new JButton("<html><span style='font-size:9px; color: black;'>"+"Redraw Circles"+"</span></html>");
     Redraw.setSize(new Dimension(90, 25));
     Redraw.setBackground(Color.LIGHT_GRAY);
         
     Panel7.add(Redraw);
     Panel2.add(Panel4);
     Panel2.add(Panel7, FlowLayout.CENTER);

     this.setLayout(new BorderLayout());
     
     //call the constructor of the panel
     this.add(Panel, BorderLayout.NORTH);
     this.add(Panel1, BorderLayout.CENTER);
     this.add(Panel2, BorderLayout.SOUTH);
     

     Redraw.addActionListener(this);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
     try {
          x1    = Integer.parseInt(x1txt.getText());
          y1    = Integer.parseInt(y1txt.getText());
          r1    = Integer.parseInt(r1txt.getText());
          x2    = Integer.parseInt(x2txt.getText());
          y2    = Integer.parseInt(y2txt.getText());
          r2    = Integer.parseInt(r2txt.getText());

       
         // // Add board to Panel1 
         
         Panel1.remove(circleBoard);

         circleBoard = new CircleBoard(x1, y1, r1, x2, y2, r2);
         Panel1.add(circleBoard);

         Panel1.revalidate();
         Panel1.repaint();
         if (e.getSource() == Redraw) {
			 
			  // dx and dy are the vertical and horizontal distances
		        double dx = x2 - x1;
		        double dy = y2 - y1;

		        // Determine the straight-line distance between centers.
		        double distance = Math.sqrt((dy * dy) + (dx * dx));

		        // Check Intersections
		        if (distance > Math.abs(r1 + r2)) {
		            // Circles do not intersect
		        	circlesIntersect.setText(ans + "No");
		        	
		        } 
		        if (distance < Math.abs(r1 - r2)) {
		            //One circle is contained in the other
		        	circlesIntersect.setText(ans + "Yes");
		        
		        } else {
		        	circlesIntersect.setText(ans + "No");
		        }
		        
		
		 }



     } catch (Exception ex){
     
         //Pop-up message
         JOptionPane.showMessageDialog(null, "Fill in all blanks.");
         
     }
 }

 public static void main(String[] args) {
     Circles circles = new Circles();
     circles.setSize(400,380);
     circles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     circles.setVisible(true);
   
 }



@Override
public void mouseDragged(MouseEvent e) {
	
	  if (circleBoard.ellipse.contains(e.getX(), e.getY())) {
          

		  x_1 = e.getX();
		  y_1 = e.getY();
		  
		  x1txt.setText(String.valueOf(x_1));
          y1txt.setText(String.valueOf(y_1));
          

      } else if (circleBoard.ellipse2.contains(e.getX(), e.getY())) {
	        x_2 = e.getX();
	        y_2 = e.getY();
	        
	        x2txt.setText(String.valueOf(x_2));
	        y2txt.setText(String.valueOf(y_2));
	      
	    }
	  
   
}
@Override
 public void mousePressed(MouseEvent e) {
	 	
	 if (circleBoard.ellipse.contains(e.getX(), e.getY()) || circleBoard.ellipse2.contains(e.getX(), e.getY())) {
	        x_1 = e.getX();
	        y_1 = e.getY();
	        x_2 = e.getX();
	        y_2 = e.getY();
	        
	        circleBoard = new CircleBoard(x_1, y_1, r1, x_2, y_2, r2);
	    }
		
	 	circleBoard.repaint();
	 }

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
 


}
