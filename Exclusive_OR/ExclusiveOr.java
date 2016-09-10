public class ExclusiveOr
{
  public static void main(String[] args)
  {
    char m = 'A';
    char k = 'B';
    
    char em;
    char pt;
    
    System.out.println( "Message :" + m );
    
    em = (char)(m ^ k);
    
    System.out.println( "Ecrypted Message :" + em );
    
    pt = (char)(em ^ k); 
    
    System.out.println( "Plain Text : " + pt );       
    
  }
}