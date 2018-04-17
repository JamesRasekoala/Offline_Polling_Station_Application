import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;



public class JButtonListenerExample
{
  static JFrame frame;
  static JFrame frame2;
  private JButton Search;
  private JLabel Welcome, output;
  private JLabel outcome;
  private JLabel  IDnumber;
  private JButton Exit;
  private JButton Back;
  private JButton Exit2;
  private JTextField jcomp5;
  static String search="Deafult";
  
   public String getsearch(){
   return search;
   }
   
    public void set(String search ){
   this.search = search;
   }

  public static void main(String[] args)
  {

    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {  
		 
        displayJFrame();
      }
    });
  }
  

  static void displayJFrame()
  {
    frame = new JFrame("*Voter Verification Applet*");
    frame2 = new JFrame("**Voter Verification Applet**");
    JButton showDialogButton = new JButton("Click Me");
    JButton Exit = new JButton ("Exit");
    JButton Exit2 = new JButton ("Exit");
    JButton Back = new JButton ("Back");
    JButton Search = new JButton ("Search");
    JLabel IDnumber  = new JLabel( " ID number :");
    JLabel  outcome  = new JLabel("");
    JLabel output  = new JLabel( "Search results:");
    JLabel Welcome = new JLabel ("        Welcome To Voter Verification. ");
    JTextField jcomp5 = new JTextField ("");
    

  
    
   
    // add the listener to the jbutton to handle the "pressed" event
    Exit.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {

         System.exit(0);
      }
    });
    
        Exit2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {

         System.exit(0);
      }
    });


      Back.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        frame.setVisible(false);
         
        // frame.removeAll(); //gets rid of first panel
        //frame.add(); //adds desired panel to frame
        frame.validate(); 
        // frame.setVisible(false);
         frame.setVisible(true);
      }
    });
    
    


    
    



     Search.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent e)
      { 
      
        JDialog popup = new JDialog(frame, " Search Responce ", true);
        popup.setBounds(200, 200, 300, 200);
        popup.setLayout (null);
        popup.setLocationRelativeTo(frame);
        String strV0TextBox = jcomp5.getText();
        search = strV0TextBox+search;
       // System.out.println(search);
       // set(search );
        //search.set(search);
        HashApp hash = new HashApp ();
        // in the main
	try {
		 //hash.Create();
		outcome.setText(hash.findVoter(search, hash.Create()));
		popup.add(outcome);
		outcome.setBounds (0, 45, 200, 25);
		//System.out.println("Try");
		
	} catch(Exception i) {
    // do something, e.g. print e.getMessage()
   // System.out.println("catch");
	}
        
        output.setBounds(20, 20, 120, 25);
        popup.add(output);
        Back.setBounds(20, 110, 100, 25);
        popup.add(Back);
         Exit2.setBounds(160, 110, 100, 25);
        popup.add(Exit2);
        popup.setVisible(true);
         
           
      }
    });

    frame.getContentPane().setLayout(new FlowLayout());
   // frame.add(showDialogButton);
    frame.setPreferredSize (new Dimension (385, 230));
    frame.setLayout (null);
    frame.add(Exit);
    frame.add(Search);
    frame.add(Welcome);
    frame.add(IDnumber);
    frame.add(Exit);
    frame.add (jcomp5);
    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Exit.setBounds (140, 140, 100, 25);
   //frame.setPreferredSize(new Dimension(365, 174));
   Search.setBounds (125, 70, 125, 25);
    Welcome.setBounds(70, 10, 280, 35);
   IDnumber.setBounds (0, 45, 100, 25);
   
   
   
  // Welcome.setBounds(70, 10, 220, 35);
   //IDnumber.setBounds (0, 45, 100, 25);
   jcomp5.setBounds(90, 40, 230, 30);
   Exit.setBounds (140, 140, 100, 25);
    frame.pack();
    frame.setLocationRelativeTo(frame);
    frame.setVisible(true);
   
  }
  
  
}


