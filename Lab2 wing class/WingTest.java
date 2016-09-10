
//Ehsan Hosseinzadeh Khaligh


public class WingTest
{
 public static void main (String [] args)
 {
  Wing wing1 = new Wing ();
  
  wing1.qCruise();
  System.out.println("qCruise: " + wing1.qCruise());
  
  wing1.qStall();
  System.out.println("qStall: " + wing1.qStall());

  
  wing1.TotalLift();
  System.out.println("TotalLift: " + wing1.TotalLift());
  
  wing1.WingLoading();
  System.out.println("WingLoading: " + wing1.WingLoading());

  System.out.println("");
  System.out.println("Span: " + wing1.getSpan());
  System.out.println("Chord: " + wing1.getChord());
  System.out.println("vCruise: " + wing1.getVCruise());
  System.out.println("vStall: " + wing1.getVStall());
  System.out.println("cLiftMax: " + wing1.getCLiftMax());
  System.out.println("cLiftCruise: " + wing1.getCLiftCruise());
  System.out.println("altitudeTo: " + wing1.getAltitudeTo());
  System.out.println("altitudeCruise: " + wing1.getAltitudeCruise());
  
 }
}

