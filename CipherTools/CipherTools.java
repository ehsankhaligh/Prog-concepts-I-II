import java.lang.String;

public class CipherTools
{

  public static String xorCipher( String m, String k )
  {
    char[] ed = new char[ m.length() ];
    int keyPosition = 0;
  
    for( int charPosition = 0; charPosition < m.length(); charPosition++ )
    {
    
      ed[ charPosition ] = (char)( m.charAt( charPosition ) ^ k.charAt( keyPosition ) );
      
      keyPosition++;
      if (keyPosition == k.length() )
      { keyPosition = 0 ; }
      
//System.out.println( m.charAt( charPosition ) );
    }// end for
    
    return  new String(ed);  // must join AA
  }
  
  public static void main(String[] args)
  {
    String message = "Hello Worms";
    String enm = xorCipher( message , "xyz" );
    String ptm;
    
    System.out.println( enm );
    
    ptm = xorCipher( enm , "xyz" );
    
    System.out.println( ptm );
  }
}