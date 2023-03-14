/**
* Class Section: TT4
* Trimester 2 2020/21
* Members:
* Ayat Abdulaziz Gaber Al Khulaqi | 1191202335 | +60 18 293 6294
* Raisa Raad Khan                 | 1191202087 | +880 1962 332069 
*  Tan Pey Yi                     | 1191202254 | +60 16 913 0351
*  Ove Ataul Haque                | 1191202480 | +880 1630 521726
* Sheikh Mohammed Zain            | 1191202496 | +60 11 6984 3518
*/

package Assignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Window1 extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
	private String[] Colours = { "Red", "Green", "Blue", "Yellow", "Grey" };
	private JLabel lb2;
	private String color = "";
	public static String colorname;
	private JPanel panel2, panel3, panel4;
	private JButton Proceed;
	private JComboBox BackgroundColour;

	public static void main(String [] args)
	 {
		Window1 f = new Window1() ;
		 f.setSize(650,550);
		 f.setVisible(true);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
	
	public Window1() {
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		panel1.setBackground(Color. ORANGE);
		panel1.setPreferredSize(new Dimension(100, 45)); 
		
		JLabel lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
		panel1.add(lb1);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(new GridLayout(2,1));
		
		lb2 = new JLabel();
		lb2.setLayout(new GridLayout(2,1));
		lb2.add(new JLabel("<html><span style='font-size:12px;'>"+"Welcome!"+"</span></html>", SwingConstants.CENTER));
		lb2.add(new JLabel("<html><span style='font-size:12px;'>"+"Please select the background color before you proceed"+"</span></html>", SwingConstants.CENTER));
		
		panel3 = new JPanel();
		panel3.setBackground(Color.LIGHT_GRAY);
		BackgroundColour = new JComboBox(Colours);
		BackgroundColour.setSelectedIndex(-1);
		BackgroundColour.setPreferredSize(new Dimension(100, 25)); 
		panel3.add(BackgroundColour);
		
		
		panel2.add(lb2);
		panel2.add(panel3);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.LIGHT_GRAY);
		Proceed = new JButton("<html><span style='font-size:9px; color: blue;'>"+"PROCEED"+"</span></html>");
		Proceed.setPreferredSize(new Dimension(100, 25));
		panel4.add(Proceed);
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		add(panel4,BorderLayout.SOUTH);
		
		BackgroundColour.addActionListener(this);
		Proceed.addActionListener(this);
	}
	
	public void SetBackgroundColour(String color) {
		
		colorname = (String)BackgroundColour.getSelectedItem();
	}

    public String SetBackgroundColour() {
		
    	return colorname;	
	}

	public void actionPerformed(ActionEvent e) {
		
		try {
			
         color = (String)BackgroundColour.getSelectedItem();
       
        
        switch(color) {
        
          case "Red" :   	panel2.setBackground(Color.red);
          				 	panel3.setBackground(Color.red);
          				 	panel4.setBackground(Color.red);
          				 	colorname = "red";
        	  				break;
        	  		  
          case "Green" : 	panel2.setBackground(Color.green);
			 				panel3.setBackground(Color.green);
			 				panel4.setBackground(Color.green);
			 				colorname = "green";
	  		  				break;
	  		  
          case "Blue" : 	panel2.setBackground(Color.blue);
			 				panel3.setBackground(Color.blue);
			 				panel4.setBackground(Color.blue);
			 				colorname = "blue";
	  		  				break;
	  		  
          case "Yellow" : 	panel2.setBackground(Color.yellow);
			 				panel3.setBackground(Color.yellow);
			 				panel4.setBackground(Color.yellow);
			 				colorname = "yellow";
	  		  			 	break;
	  		  
          case "Grey" :     panel2.setBackground(Color.gray);
			 				panel3.setBackground(Color.gray);
			 				panel4.setBackground(Color.gray);
			 				colorname = "grey";
        	  				break;
        }
        
    		if(BackgroundColour.getSelectedIndex() >= 0) {
    			
    			
    			if(e.getSource() == Proceed) {
    			
    			this.setVisible(false);
    			Window2 f = new Window2();
        		f.setSize(650,550);
        		f.setVisible(true);
        	
    		}
    	
         	
         } 
	}
	catch(Exception e1){
			
			//Pop-up message
			JOptionPane.showMessageDialog(null, "Pick a background colour.");
			
		}
}

}

