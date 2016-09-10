import java.util.Arrays;

public class Stats
{
  public static double median (double [] x)
  {
   Arrays.sort (x);
   int i = Math.round(x.length/2.0f);
     
   
   return x[i];
  }
  
  public static double avarage (double[] x)
  {

    double total = 0;
 
    for ( int i=0 ; i < x.length; i++)
    {
    
       total = total + x[i];
     
    }//End for
     
       return total/x.length;

  } 
   
  public static float avarage (float[] x)
  {

    float total = 0;
 
    for ( int i=0 ; i < x.length; i++)
    {
    
       total = total + x[i];
     
    }//End for
     
       return total/x.length;

  }
   
  public  static double stdDev ( double [] x)
  {
  
    double xbar = avarage (x);
    double sumOfsquares = 0;
  
   
   for ( int i = 0; i < x.length; i++)
   {
     sumOfsquares = sumOfsquares = Math.pow( x[i]- xbar, 2);
   }   
   
     return Math.sqrt( sumOfsquares/x.length );
  }
   
}