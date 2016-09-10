import javax.swing.*;

public class MoreLoopyLevel3
{
 public static void main (String [] args)
 {
  String myString = "Hello, World,";
  int WhereTheWIs = -1;
  
  for (int i = 0; i < myString.length(); i++)
  {
    
    if (myString.charAt(i)== 'W')
    {
     WhereTheWIs = i;
    } 
  }
   System.out.println("w at ; " + WhereTheWIs );
 }
}