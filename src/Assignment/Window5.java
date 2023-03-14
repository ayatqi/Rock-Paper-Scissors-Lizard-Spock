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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class Window5 extends JFrame implements ActionListener  
{
     JFrame frame = new JFrame("...");
      private JButton  btn1,replay;
      private String BackgroundColour;
    int t1p1,t1p2,totalpoint1,totalpoint2;
    int t2p1,t2p2;
    int rows,col;
    private JLabel winner,congr;
      public JLabel round,lb1, lb2,lb3,lb4,lb5,a,lbtm1,lbtm2,pointtm1,pointtm2,b, c, d, e, f,a1, b1, c1, d1, e1, f1,total1, total,tl1, tl2, tl3, tl4, tl5, tl6, tl7, tl8,tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8;//lbImage=left lbImage2=right
      private JPanel p2,pA,p3,p4,t1,t2,t3,t4,t5,t6;
      int count=1;
      
           
      public static void main(String[] args)
    {
       Window5 frame = new Window5(); 
        frame.setSize(650,550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
      public Window5()
      {

    
    	BackgroundColour = Window1.colorname;
        Window3 win3 = new Window3();
        
        Window4 win4 = new Window4();
        
        
       
        
          
        lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lb2 = new JLabel("<html><span style='font-size:12px;'>" + Window2.a); //Windows 2 input
        lb3 = new JLabel("<html><span style='font-size:12px;'>" + Window2.b);
        lb4 = new JLabel("<html><span style='font-size:12px;'>" + Window2.c);
        lb5 = new JLabel("<html><span style='font-size:12px;'>" + Window2.d);
        
        lbtm1 = new JLabel("Team 1:");
        lbtm2 = new JLabel("Team 2:");
        pointtm1 = new JLabel("");
        pointtm2 = new JLabel("");
        
        congr = new JLabel("Congratulations! ");
        winner = new JLabel("");
        
        
        btn1 = new JButton("Exit"); 
        replay = new JButton("Replay");
        //TABLE variables
        a = new JLabel("Player 1"); 
        b = new JLabel("Round 1");
        c = new JLabel("Round 2");
        d = new JLabel("Round 3");
        e = new JLabel("Team 1 :"+Window2.a);
        f = new JLabel("Team 2 :"+Window2.c);
        total = new JLabel("Total");
        
        a1 = new JLabel("Player 2"); 
        b1 = new JLabel("Round 1");
        c1 = new JLabel("Round 2");
        d1 = new JLabel("Round 3");
        e1 = new JLabel("Team 1 :"+Window2.b);
        f1 = new JLabel("Team 2 : "+Window2.d);
        total1 = new JLabel("Total");
        
        tl1 = new JLabel(win3.t1value1);
        tl2 = new JLabel(win3.t1value2);
        tl3 = new JLabel(win3.t1value3);
        tl4 = new JLabel(win3.t1value4);
        tl5 = new JLabel(win3.t1value5);
        tl6 = new JLabel(win3.t1value6);
        tl7 = new JLabel(win3.t1value7);
        tl8 = new JLabel(win3.t1value8);
        
        tb1 = new JLabel(win4.t2value1);
        tb2 = new JLabel(win4.t2value2);
        tb3 = new JLabel(win4.t2value3);
        tb4 = new JLabel(win4.t2value4);
        tb5 = new JLabel(win4.t2value5);
        tb6 = new JLabel(win4.t2value6);
        tb7 = new JLabel(win4.t2value7);
        tb8 = new JLabel(win4.t2value8);
        
    
//PANEL STARTS
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color. ORANGE);
        p1.setPreferredSize(new Dimension(100, 45)); 
        p1.add((lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock"))); 
        p1.add(lb1);
         
        
        p2 = new JPanel();
        p2.setBackground(Color.YELLOW);
        p2.setBorder(new EmptyBorder(80,50,30,50));
        p2.setLayout(new GridLayout(2,1));
        
        //SUB panel for p2
         pA= new JPanel();
            pA.setBackground(Color.YELLOW);
            pA.setLayout(new GridLayout(4,2));
            pA.add(lbtm1);
            pA.add(pointtm1);
            pA.add(lbtm2);
            pA.add(pointtm2);
            pA.add(congr);
            pA.add(winner);
            pA.add(btn1); 
            pA.add(replay,BorderLayout.EAST);
            
            p2.add(pA,BorderLayout.WEST);
        p3 = new JPanel();
        p3.setBackground(Color.YELLOW);

        p4 = new JPanel();
        p4.setBackground(Color.YELLOW);
        p4.setBorder(new LineBorder(Color.BLACK, 3));
        p4.setLayout(new GridLayout(7,5));
        
        t4 = new JPanel();
            t4.setLayout(new GridLayout(1,5));
            t4.add(a1);
            t4.add(b1);
            t4.add(c1);
            t4.add(d1);
            t4.add(total1);
        
             t5 = new JPanel();
            t5.setLayout(new GridLayout(1,5));
            t5.add(e1);
            t5.add(tb1);
            t5.add(tb2);
            t5.add(tb3);
            t5.add(tb4);
            
             t6 = new JPanel();
            t6.setLayout(new GridLayout(1,5));
            t6.add(f1);
            t6.add(tb5);
            t6.add(tb6);
            t6.add(tb7);
            t6.add(tb8);
            
            t1 = new JPanel();
            t1.setLayout(new GridLayout(1,5));
            t1.add(a);
            t1.add(b);
            t1.add(c);
            t1.add(d);
            t1.add(total);
        
             t2 = new JPanel();
            t2.setLayout(new GridLayout(1,5));
            t2.add(e);
            t2.add(tl1);
            t2.add(tl2);
            t2.add(tl3);
            t2.add(tl4);
            
            t3 = new JPanel();
            t3.setLayout(new GridLayout(1,5));
            t3.add(f);
            t3.add(tl5);
            t3.add(tl6);
            t3.add(tl7);
            t3.add(tl8);
            
            
        
            p4.add(t1);
            p4.add(t2);
            p4.add(t3);     
            p4.add(t4);
            p4.add(t5);
            p4.add(t6);   
            
         
  
           
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST); 
        add(p4, BorderLayout.SOUTH);
        add(p3, BorderLayout.CENTER);
        
        t1p1 = Integer.parseInt(tb4.getText());
        t2p1 = Integer.parseInt(tb8.getText());
        t1p2 = Integer.parseInt(tl4.getText());
        t2p2 = Integer.parseInt(tl8.getText());
        
        totalpoint1 = t1p1+t1p2;
        totalpoint2 = t2p1+t2p2;
        
        pointtm1.setText(Integer.toString(totalpoint1));
        pointtm2.setText(Integer.toString(totalpoint2));
        
        
        if(totalpoint1<totalpoint2)
        {
            winner.setText("Team 2");
            replay.setVisible(false);
        }
        else if(totalpoint1>totalpoint2)
        {
            winner.setText("Team 1");
            replay.setVisible(false);
        }
        else
        {
            winner.setText("Draw ! Please Replay");
            btn1.setVisible(false);
        }
        
        
switch(BackgroundColour) {
        
        case "red" :   	p2.setBackground(Color.red);
        				pA.setBackground(Color.red);
                                        p3.setBackground(Color.red);
        				p4.setBackground(Color.red);
        			
        				t1.setBackground(Color.red);
        				t2.setBackground(Color.red);
        				t3.setBackground(Color.red);
                                        t4.setBackground(Color.red);
        				t5.setBackground(Color.red);
        				t6.setBackground(Color.red);
      	  				break;
      	  		  
        case "green" : 	p2.setBackground(Color.green);
						pA.setBackground(Color.green);
                                                p3.setBackground(Color.green);
						p4.setBackground(Color.green);
						
						t1.setBackground(Color.green);
        				t2.setBackground(Color.green);
        				t3.setBackground(Color.green);
                                        	t4.setBackground(Color.green);
        				t5.setBackground(Color.green);
        				t6.setBackground(Color.green);
	  		  			break;
	  		  
        case "blue" : 	p2.setBackground(Color.blue);
						pA.setBackground(Color.blue);
                                                p3.setBackground(Color.blue);
						p4.setBackground(Color.blue);
						
						t1.setBackground(Color.blue);
        				t2.setBackground(Color.blue);
        				t3.setBackground(Color.blue);
                                        	t4.setBackground(Color.blue);
        				t5.setBackground(Color.blue);
        				t6.setBackground(Color.blue);
	  		  			break;
	  		  
        case "yellow" : p2.setBackground(Color.yellow);
						pA.setBackground(Color.yellow);
                                                p3.setBackground(Color.yellow);
						p4.setBackground(Color.yellow);
						
						t1.setBackground(Color.yellow);
        				t2.setBackground(Color.yellow);
        				t3.setBackground(Color.yellow);
                                        t4.setBackground(Color.yellow);
        				t5.setBackground(Color.yellow);
        				t6.setBackground(Color.yellow);
	  		  			 break;
	  		  
        case "grey" :   p2.setBackground(Color.gray);
						pA.setBackground(Color.gray);
                                                p3.setBackground(Color.gray);
						p4.setBackground(Color.gray);
						
						t1.setBackground(Color.gray);
        				t2.setBackground(Color.gray);
        				t3.setBackground(Color.gray);
                                        t4.setBackground(Color.gray);
        				t5.setBackground(Color.gray);
        				t6.setBackground(Color.gray);
      	  				break;
      }
       
        btn1.addActionListener(this);
       replay.addActionListener(this);
       
          
      }
public void actionPerformed(ActionEvent e)
{
      if(e.getSource()==btn1)System.exit(0);
      
      if(e.getSource()==replay)
      {
          this.setVisible(false);
                Window3 frame = new Window3();
                frame.setSize(650,550);
                frame.setVisible(true);
                frame.setLayout(new BorderLayout());
      }
}

}



