// Ehsan Hosseinzadeh Khaligh

import javax.swing.JOptionPane; 
public class Area_Perimeter2
{
  public static void main (String [] args)
  {
  
     String sWidth;
     float Width;
     String sHeight;
     float Height;
     
     sWidth = JOptionPane.showInputDialog(null,"Enter Width");
     Width = Float.parseFloat( sWidth );  
     sHeight = JOptionPane.showInputDialog(null,"Enter Height");
     Height = Float.parseFloat( sHeight );  


   
      float Area = Width * Height;
      float Perimeter = ( Height + Height + Width + Width );
   


     System.out.println("Perimeter=" + Perimeter);  
     System.out.println("Area=" + Area);  

  }
}



