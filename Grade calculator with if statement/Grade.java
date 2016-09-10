import javax.swing.*;

public class Grade 
{
  public static void main (String [] args )
  {
 
    int TestScore;
    TestScore = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter your Score"));
    System.out.println("Your Test Score is: " + TestScore);
 
    if ( TestScore >= 90  )
    {
     System.out.println( "Good job. You got an A in this class.");
    }
    if ( TestScore <= 89 && TestScore >= 80 )
    {
     System.out.println ( "you got an B in this class.");
    } 
    if ( TestScore <= 79 && TestScore >= 70 )
    {
     System.out.println ( "you got an C in this class.");
    } 
    if ( TestScore <= 69 )
    {
     System.out.println ( "You failed. Take this course one more time.");
    } 
   
  }

} 