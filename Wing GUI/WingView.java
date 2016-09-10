import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WingView extends JFrame implements ActionListener
{
  private JTextField tfSpan, tfChord, tfRho, tfVelocity, cl, cd;
  private JLabel lblLift, lblDrag, lblAE;
  private JButton bCalc;
  
  public WingView()
  {
    super("Wing Calculations");
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setSize(100,600); 
    setLayout( new GridLayout( 10,4, 4,4) );
    
    add( new JLabel( "Span" ) );
    tfSpan = new JTextField("0");
    add( tfSpan );
    
    add( new JLabel( "Chord" ) );
    tfChord = new JTextField("0");
    add( tfChord );    
    
    add( new JLabel( "Rho" ) );
    tfRho = new JTextField("0");
    add( tfRho );   
    
    add( new JLabel( "Velocity" ) );
    tfVelocity = new JTextField("0");
    add( tfVelocity );
    
    add( new JLabel( "CL" ) );
    cl = new JTextField("0");
    add( cl );
    
    add( new JLabel( "CD" ) );
    cd = new JTextField("0");
    add( cd );     
    
    add( new JLabel( "Lift" ) );
    lblLift = new JLabel("0");
    add( lblLift );   
 
    add( new JLabel( "Drag" ) );
    lblDrag = new JLabel("0");
    add( lblDrag );   
    
    add( new JLabel( "Aspect Ratio" ) );
    lblAE = new JLabel("0");
    add( lblAE );    
    
    bCalc = new JButton( "Calculate" );
    add( bCalc );
    bCalc.addActionListener( this );
     
    setVisible( true );
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // convert data to numeric form
    //tfSpan, tfChord, tfRho, tfVelocity, cl, cd;
    float fSpan = Float.parseFloat (tfSpan.getText() );
    float fChord = Float.parseFloat (tfChord.getText() );
    float fRho = Float.parseFloat (tfRho.getText() );
    float fVelocity = Float.parseFloat (tfVelocity.getText() );
    float fcl = Float.parseFloat ( cl.getText() );
    float fcd = Float.parseFloat ( cd.getText() );
    
    
    // instantiate a Wing object
    wing W = new  wing ( fSpan, fChord, fRho, fVelocity, fcl, fcd );
    
    // call Wing object's methods to compute lift,drag,ae
    // convert results to String, set into JLabels
    //lblLift, lblDrag, lblAE
    lblLift.setText( Float.toString(  W.lift() ) );
    lblDrag.setText( Float.toString(  W.drag() ) );
    lblAE.setText( Float.toString(  W.AR() ) );
    
  }
  
  public static void main(String[] args)
  {
    WingView wv = new WingView();
  }
   
}