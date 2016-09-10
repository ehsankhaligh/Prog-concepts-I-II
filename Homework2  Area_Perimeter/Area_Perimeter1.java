// Ehsan Hosseinzadeh Khaligh

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area_Perimeter1
{
  public static void main (String [] args)
  {
  
     String sWidth;
     float Width;
     String sHeight;
     float Height;
   
     final float Area = Width * Height;
     final float Perimeter = ( Height + Height + Width + Width );
   
  
     sWidth = JOptionPane.showInputDialog(null,"Enter Width");
     Width = Float.parseFloat( sWidth );  
     sHeight = JOptionPane.showInputDialog(null,"Enter Height");
     Height = Float.parseFloat( sHeight );  

     Area = Width * Height;
     Perimeter = ( Height + Height + Width + Width );


     System.out.println("Perimeter=" + Perimeter);  
     System.out.println("Area=" + Area);  

  }
}



