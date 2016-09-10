
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

import java.awt.FlowLayout;

public class PowerLoadingGUI extends JPanel
{
  private final String[] AIRCRAFT_TYPES = 
                           {"Fixed Gear Aluminum",
                            "Retractable Gear Aluminum",
                            "Fixed Gear Smooth",
                            "Retractable Gear Smooth",
                            "Acrobatic", 
                            "RagWings",
                            "Ultralights"};
                            
  private JTextField tfVmax;
  private JComboBox cbAircraftType;
  private JLabel lblAircraftType;
  private JLabel lblpowerLoading;
  private JButton bCalc;
  
  public PowerLoadingGUI()
  {
    setLayout( new GridLayout(3,4, 2,2 ) );
    
    add( new JLabel( "V Max" ) );
    
    tfVmax = new JTextField(); 
    add( tfVmax );
    
    add( new JLabel("") );
    
    cbAircraftType = new JComboBox( AIRCRAFT_TYPES );
    cbAircraftType.addItemListener( new comboHandler() );
    
    add( cbAircraftType );
    
    add( new JLabel("") );
    add( new JLabel("") );
    add( new JLabel("") );
    add( new JLabel("") );
    
    lblAircraftType = new JLabel( AIRCRAFT_TYPES[0] );
    add( lblAircraftType );
    
    lblpowerLoading =  new JLabel( "0" );
    add( lblpowerLoading );
    
    add( new JLabel( "W/hp" ) );

  }// constructor
  
  private class comboHandler implements ItemListener
  {
    public void itemStateChanged( ItemEvent e )
    {
      double vmax = Double.parseDouble( tfVmax.getText() );
      PowerLoading pl = new PowerLoading( vmax );
      double powerLoading = -1;
      
      switch( cbAircraftType.getSelectedIndex() ) 
      {
        case 0: // fixed gear aluminum
          powerLoading = pl.FGND();
          break;
        case 1: // fixed gear composite
          powerLoading = pl.RGND();
          break;
        case 2: // retract alum
          powerLoading = pl.FGSD();
        case 3:
          powerLoading = pl.RGSD();
        case 4:
          powerLoading = pl.Acrobatic();
        case 5:
          powerLoading = pl.RagWings();
        case 6:
          powerLoading = pl.Ultralights();
         
        
        //default:
          
      
      }// end switch
      
      lblpowerLoading.setText( Double.toString (powerLoading) );    
  }// end handler
  
}
}