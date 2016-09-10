import javax.swing.*;

public class Hexidecimal1
{

  public static long atob( String input )
  {
    long digitWeight;
    long d1=0;
    int charPosition = input.length()-1;
    
    for(int i=0; i < input.length(); i++) 
    {
      if ( input.charAt(i) > '0' &&  input.charAt(i) <= '9' )
      {
      digitWeight = ((int)Math.pow(16,i))  * (input.charAt( charPosition ) - 48) ;
      }
      else
      {
      digitWeight = ((int)Math.pow(16,i))  * (input.charAt( charPosition ) - 55) ;
      
      }
      d1 = d1 + digitWeight;
      
      charPosition--;
    } 
    
    return d1;
  }


  public static void main(String[] args)
  {
    String  userInput;
    userInput = JOptionPane.showInputDialog(null, "Enter first number : " );
    
    System.out.println( atob( userInput.toUpperCase() ) );
    System.out.println("userInput is: " + userInput.toUpperCase());
   
  }
}