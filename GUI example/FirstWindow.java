import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing

public class FirstWindow extends JFrame
{
  private JLabel message;
  private JLabel message1;

	// FirstWindow constructor adds JLabel to JFrame
  public FirstWindow()
  {
	 super( "Testing JLabel" );
    setLayout( new FlowLayout() ); // set frame layout

    // JLabel constructor with a string argument
    message = new JLabel( "Hey, I opened a Swing Window" );
    message.setToolTipText( "Hello" );
    add( message ); // add label1 to JFrame
	 
	 message1 = new JLabel( "Another boring JLabel" );
	 add( message1 );
    
    add( new JLabel( "Can't change me!" ) );

  } // end FirstWindow constructor
  
  
   public static void main( String args[] )
   {
      FirstWindow window = new FirstWindow(); // create FirstWindow object
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.setSize( 300, 180 ); // set frame size
      window.setVisible( true ); // display frame
   } // end main
  
} // end class FirstWindow