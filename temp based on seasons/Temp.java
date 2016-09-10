import javax.swing.*;

public class Temp
{
 public static void main (String [] args)
 {
   int temp;
   temp = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter your Score"));
   System.out.println("Temperature is: " + temp);
   
   if ( temp > 120 || temp < -20 )
   {
     System.out.println("temperature is not valid.");
   }
   else 
   
   if ( temp >= 90 )
   {
     System.out.println("We are in summer.");
   }
   if ( temp >= 70 && temp < 90 )
   {    
     System.out.println("We are in Spring.");
   }
   if ( temp >= 50 && temp < 70 )
   {
     System.out.println("we are in fall.");
   }
   if ( temp < 50 && temp >= -20 )
   {
     System.out.println("we are in winter");
   } 
  }
}