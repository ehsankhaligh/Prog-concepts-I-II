import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KnotsToMPH extends JFrame implements ActionListener
{
 //Fields  
 
 private JLabel lblKnots, lblResult;
 private JTextField tfKnots;
 private JButton btnCalc;
 
 public KnotsToMPH() //cunstrocor
 {
   super ("Knots to MPH");  //title window 
   setLayout( new GridLayout(3,2));  //(row,culoms)
   
   lblKnots = new JLabel("knots");
   add(lblKnots);
   
   tfKnots = new JTextField("0");
   add (tfKnots);
   
   add ( new JLabel("MPH"));
   
   lblResult = new JLabel ("0");
   add ( lblResult );
   
   btnCalc = new JButton("compute");
   add(btnCalc);
   btnCalc.addActionListener(this);
   
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(300,220);
   setVisible(true);
   
 }
 
 
  public void actionPerformed( ActionEvent ae )
  {
   float knots = Float.parseFloat(tfKnots.getText());
   
   float mph = knots * 1.15f;
   
   lblResult.setText( Float.toString(mph));
   
   //tfKnots.setText("Hello baby ");
  
  }//end Actionperformed 
 
 
  public static void main(String [] args)
  {
  
   KnotsToMPH ktm = new  KnotsToMPH ();
  
  }
  
}