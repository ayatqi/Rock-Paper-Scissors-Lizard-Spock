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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class Window4 extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("...");
    private String BackgroundColour;
    private JButton  btn1, btn2, btn3, btn4;
    static JLabel round;
    private JLabel lb1, lb2,lb3,lbImage,lbImage2, a, b, c, d, e, f, total,tl1, tl2, tl3, tl4, tl5, tl6, tl7, tl8, rou;//lbImage=left lbImage2=right
    
    ImageIcon icons[] = {new ImageIcon(getClass().getResource("image/scissor.png")),
    		new ImageIcon(getClass().getResource("image/spock.png")),
    		new ImageIcon(getClass().getResource("image/rock.png")),
    		new ImageIcon(getClass().getResource("image/lizard.png")),
    		new ImageIcon(getClass().getResource("image/paper.png"))};
    		     

    public static void main(String[] args)
    {
        Window4 fr = new Window4(); 
        fr.setSize(680,550);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Window4()
    {
        
      	BackgroundColour = Window1.colorname;
        
        //default image
        lbImage = new JLabel();
        lbImage2 = new JLabel();
          
        lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock");
        lb2 = new JLabel("<html><span style='font-size:12px;'>" + Window2.b); //Windows 2 input
        lb3 = new JLabel("<html><span style='font-size:12px;'>" + Window2.d);
        
        round=new JLabel("<html><span style='font-size:12px;'>" + "Round");
        rou = new JLabel("<html><span style='font-size:12px;'>" + "1");
        
        btn1 = new JButton("BOOM"); 
        btn2 = new JButton("BOOM");  
        btn4 = new JButton("Result");
        btn3 = new JButton("Next");
        
        //TABLE variables
        a = new JLabel("Player 2");
        b = new JLabel("Round 1");
        c = new JLabel("Round 2");
        d = new JLabel("Round 3");
        e = new JLabel("Team 1:" + Window2.b);
        f = new JLabel("Team 2:" + Window2.d);
        total = new JLabel("Total");
        
        tl1 = new JLabel();
        tl5 = new JLabel();
        
        tl2 = new JLabel();
        tl6 = new JLabel();
        
        tl3 = new JLabel();
        tl7 = new JLabel();
        
        tl4 = new JLabel();
        tl8 = new JLabel();
        
        
        //PANEL STARTS
        JPanel p1 = new JPanel();
        p1.setBackground(Color. ORANGE);
        p1.setPreferredSize(new Dimension(100, 45)); 
        p1.add((lb1 = new JLabel("Rock-Paper-Scissors-Lizard-Spock"))); 
        p1.add(lb1);
        
        JPanel p2 = new JPanel();
        p2.setBorder(new EmptyBorder(125,60,140,30));  // top, left, buttom, right
        p2.setLayout(new GridLayout(2,1));
        
            //SUB panel for p2
            JPanel pA= new JPanel();
            pA.add(lb2);

            JPanel pB= new JPanel();
            pB.add(btn1);
            
            p2.add(pA,BorderLayout.WEST);
            p2.add(pB,BorderLayout.WEST);
            
        JPanel p3 = new JPanel();
        p3.setBorder(new EmptyBorder(125,30,140,60));  // top, left, buttom, right
        p3.setLayout(new GridLayout(2,1));
            
             //SUB panel for p3
            JPanel pC= new JPanel();
            pC.add(lb3);
            
            JPanel pD= new JPanel();
            pD.add(btn2);
            pD.add(btn4);
            pD.add(btn3);
            
            p3.add(pC,BorderLayout.EAST);
            p3.add(pD,BorderLayout.EAST);
            
        JPanel p4 = new JPanel();
        p4.setBorder(new EmptyBorder(10,4,100,-18)); //-5,-10,180,-10  //-55,-5,180,-50
        p4.setLayout(new GridLayout(2,1));
        
         //SUB panel for p4

            JPanel pE = new JPanel();
            pE.add(round);
            pE.add(rou);

            JPanel pF = new JPanel();
            pF.setLayout(new GridLayout(1,2));
            pF.setLayout(new FlowLayout(FlowLayout.LEFT));
            pF.add(lbImage);
            
            JPanel pH= new JPanel();
            pH.setLayout(new GridLayout(1,2));
            pH.setLayout(new FlowLayout(FlowLayout.RIGHT));
            pH.add(lbImage2);
            pF.add(pH);
            
            p4.add(pE,BorderLayout.NORTH);
            p4.add(pF,BorderLayout.EAST);  
        
        JPanel p5 = new JPanel();
        p5.setBackground(Color.YELLOW);
        p5.setLayout(new GridLayout(2,1));
        
            JPanel p51 = new JPanel();
            p51.setPreferredSize(new Dimension(30, 70)); // width, height
            p51.setBorder(new LineBorder(Color.BLACK, 3));
            p51.setLayout(new GridLayout(3,5));
        
            //Panels for making table
                JPanel t1 = new JPanel();
                t1.setBackground(Color.WHITE);
                t1.setLayout(new GridLayout(1,5));
                t1.add(a);
                t1.add(b);
                t1.add(c);
                t1.add(d);
                t1.add(total);
        
                JPanel t2 = new JPanel();
                t2.setBackground(Color.WHITE);
                t2.setLayout(new GridLayout(1,5));
                t2.add(e);
                t2.add(tl1);
                t2.add(tl2);
                t2.add(tl3);
                t2.add(tl4);
            
                JPanel t3 = new JPanel();
                t3.setBackground(Color.WHITE);
                t3.setLayout(new GridLayout(1,5));
                t3.add(f);
                t3.add(tl5);
                t3.add(tl6);
                t3.add(tl7);
                t3.add(tl8);
            
                p51.add(t1);
                p51.add(t2);
                p51.add(t3);
            
            JPanel p52 = new JPanel();
            p52.setPreferredSize(new Dimension(25, 20)); // width, height
            p52.add(btn3);
            
            p5.add(p51);
            p5.add(p52);
        
            
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST); 
        add(p3, BorderLayout.EAST);
        add(p4, BorderLayout.CENTER);
        add(p5, BorderLayout.SOUTH);
        
        switch(BackgroundColour) 
        {
            case "red" :
                p2.setBackground(Color.red);
                pA.setBackground(Color.red);
                pB.setBackground(Color.red);
                pC.setBackground(Color.red);
                pD.setBackground(Color.red);
                p3.setBackground(Color.red);
                pE.setBackground(Color.red);
                pF.setBackground(Color.red);
                pH.setBackground(Color.red);
                p4.setBackground(Color.red);
                p52.setBackground(Color.red);
                break;
      	  		  
            case "green" :
                p2.setBackground(Color.green);
                pA.setBackground(Color.green);
                pB.setBackground(Color.green);
                pC.setBackground(Color.green);
                pD.setBackground(Color.green);
                p3.setBackground(Color.green);
                pE.setBackground(Color.green);
                pF.setBackground(Color.green);
                pH.setBackground(Color.green);
                p4.setBackground(Color.green);
                p52.setBackground(Color.green);
                break;
	  		  
            case "blue" :
                p2.setBackground(Color.blue);
                pA.setBackground(Color.blue);
                pB.setBackground(Color.blue);
                pC.setBackground(Color.blue);
                pD.setBackground(Color.blue);
                p3.setBackground(Color.blue);
                pE.setBackground(Color.blue);
                pF.setBackground(Color.blue);
                pH.setBackground(Color.blue);
                p4.setBackground(Color.blue);
                p52.setBackground(Color.blue);
                break;
	  		  
            case "yellow" :
                p2.setBackground(Color.yellow);
                pA.setBackground(Color.yellow);
                pB.setBackground(Color.yellow);
                pC.setBackground(Color.yellow);
                pD.setBackground(Color.yellow);
                p3.setBackground(Color.yellow);
                pE.setBackground(Color.yellow);
                pF.setBackground(Color.yellow);
                pH.setBackground(Color.yellow);
                p4.setBackground(Color.yellow);
                p52.setBackground(Color.yellow);
                break;
	  		  
            case "grey" :
                p2.setBackground(Color.gray);
                pA.setBackground(Color.gray);
                pB.setBackground(Color.gray);
                pC.setBackground(Color.gray);
                pD.setBackground(Color.gray);
                p3.setBackground(Color.gray);
                pE.setBackground(Color.gray);
                pF.setBackground(Color.gray);
                pH.setBackground(Color.gray);
                p4.setBackground(Color.gray);
                p52.setBackground(Color.gray);
                break;
        }
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
    }
    
    public static String t2value1;
    public static String t2value2;
    public static String t2value3;
    public static String t2value4;
    public static String t2value5;
    public static String t2value6;
    public static String t2value7;
    public static String t2value8;
    int player1;
    int player2;
    
    public void actionPerformed(ActionEvent e)
    {
        int Scissors = 0;
        int Spock = 1;
        int Rock = 2;
        int Lizard = 3;
        int Paper = 4;
        int team1Score = 0;
        int team2Score = 0;
      
        if(e.getSource()== btn1) 
        {
        	player1 = (int) (Math.random() * 5);  //when this executes it generates random number from 0-4
        	lbImage.setIcon(icons[player1]); //this random number is passed to img array which displays image
               
        } 
            
        else if(e.getSource()== btn2) 
        {
        	player2 = (int) (Math.random() * 5);
            lbImage2.setIcon(icons[player2]); 
            
        }
        
        if(e.getSource()== btn4)
        { 
        	
        	if(tl1.getText().isEmpty() && tl5.getText().isEmpty())
            {
                //rou.setText("<html><span style='font-size:12px;'>" + "2");
                if((player1==Scissors && player2==Paper)||
                   (player1==Paper && player2==Rock)||
                   (player1==Rock  && player2==Lizard)||
                   (player1==Lizard && player2==Spock)||
                   (player1==Spock && player2==Scissors)||
                   (player1==Scissors && player2==Lizard)||
                   (player1==Lizard && player2==Paper)||
                   (player1==Paper && player2==Spock)||
                   (player1==Spock && player2==Rock)||
                   (player1==Rock && player2==Scissors))
                {
                    tl1.setText("1");
                    tl5.setText("0");
                }
                else if((player2==Scissors && Paper==player1)||
                   (player2==Paper && player1==Rock)||
                   (player2==Rock  && player1==Lizard)||
                   (player2==Lizard && player1==Spock)||
                   (player2==Spock && player1==Scissors)||
                   (player2==Scissors && player1==Lizard)||
                   (player2==Lizard && player1==Paper)||
                   (player2==Paper && player1==Spock)||
                   (player2==Spock && player1==Rock)||
                   (player2==Rock && player1==Scissors))
                {
                    tl1.setText("0");
                    tl5.setText("1");
                }
                else
                {
                    tl1.setText("0");
                    tl5.setText("0");
                }
            }
            else if(tl2.getText().isEmpty() && tl6.getText().isEmpty())
            {
                if((player1==Scissors && Paper==player2)||
                   (player1==Paper && player2==Rock)||
                   (player1==Rock  && player2==Lizard)||
                   (player1==Lizard && player2==Spock)||
                   (player1==Spock && player2==Scissors)||
                   (player1==Scissors && player2==Lizard)||
                   (player1==Lizard && player2==Paper)||
                   (player1==Paper && player2==Spock)||
                   (player1==Spock && player2==Rock)||
                   (player1==Rock && player2==Scissors))
                {
                    tl2.setText("1");
                    tl6.setText("0");
                }
                else if((player2==Scissors && Paper==player1)||
                    (player2==Paper && player1==Rock)||
                    (player2==Rock  && player1==Lizard)||
                    (player2==Lizard && player1==Spock)||
                    (player2==Spock && player1==Scissors)||
                    (player2==Scissors && player1==Lizard)||
                    (player2==Lizard && player1==Paper)||
                    (player2==Paper && player1==Spock)||
                    (player2==Spock && player1==Rock)||
                    (player2==Rock && player1==Scissors))
                {
                    tl2.setText("0");
                    tl6.setText("1");
                }
                else
                {
                    tl2.setText("0");
                    tl6.setText("0");
                }
                
            }
            else if(tl3.getText().isEmpty() && tl7.getText().isEmpty())
            {
                if((player1==Scissors && Paper==player2)||
                   (player1==Paper && player2==Rock)||
                   (player1==Rock  && player2==Lizard)||
                   (player1==Lizard && player2==Spock)||
                   (player1==Spock && player2==Scissors)||
                   (player1==Scissors && player2==Lizard)||
                   (player1==Lizard && player2==Paper)||
                   (player1==Paper && player2==Spock)||
                   (player1==Spock && player2==Rock)||
                   (player1==Rock && player2==Scissors))
                {
                    tl3.setText("1");
                    tl7.setText("0");
                }
                else if((player2==Scissors && Paper==player1)||
                        (player2==Paper && player1==Rock)||
                        (player2==Rock  && player1==Lizard)||
                        (player2==Lizard && player1==Spock)||
                        (player2==Spock && player1==Scissors)||
                        (player2==Scissors && player1==Lizard)||
                        (player2==Lizard && player1==Paper)||
                        (player2==Paper && player1==Spock)||
                        (player2==Spock && player1==Rock)||
                        (player2==Rock && player1==Scissors))
                {
                    tl3.setText("0");
                    tl7.setText("1");
                }    
                else
                {
                    tl3.setText("0");
                    tl7.setText("0");
                }
            }
            
            if(((tl3.getText()=="0") && (tl7.getText()=="1")) || ((tl3.getText()=="1") && (tl7.getText()=="0")) || ((tl3.getText()=="0") && (tl7.getText()=="0"))) //if score is detected in round three, it adds all rounds together
                { 
                    team1Score = (Integer.parseInt(tl1.getText())) + (Integer.parseInt(tl2.getText())) + (Integer.parseInt(tl3.getText()));
                    team2Score = (Integer.parseInt(tl5.getText())) + (Integer.parseInt(tl6.getText())) + (Integer.parseInt(tl7.getText()));
                    
                    tl4.setText(String.valueOf(team1Score)); //this is where they are then stored
                    tl8.setText(String.valueOf(team2Score));
                    //now the winning criteria is below
                }
                
                t2value1 = tl1.getText(); // round 1 1st value
                t2value5 = tl5.getText(); // round 1 2nd value
                
                t2value2 = tl2.getText(); // round 2 1st value
                t2value6 = tl6.getText(); // round 2 2nd value
                
                t2value3 = tl3.getText(); // round 3 1st value
                t2value7 = tl7.getText(); // round 3 2nd value
                
                t2value4 = tl4.getText(); // total 1st value
                t2value8 = tl8.getText(); // total 2nd value
                
        
        }
            
            if(e.getSource()== btn3)
            {
                
                this.setVisible(false);
                Window5 frame = new Window5();
                frame.setSize(650,550);
                frame.setVisible(true);
                frame.setLayout(new BorderLayout());
            }
            
            
            
    }
    
    
    
}
