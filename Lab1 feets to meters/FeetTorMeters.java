//Ehsan Hosseinzadeh khaligh
import javax.swing.JOptionPane;

public class FeetTorMeters
{
  public static void main (String [] args)
  {
  
   final float FEET_TO_METERS_CF = 0.3048f; 
   String sFeet;
   float feet;
   float meters;
   
   
   sFeet = JOptionPane.showInputDialog(null,"Enter feet");
   feet = Float.parseFloat( sFeet );  
   
   meters = feet * FEET_TO_METERS_CF; 
   
   
   System.out.println("meters=" + meters);  


  }
} 