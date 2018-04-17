import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JButton Search;
    private JLabel Welcome;
    private JLabel  IDnumber;
    private JButton Exit;
    private JTextField jcomp5;
    public static void main (String[] args) {
    
         // System.out.println("Yes");
        JFrame frame = new JFrame ("Voter Verfication Applet");
        
         //System.out.println("Y");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         //System.out.println("e");
        frame.getContentPane().add (new MyPanel());
         //System.out.println("s");
        frame.pack();
        frame.setVisible (true);
        
      
                                             }

                                            
    public  MyPanel() {
        //construct components
        Search = new JButton ("Search");
        Welcome = new JLabel ("        Welcome To Voter Verification. ");
         IDnumber = new JLabel ("  ID number:");
       JButton Exit = new JButton ("Exit");
         jcomp5 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (365, 174));
        setLayout (null);
          add (Search);
        add (Welcome);
          add ( IDnumber);
        add (Exit);
        add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        Search.setBounds (125, 70, 125, 25);
        Welcome.setBounds(70, 10, 220, 35);
         IDnumber.setBounds (0, 45, 100, 25);
        Exit.setBounds (140, 140, 100, 25);
        jcomp5.setBounds(70, 40, 230, 30);
 
        
        
        
                                     }
                                     
                                            
                                             
                                             
}
