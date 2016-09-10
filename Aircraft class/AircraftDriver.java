public class AircraftDriver 
{
 public static void main ( String [] args )
 {
   Aircraft myAircraft = new Aircraft ( "Boeing", 747, 300f, 988f, 88000f, 396900f, 1000f );
      
   System.out.println( "Manufacturer is " + myAircraft.getManufacturer ());  
   myAircraft.setManufacturer("Sierra" );
   System.out.println( "Manufacturer is " + myAircraft.getManufacturer ());
   
   System.out.println( "Model is " + myAircraft.getModel ());
   myAircraft.setModel( 737 );
   System.out.println( "Model is " + myAircraft.getModel ());
   
   System.out.println( "Stall speed is " + myAircraft.getStallSpeed ());
   myAircraft.setStallSpeed( 300 );
   System.out.println( "Stall speed is " + myAircraft.getStallSpeed ());
   
   System.out.println( "Max Speed is " + myAircraft.getMaxSpeed ());
   myAircraft.setMaxSpeed( 2000 );
   System.out.println( "Max Speed is " + myAircraft.getMaxSpeed ());
   
   System.out.println( "Empty weight is " + myAircraft.getEmptyWeight ());
   myAircraft.setEmptyWeight( 1000 );
   System.out.println( "Empty weight is " + myAircraft.getEmptyWeight ());
   
   System.out.println( "Gross weight is " + myAircraft.getGrossWeight ());
   myAircraft.setGrossWeight( 1096 );  
   System.out.println( "Gross weight is " + myAircraft.getGrossWeight ());

   System.out.println( "Max speed is " + myAircraft.getMaxFuel ());
   myAircraft.setMaxFuel ( 160 );
   System.out.println( "Max speed is " + myAircraft.getMaxFuel ());

   
   System.out.println("Calculation starts here.");

   myAircraft.maxLoad();
   System.out.println(myAircraft.maxLoad());
   
   myAircraft.speedRange();
   System.out.println(myAircraft.speedRange());
   
   myAircraft.usefulLoad(myAircraft.usefulLoad(38f));
   System.out.println(myAircraft.usefulLoad(myAircraft.usefulLoad(38f)));

 }
}