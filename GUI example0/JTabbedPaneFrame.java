// Demonstrating JTabbedPane.
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class JTabbedPaneFrame extends JFrame
{


   // set up GUI
   public JTabbedPaneFrame()
   {
      super( "JTabbedPane Demo" );

      JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane

      // set up pane11 and add it to JTabbedPane
      JPanel panel1 = new JPanel(); // create first panel
      panel1.setLayout( new FlowLayout() );
      JLabel label1 = new JLabel( "panel one",FlowLayout.LEFT);    
      panel1.add( label1 ); // add label to panel

      tabbedPane.addTab( "Tab One", null, panel1, "First Panel" );

      // set up panel2 and add it to JTabbedPane
      JLabel label2 = new JLabel( "panel two", SwingConstants.CENTER );
      JPanel panel2 = new JPanel(); // create second panel
      panel2.setBackground( Color.YELLOW ); // set background to yellow
      panel2.add( label2 ); // add label to panel
      tabbedPane.addTab( "Tab Two", null, panel2, "Second Panel" );

      // set up panel3 and add it to JTabbedPane
      JLabel label3 = new JLabel( "panel three", JLabel.CENTER);
      JPanel panel3 = new JPanel(); // create third panel
      panel3.setLayout( new BorderLayout() ); // use borderlayout
      panel3.add( new JButton( "North" ), BorderLayout.NORTH );
      panel3.add( new JButton( "West" ), BorderLayout.WEST );
      panel3.add( new JButton( "East" ), BorderLayout.EAST );
      panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
      panel3.add( label3, BorderLayout.CENTER );
      tabbedPane.addTab( "Tab Three", null, panel3, "Third Panel" );
 
      JPanel panel4 = new JPanel();
      JLabel label4 = new JLabel("This is Tab 4");
      panel4.add( label4 );
      tabbedPane.addTab( "Tab Four", null, panel4, "Fourth Panel" );
      
      
      tabbedPane.addTab( "Power Loading", null, new PowerLoadingGUI(), "Power Loading Panel" );

      add( tabbedPane ); // add JTabbedPane to frame
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // end JTabbedPaneFrame constructor

   public static void main( String args[] )
   {
      JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();
      
      tabbedPaneFrame.setSize( 250, 200 ); // set frame size
      tabbedPaneFrame.setVisible( true ); // display frame
   } // end main

} // end class JTabbedPaneFrame