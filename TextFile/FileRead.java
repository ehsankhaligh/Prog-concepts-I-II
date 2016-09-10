import java.io.*;

public class FileRead
{
  public static void main (String[] args)
  {    
    String aLine;
    FileReader fr;
    BufferedReader br;

    try
    {
      fr = new FileReader("textStuff");
      br = new BufferedReader(fr);

      aLine=br.readLine();
      while ( aLine != null )
      {
        System.out.println( aLine );
        aLine=br.readLine();
      }
   
      br.close();
      fr.close();
      
    } 
/* 
    catch( FileNotFoundException fnf )
    {
	 	//System.out.println( fnf );
      System.out.println("Hey man, file not found");
    }

    catch( IOException ioe )
    {
      System.out.println("General I/O exception");
    }
*/	 
	 catch( Exception e )
	 {
	 	System.out.println( e );
	 }
	 

  }// end main
}//end class