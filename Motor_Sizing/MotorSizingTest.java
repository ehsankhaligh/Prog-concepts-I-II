public class MotorSizingTest
{
  public static void main( String [] args)
  {
   
    MotorSizing ms = new MotorSizing();
    
    //public MotorSizing ( double W0, double vKnots, double PowerLoading, double RPM )
    System.out.println( "W0 is: " + ms.getW0() );
    System.out.println( "vKnots is: " + ms.getV() );
    System.out.println( "PowerLoading is: " + ms.getPowerLoading() );
    System.out.println( "RPMs are: " + ms.getRPS() );
    
    System.out.println( "Horse Power is: " + ms.HorsePower());
    System.out.println( "Propeller Diameter 2 bladed prop is: " + ms.PropellerDiameter2b());
    System.out.println( "Propeller Diameter 3 bladed prop is: " + ms.PropellerDiameter3b());
    System.out.println( "Tip Speed is: " + ms.TipSpeed(ms.PropellerDiameter2b()));
    System.out.println( "Tip Speed is: " + ms.TipSpeed(ms.PropellerDiameter3b()));

  
  
  }






}