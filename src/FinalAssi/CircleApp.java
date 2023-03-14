package FinalAssi;


import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class CircleApp extends JFrame {

    DrawingCanvas canvas = new DrawingCanvas();

    double x = 20, y = 20, r = 80;
    double x_2 = 100, y_2 = 20, r2 = 80;

    int x1, y1, x2, y2;
    int x1_2, y1_2, x2_2, y2_2;

    Ellipse2D ellipse, ellipse2;
    Ellipse2D selectedShape, selectedShape2;

    JTextField centerXTextField1, centerXTextField2,centerYTextField1, centerYTextField2,
    radiusTextField1,radiusTextField2;
          
    JLabel intersectLabel = new JLabel("Two Circle Is Intersect?");

    public CircleApp() {
        this.setSize(600, 500);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dim = kit.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Cicle Project");

        intersectLabel.setFont(new Font(intersectLabel.getName(), Font.BOLD, 14));
        intersectLabel.setHorizontalAlignment(JLabel.CENTER);
        
       
        JPanel thePanel = new JPanel(); // Main panel 
        JPanel controlPanel = new JPanel();
        JPanel centerXPanel_1 = new JPanel();
        JPanel centerXPanel_2 = new JPanel();
        JPanel centerYPanel_1 = new JPanel();
        JPanel centerYPanel_2 = new JPanel();
        JPanel radiusPanel_1 = new JPanel();
        JPanel radiusPanel_2 = new JPanel();

        centerXTextField1 = new JTextField(5);
        centerXTextField2 = new JTextField(5);
        centerYTextField1 = new JTextField(5);
        centerYTextField2 = new JTextField(5);
        radiusTextField1 = new JTextField(5);
        radiusTextField2 = new JTextField(5);

        // titles for the circles
        JLabel titleLabel_1 = new JLabel("Enter Circle Info 1:");
        JLabel titleLabel_2 = new JLabel("Enter Circle Info 2:");
        
        // The labels for the text fields 
        JLabel centerXLabel = new JLabel("Center X:");
        JLabel centerYLabel = new JLabel("Center Y:");
        JLabel radiusLabel = new JLabel("Radius:");

        JLabel centerXLabel_2 = new JLabel("Center X:");
        JLabel centerYLabel_2 = new JLabel("Center Y:");
        JLabel radiusLabel_2 = new JLabel("Radius:");

        centerXPanel_1.add(centerXLabel);
        centerXPanel_1.add(centerXTextField1);

        centerYPanel_1.add(centerYLabel);
        centerYPanel_1.add(centerYTextField1);

        radiusPanel_1.add(radiusLabel);
        radiusPanel_1.add(Box.createHorizontalStrut(4));
        radiusPanel_1.add(radiusTextField1);
        
        centerXPanel_2.add(centerXLabel_2);
        centerXPanel_2.add(centerXTextField2);

        centerYPanel_2.add(centerYLabel_2);
        centerYPanel_2.add(centerYTextField2);

        radiusPanel_2.add(radiusLabel_2);
        radiusPanel_2.add(Box.createHorizontalStrut(4));
        radiusPanel_2.add(radiusTextField2);

        Box circleBox_1 = Box.createVerticalBox();
        Box circleBox_2 = Box.createVerticalBox();

        Border border = BorderFactory.createLineBorder(Color.black, 1);

        circleBox_1.setBorder(border);
        circleBox_2.setBorder(border);

        thePanel.setLayout(new BorderLayout());

        circleBox_1.add(titleLabel_1);
        circleBox_1.add(centerXPanel_1);
        circleBox_1.add(centerYPanel_1);
        circleBox_1.add(radiusPanel_1);

        circleBox_2.add(titleLabel_2);
        circleBox_2.add(centerXPanel_2);
        circleBox_2.add(centerYPanel_2);
        circleBox_2.add(radiusPanel_2);

        JButton btn = new JButton("Redraw Cicle");
        btn.addActionListener((ActionEvent arg0) -> {
            x = Double.parseDouble(centerXTextField1.getText());
            y = Double.parseDouble(centerYTextField1.getText());
            r = Double.parseDouble(radiusTextField1.getText());


            x_2 = Double.parseDouble(centerXTextField2.getText());
            y_2 = Double.parseDouble(centerYTextField2.getText());
            r2 = Double.parseDouble(radiusTextField2.getText());
         
            canvas.repaint();

        });

        JPanel buttoPanel = new JPanel();
        JPanel boxesPanel = new JPanel();

        buttoPanel.add(btn);

        controlPanel.setLayout(new BorderLayout());

        controlPanel.add(buttoPanel, BorderLayout.SOUTH);

        boxesPanel.add(circleBox_1);
        boxesPanel.add(circleBox_2);
        boxesPanel.setBackground(Color.white);

        controlPanel.add(boxesPanel);

        JPanel boxDrawCircles = new JPanel();
        boxDrawCircles.add(canvas);

        thePanel.add(controlPanel, BorderLayout.SOUTH);
        thePanel.add(boxDrawCircles, BorderLayout.CENTER);

        thePanel.setBackground(Color.white);

        thePanel.add(intersectLabel, BorderLayout.NORTH);

        this.add(thePanel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CircleApp();
            }
        });
    }

    class DrawingCanvas extends Canvas {

        Cursor curCursor;

        public DrawingCanvas() {
            setBackground(Color.white);
            addMouseListener(new MyMouseListener());
            addMouseMotionListener(new MyMouseMotionListener());
            setSize(600, 500);
        }

        public void paint(Graphics g) {
            Graphics2D g2D = (Graphics2D) g;
            ellipse = new Ellipse2D.Double(x, y, r, r);
            ellipse2 = new Ellipse2D.Double(x_2, y_2, r2, r2);
            g2D.draw(ellipse);
            g2D.setColor(Color.red);
            g2D.draw(ellipse2);
            if (curCursor != null) {
                setCursor(curCursor);
            }

            if (ellipse.intersects(ellipse2.getX(), ellipse2.getY(), ellipse2.getWidth(), ellipse2.getHeight())) {
                intersectLabel.setText("Tow Cirles Intersct? Yes");
            } else {
                intersectLabel.setText("Tow Cirles Intersct? No");
            }
        }

        class MyMouseListener extends MouseAdapter {

            public void mousePressed(MouseEvent e) {

                if (ellipse.contains(e.getX(), e.getY())) {
                    x1 = e.getX();
                    y1 = e.getY();
                } else if (ellipse2.contains(e.getX(), e.getY())) {
                    x1_2 = e.getX();
                    y1_2 = e.getY();
                }
            }
        }

        class MyMouseMotionListener extends MouseMotionAdapter {

            public void mouseDragged(MouseEvent e) {
                if (ellipse.contains(e.getX(), e.getY())) {
                    selectedShape = ellipse;
                    x2 = e.getX();
                    y2 = e.getY();

                    x = x + x2 - x1;
                    y = y + y2 - y1;

                    x1 = x2;
                    y1 = y2;

                    centerXTextField1.setText(String.valueOf(x));
                    centerYTextField1.setText(String.valueOf(y));
                    radiusTextField1.setText(String.valueOf(r));

                } else if (ellipse2.contains(e.getX(), e.getY())) {
                    x2_2 = e.getX();
                    y2_2 = e.getY();

                    x_2 = x_2 + x2_2 - x1_2;
                    y_2 = y_2 + y2_2 - y1_2;

                    x1_2 = x2_2;
                    y1_2 = y2_2;
                    centerXTextField2.setText(String.valueOf(x_2));
                    centerYTextField2.setText(String.valueOf(y_2));
                    radiusTextField2.setText(String.valueOf(r2));
                }
                canvas.repaint();

            }

            public void mouseMoved(MouseEvent e) {
                if (ellipse != null && ellipse2 != null) {
                    if (ellipse.contains(e.getX(), e.getY())) {
                        curCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
                    } else if (ellipse2.contains(e.getX(), e.getY())) {
                        curCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
                    } else {
                        curCursor = Cursor.getDefaultCursor();
                    }
                } else if (ellipse != null && ellipse2 == null) {
                    if (ellipse.contains(e.getX(), e.getY())) {
                        curCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
                    } else {
                        curCursor = Cursor.getDefaultCursor();
                    }
                } else if (ellipse2 != null && ellipse == null) {
                    if (ellipse2.contains(e.getX(), e.getY())) {
                        curCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
                    } else {
                        curCursor = Cursor.getDefaultCursor();
                    }
                } else {
                    curCursor = Cursor.getDefaultCursor();
                }

                canvas.repaint();
            }
        }
    }
}
