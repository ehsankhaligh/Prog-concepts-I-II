import javax.swing.JOptionPane;
import java.util.Random;

public class RPSLS
{
  public static void main(String[] args)
  {
    final int ROCK=0;
    final int PAPER=1;
    final int Scissors=2;
    final int Lizard=3;
    final int Spock=4;
    
    Random rangen = new Random();
    int compChoice = rangen.nextInt(5);          
    String userChoice;
        
    userChoice = JOptionPane.showInputDialog(null, "Enter your choice");
    
System.out.println( userChoice.toUpperCase().substring(0,2) );    
    
    switch(compChoice)
    {
      case ROCK:
        switch( userChoice.toUpperCase().substring(0,2) )
        {
          case "RO":
            System.out.println("tie");
            break;
            
          case "PA":
            System.out.println("User wins");
            break;
            
          case "SC":
          case "SI":
            System.out.println("Computer wins");
            break;
          
          case "LI":
            System.out.println("Computer wins");
            break;
                      
          case "SP":
            System.out.println("User wins");
            break;            
        }
        break;
        
      case PAPER:
        switch( userChoice.toUpperCase().substring(0,2) )
        {
          case "RO":
            System.out.println("tie");
            break;
            
          case "PA":
            System.out.println("User wins");
            break;
            
          case "SC":
          case "SI":
            System.out.println("Computer wins");
            break;
          
          case "LI":
            System.out.println("Computer wins");
            break;
                      
          case "SP":
            System.out.println("User wins");
            break;            
        }
      
        break;
        
      case Scissors:
        
        switch( userChoice.toUpperCase().substring(0,2) )
        {
          case "RO":
            System.out.println("Computer wins");
            break;
            
          case "PA":
            System.out.println("User wins");
            break;
            
          case "SC":
          case "SI":
            System.out.println("tie");
            break;
          
          case "LI":
            System.out.println("user wins");
            break;
                      
          case "SP":
            System.out.println("Computer wins");
            break;          
        }        
        break;
        
      case Lizard:
            
            switch( userChoice.toUpperCase().substring(0,2) )
        {
          case "RO":
            System.out.println("Computer wins");
            break;
            
          case "PA":
            System.out.println("Computer wins");
            break;
            
          case "SC":
          case "SI":
            System.out.println("User ins");
            break;
          
          case "LI":
            System.out.println("tie");
            break;
                      
          case "SP":
            System.out.println("Computer wins");
            break;          
        }
        
        break;
        
      case Spock:
        
         switch( userChoice.toUpperCase().substring(0,2) )
         {
          case "RO":
            System.out.println("User wins");
            break;
            
          case "PA":
            System.out.println("User wins");
            break;
            
          case "SC":
          case "SI":
            System.out.println("User wins");
            break;
          
          case "LI":
            System.out.println("Computer wins");
            break;
                      
          case "SP":
            System.out.println("tie");
            break;          
       }        
        
        break;
    
    
    }// end switch(compChoice)
  
  }
}