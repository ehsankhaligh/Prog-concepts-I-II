import javax.swing.*;

public class TestProgram 
{
 public static void main (String [] args )
 {
  
  String year;
  year = JOptionPane.showInputDialog(null , "Type your String");
  System.out.println("Your string is: " + year );
  
  if ( year.length()> 4 || year.length() < 2 || year.length() == 3 ) 
  {
     System.out.println("The data is invalid.");
  }
  else
  if (year.length() == 2 ) 
  {
    int a = 2000 + Integer.parseInt(year);
    System.out.println(a);
  }
  if ( year.length() == 4 )
  {
    int b = Integer.parseInt(year);
    System.out.println(b);
  } 
 }
}