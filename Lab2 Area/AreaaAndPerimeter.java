// Ehsan Hosseinzadeh Khaligh

import javax.swing.JOptionPane; 
public class AreaaAndPerimeter
{
  public static void main (String [] args)
  {
  
      String Sradius;
      float radius;
     
     
      Sradius = JOptionPane.showInputDialog(null, "Enter radius" );
      radius = Float.parseFloat( Sradius );  
    

   
      float Area = (3.14f * radius * radius);
      float Perimeter = (2 * 3.14f * radius);
   
   
      System.out.println("Perimeter = " + Perimeter);  
      System.out.println("Area=  " + Area);  

  }
}














