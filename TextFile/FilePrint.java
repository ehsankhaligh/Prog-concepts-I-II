import java.io.*;

public class FilePrint
{
  public static void main (String[] args)
  {
      // Things to write to file
      String name = "Big larry ";
      int age = 87;
      float income = 80000.5f;
      
  		FileWriter fw;
 	   PrintWriter pw;
		
  	try
	{
    fw = new FileWriter("TextStuff", true);
    pw = new PrintWriter(fw, true); //autoflush enabled

    pw.println("---------------------");
    pw.println( name );
    pw.println( age );
	 pw.println( income );
	     
    pw.close();
    fw.close();
	}
	catch( Exception e )
	{ System.out.println( e ); }
   System.out.println( "mission success!" );

  }// end main
}//end class