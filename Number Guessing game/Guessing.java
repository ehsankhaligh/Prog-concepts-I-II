import java.util.Random;
import javax.swing.*;

public class Guessing 
{
 public static void main(String [] args)
 {
  Random rangen = new Random();
  int comGuess = rangen.nextInt(10)+1;
  int userGuess;
  
  do 
  {
   userGuess = Integer.parseInt(Joptionpane.showInputDialog(null, "Enter Number"));
  
  }while(userGuess == compGuess);

 }
}