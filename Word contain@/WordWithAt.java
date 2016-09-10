import javax.swing.JOptionPane; 


public class WordWithAt
{
 public static void main (String [] args)
 {
   String string;
   
   do
   {
     string = JOptionPane.showInputDialog(null, "Enter Words that contain @" );
   }       
   while(! (string.contains("@")));
   
     System.out.println(string);
   
  
 }
}