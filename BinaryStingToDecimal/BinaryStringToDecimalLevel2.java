public class BinaryStringToDecimalLevel2
{

  public static long atob( String input )
  {
    long digitWeight;
    long d=0;
    int charPosition = input.length()-1;
    
    for(int i=0; i < input.length(); i++) 
    {
      digitWeight = ((int)Math.pow(2,i))  * (input.charAt( charPosition ) - 48) ;
      d = d + digitWeight;
      
      charPosition--;
    } 
    
    return d;
  }


  public static void main(String[] args)
  {
    String userInput = "101";
    System.out.println( atob( userInput ) );
    
    userInput = "1111";
    System.out.println( atob( userInput ) );
    
    userInput = "11111111";
    System.out.println( atob( userInput ) );
    
  }
}