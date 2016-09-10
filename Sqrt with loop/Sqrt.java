import javax.swing.*;    

public class Sqrt
{
 public static void main(String [] args) 
 {
   String input;
   float s;
      
   do 
   {
     input = JOptionPane.showInputDialog(null, "Enter a number greater than 10"); 
     s = Float.parseFloat ( input ); 
   } while (s <= 10);
   
     s= ( float ) Math.sqrt( s );
      
     int count = 1;
     
     while (s > 1.01f)
     {
       s= ( float ) Math.sqrt( s );
       count++;
      
     }
     
      System.out.println(s);
      System.out.println(count);

 }


}