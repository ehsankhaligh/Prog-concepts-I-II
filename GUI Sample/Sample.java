import java.awt.*;
import javax.swing.*;

public class Sample extends JFrame
{
   // fields 
   private JLabel myLable;

   public Sample()
   {
     
     super("This is sample");
     myLable = new JLabel ("Sierra College");
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
     setSize(500,500);
     setVisible(true);
     add(myLable);
   }
   
   public static void main (String [] args)
   {
   

   } 
  
}
