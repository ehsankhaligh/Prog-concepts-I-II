import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WingGUI extends JPanel
{
 
  final private String[] FIRST_COMBO = {  "Sea level",                   
                                          "1000",  
                                          "2000", 
                                          "3000", 
                                          "4000", 
                                          "5000", 
                                          "6000", 
                                          "7000", 
                                          "8000", 
                                          "9000", 
                                          "10000" } ;
 final private String[] FIRST_COMBO1 = {  "Sea level",                   
                                          "1000",  
                                          "2000", 
                                          "3000", 
                                          "4000", 
                                          "5000", 
                                          "6000", 
                                          "7000", 
                                          "8000", 
                                          "9000", 
                                          "10000" } ;
  
 
  private JTextField tfSpan;  //Wing span in feet 
  private JTextField tfChord; // Wing Chord in feet
  private JTextField tfClCruise; 
  private JTextField tfClMax;
  private JTextField tfStallSpeed;
  private JTextField tfCruiseSpeed; 
  private JButton btCalc; 
  private JRadioButton hot;
  private JRadioButton std;
  private ButtonGroup radioGroup;
  
 
  private JComboBox cnAltCruise; // Cruise altitude 
  private JComboBox cbAltStall; // Stall altitude 
  
  
  //more Stuff 
 
  public WingGUI()
  {
   
    setLayout( new GridLayout (14,3));
    
    
    add( new JLabel ( "span (ft.)"));
    tfSpan = new JTextField("0.0");
    add( tfSpan );
    
       

    add( new JLabel ( "chord (ft.)"));
    tfChord = new JTextField("0.0");
    add( tfChord );

   
    
    add( new JLabel ( "CL Max "));
    tfClMax = new JTextField("0.0");
    add( tfClMax );

    
    
    add( new JLabel ( "CL Cruise "));
    tfClCruise = new JTextField("0.0");
    add( tfClCruise );
    
    add( new JLabel ( "Stall speed (Knots)"));
    tfStallSpeed = new JTextField("0.0");
    add( tfStallSpeed );
    
    
    add( new JLabel ( "Cruise Speed (Knots)"));
    tfCruiseSpeed = new JTextField("0.0");
    add( tfCruiseSpeed );
    

    cnAltCruise = new JComboBox( FIRST_COMBO );
    cbAltStall = new JComboBox( FIRST_COMBO1 );

    

   
    add( new JLabel ( "Altitude Cruise "));
    add( cnAltCruise );
    
    
    add( new JLabel ( "Altitude Stall "));
    add( cbAltStall );
    
       
    hot = new JRadioButton("Hot day");
    add(hot);
   
    
    std = new JRadioButton("Standard day");
    add(std);
 
    radioGroup = new ButtonGroup(); 
    radioGroup.add( hot ); 
    radioGroup.add( std ); 
    
    btCalc = new JButton("calculate");
    add(btCalc);
    add( new JLabel ( " "));

    
    add( new JLabel ( "Total Lift "));
    add( new JLabel ( "0.0 "));

    add( new JLabel ( "Dynamic Pressure "));
    add( new JLabel ( "0.0 "));
    
    add( new JLabel ( "Wing Loading "));
    add( new JLabel ( "0.0 "));
    
    
     }

}