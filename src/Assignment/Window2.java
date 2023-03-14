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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Window2 extends JFrame implements ActionListener  
{
    //declaring GUI objects
    JFrame frame = new JFrame("...");
    private final String[] Colours = { "Red", "Green", "Blue", "Yellow", "Grey" };
    private String BackgroundColour;
    private JPanel p2, pA,pB,pC,pCsub1,pCsub2,pD,p3,pE,pF,pG,pGsub1,pGsub2,pH,p4;
    private JTextField tfPlayer1, tfPlayer2, tfPlayer3, tfPlayer4,tfshow1,tfshow2;
    private JLabel lb1, lb2,lb3,LTeam1, LTeam2, Lplayer1, Lplayer2,Lplayer3,Lplayer4;
    private JButton  btn1, btn2, nex;
    
  
    public static void main(String[] args)
    {
        Window2 frame = new Window2(); 
        frame.setSize(650,550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Window2() 
    {
        //constructor 
    	BackgroundColour = Window1.colorname;
    	
        tfPlayer1 = new JTextField(15);
        tfPlayer2 = new JTextField(15);
        tfPlayer3 = new JTextField(15);
        tfPlayer4 = new JTextField(15);
   
        tfshow1 = new JTextField(15);
        tfshow1.setEditable(false);
   
        tfshow2 = new JTextField(15);
        tfshow2.setEditable(false);
   
        btn1 = new JButton("Enter"); 
        btn2 = new JButton("Enter");  
        nex = new JButton("Next");
   
        lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lb2 = new JLabel("<html><span style='font-size:12px;'>" + "Enter Player Names:");
        lb3 = new JLabel("<html><span style='font-size:12px;'>" + "Enter Player Names:");
        LTeam1 = new JLabel("<html><span style='font-size:12px;'>" + "Team 1");
        LTeam2 = new JLabel("<html><span style='font-size:12px;'>"+"Team 2");
        Lplayer1 = new JLabel("Player 1: ");
        Lplayer2 = new JLabel("Player 2: ");  
        Lplayer3 = new JLabel("Player 1: ");
        Lplayer4 = new JLabel("Player 2: ");  
        
        //PANELS
        JPanel p1 = new JPanel();
        p1.setBackground(Color. ORANGE);
        p1.setPreferredSize(new Dimension(100, 45)); 
        p1.add((lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock "+BackgroundColour))); 
        p1.add(lb1);
   
        p2 = new JPanel();
        p2.setBorder(new EmptyBorder(80,50,30,50));
        p2.setLayout(new GridLayout(5,1));
    
            //subpanel for TEAM 1
        pA= new JPanel();
        pA.add(LTeam1);

        pB= new JPanel();
        pB.add(lb2);

        pC = new JPanel();
        pC.setLayout(new GridLayout(2,1));
        
        // ---- sub panel sub for team 1 players
             pCsub1 = new JPanel();
             pCsub1.setLayout(new FlowLayout(FlowLayout.LEFT));
             pCsub1.add((Lplayer1 = new JLabel("Player 1: "))); 
             pCsub1.add(tfPlayer1);
        
             pCsub2 = new JPanel();
             pCsub2.setLayout(new FlowLayout(FlowLayout.LEFT));
             pCsub2.add((Lplayer2 = new JLabel("Player 2: "))); 
             pCsub2.add(tfPlayer2);
            
             pC.add(pCsub1);
             pC.add(pCsub2);
        
            // ---- sub panel positions
            pD = new JPanel();
           
            pD.add(btn1);
            pD.add(tfshow1);
        
            p2.add(pA,BorderLayout.CENTER);
            p2.add(pB,BorderLayout.CENTER);
            p2.add(pC,BorderLayout.CENTER);
            p2.add(pD,BorderLayout.CENTER);

        //subpanel_END for TEAM 1
    
        // TEAM 2 
        p3 = new JPanel();
 
        p3.setLayout(new GridLayout(5,1));
        p3.setBorder(new EmptyBorder(80,50,30,50));

        //subpanel for team 2
        pE= new JPanel();
        pE.add(LTeam2);

        pF= new JPanel();
        pF.add(lb3);

        pG = new JPanel();
        pG.setLayout(new GridLayout(2,1));
        
           // ---- sub panel sub for team2 players
           pGsub1 = new JPanel();
           pGsub1.setLayout(new FlowLayout(FlowLayout.LEFT));
           pGsub1.add((Lplayer3 = new JLabel("Player 1: "))); 
           pGsub1.add(tfPlayer3);
        
           pGsub2 = new JPanel();
           pGsub2.setLayout(new FlowLayout(FlowLayout.LEFT));  
           pGsub2.add((Lplayer4 = new JLabel("Player 2: "))); 
           pGsub2.add(tfPlayer4);
            
           pG.add(pGsub1);
           pG.add(pGsub2);
        
            // ---- sub panel positions
 
            pH = new JPanel();
            pH.add(btn2);
            pH.add(tfshow2);
        
            p3.add(pE,BorderLayout.EAST);
            p3.add(pF,BorderLayout.EAST);
            p3.add(pG,BorderLayout.EAST);
            p3.add(pH,BorderLayout.EAST);

        // PANELS position
         p4 = new JPanel();
        
        //p4.setBorder(new EmptyBorder(80,50,30,50));
        p4.add(nex);
    
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);  
        add(p3, BorderLayout.EAST);
        add(p4, BorderLayout.SOUTH);
        
        switch(BackgroundColour) {
        
        case "red" :   	p2.setBackground(Color.red);
        				pA.setBackground(Color.red);
        				pB.setBackground(Color.red);
        				pC.setBackground(Color.red);
        				pCsub1.setBackground(Color.red);
        				pCsub2.setBackground(Color.red);
        				pD.setBackground(Color.red);
        				p3.setBackground(Color.red);
        				pE.setBackground(Color.red);
        				pF.setBackground(Color.red);
        				pG.setBackground(Color.red);
        				pGsub1.setBackground(Color.red);
        				pGsub2.setBackground(Color.red);
        				pH.setBackground(Color.red);
        				p4.setBackground(Color.red);
        				 	
      	  				break;
      	  		  
        case "green" : 	   	p2.setBackground(Color.green);
							pA.setBackground(Color.green);
							pB.setBackground(Color.green);
							pC.setBackground(Color.green);
							pCsub1.setBackground(Color.green);
							pCsub2.setBackground(Color.green);
							pD.setBackground(Color.green);
							p3.setBackground(Color.green);
							pE.setBackground(Color.green);
							pF.setBackground(Color.green);
							pG.setBackground(Color.green);
							pGsub1.setBackground(Color.green);
							pGsub2.setBackground(Color.green);
							pH.setBackground(Color.green);
							p4.setBackground(Color.green);
			 				
	  		  				break;
	  		  
        case "blue" : 		p2.setBackground(Color.blue);
							pA.setBackground(Color.blue);
							pB.setBackground(Color.blue);
							pC.setBackground(Color.blue);
							pCsub1.setBackground(Color.blue);
							pCsub2.setBackground(Color.blue);
							pD.setBackground(Color.blue);
							p3.setBackground(Color.blue);
							pE.setBackground(Color.blue);
							pF.setBackground(Color.blue);
							pG.setBackground(Color.blue);
							pGsub1.setBackground(Color.blue);
							pGsub2.setBackground(Color.blue);
							pH.setBackground(Color.blue);
							p4.setBackground(Color.blue);
	  		  				break;
	  		  
        case "yellow" : 		p2.setBackground(Color.yellow);
        						pA.setBackground(Color.yellow);
        						pB.setBackground(Color.yellow);
        						pC.setBackground(Color.yellow);
        					    pCsub1.setBackground(Color.yellow);
        						pCsub2.setBackground(Color.yellow);
        						pD.setBackground(Color.yellow);
        						p3.setBackground(Color.yellow);
        						pE.setBackground(Color.yellow);
        						pF.setBackground(Color.yellow);
        						pG.setBackground(Color.yellow);
        						pGsub1.setBackground(Color.yellow);
        						pGsub2.setBackground(Color.yellow);
        						pH.setBackground(Color.yellow);
        						p4.setBackground(Color.yellow);
	  		  			 	break;
	  		  
        case "grey" :   	p2.setBackground(Color.gray);
							pA.setBackground(Color.gray);
							pB.setBackground(Color.gray);
							pC.setBackground(Color.gray);
							pCsub1.setBackground(Color.gray);
							pCsub2.setBackground(Color.gray);
							pD.setBackground(Color.gray);
							p3.setBackground(Color.gray);
							pE.setBackground(Color.gray);
							pF.setBackground(Color.gray);
							pG.setBackground(Color.gray);
							pGsub1.setBackground(Color.gray);
							pGsub2.setBackground(Color.gray);
							pH.setBackground(Color.gray);
							p4.setBackground(Color.gray);
      	  				break;
      }
  
        //register the components to the listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        nex.addActionListener(this);
}

    public static String a;
    public static String b;
    public static String c;
    public static String d;
    
    @Override
    //Displaying players name
    public void actionPerformed(ActionEvent e) 
    {
       
            
        
        a = (tfPlayer1.getText());
        b = (tfPlayer2.getText());
        c= (tfPlayer3.getText());
        d = (tfPlayer4.getText());
     
        String show1;
        String show2;
 
        
        if(e.getSource()== btn1)
        {
            show1 = a+(" "+b);
            tfshow1.setText(String.valueOf(show1)); 
        }
        else if(e.getSource()== btn2)
        {
            show2 = c+(" "+d);
            tfshow2.setText(String.valueOf(show2)); 
        }
        
       if(tfPlayer1.getText().isEmpty() && tfPlayer2.getText().isEmpty() && tfPlayer3.getText().isEmpty() && tfPlayer4.getText().isEmpty())
        {
            nex.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Please input Players name.");
        }
        else
        {
            nex.setEnabled(true);
        
            if(e.getSource()== nex)
            {
                this.setVisible(false);
                Window3 frame = new Window3();
                frame.setSize(650,550);
                frame.setVisible(true);
                frame.setLayout(new BorderLayout());
            }    
        }
        
        
    }
    
}
