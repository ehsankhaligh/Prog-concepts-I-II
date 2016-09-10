import javax.swing.*;

public class Sentence 
{
 public static void main (String [] args)
 {
 
  String sentence;
  sentence = JOptionPane.showInputDialog(null , "Write your sentence.");

  if (sentence.length() == 0 )
  {
   System.out.println("You did not type anything. Please type your sentence.");
  }
  else
  if ( sentence.endsWith( "."))
  {
   System.out.println("Your sentence is: " + sentence );
   System.out.println("Your sentence is declarative.");
  }
  else
  if ( sentence.endsWith( "?"))
  {
   System.out.println("Your sentence is: " + sentence );
   System.out.println("Your sentence is interrogative.");
  }
  else
  if ( sentence.endsWith( "!"))
  {
   System.out.println("Your sentence is: " + sentence );
   System.out.println("Your sentence is exclamatory.");
  }
  else
  if ( sentence.endsWith(""))
  {
   System.out.println("Your sentence is: " + sentence );
   System.out.println("Your sentence is not complete. write another sentence.");
  }
 }
}