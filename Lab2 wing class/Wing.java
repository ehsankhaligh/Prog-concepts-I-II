//Ehsan Hosseinzadeh Khaligh

public class Wing 
{
  
  private double span; // in feet
  private double chord; // in feet 
  final private double rho [][] = { {0.00238, 0.00226},                   
                                     {0.00231, 0.00220}, 
                                     {0.00224, 0.00214},
                                     {0.00218, 0.00208}, 
                                     {0.00211, 0.00202},
                                     {0.00205, 0.00196},
                                     {0.00199, 0.00191},
                                     {0.00193, 0.00185},
                                     {0.00187, 0.00180},
                                     {0.00181, 0.00175},
                                     {0.00176, 0.00170},
                                     {0.00170, 0.00165},
                                     {0.00165, 0.00160},
                                     {0.00160, 0.00155},
                                     {0.00160, 0.00155},
                                     {0.00155, 0.00150},
                                     {0.00150, 0.00164},
                                     {0.00145, 0.00141},
                                     {0.00145, 0.00141},
                                     {0.00140, 0.00137},
                                     {0.00136, 0.00133},
                                     {0.00131, 0.00129},
                                     {0.00127,0.00125}};
  private double vCruise; // in fps
  private double vStall; // in fps 
  private double cLiftMax; 
  private double cLiftCruise;
  private int altitudeTo;
  private int altitudeCruise;
  private final double KNOTS_TO_FPS = 1.689;
  
  public Wing (double span, double chord, double vCruise,  double vStall, double cLiftMax, double cLiftCruise ,int altitudeTo, int altitudeCruise)
  { 
 
  this.span = span;
  this.chord = chord;
  this.vCruise = vCruise * KNOTS_TO_FPS;
  this.vStall = vStall * KNOTS_TO_FPS;
  this.cLiftMax = cLiftMax;
  this.cLiftCruise = cLiftCruise;
  this.altitudeTo = altitudeTo;
  this.altitudeCruise = altitudeCruise;
  
  }
  
  public Wing()
  {
    span = 30;
    chord = 4.6;
    vCruise = 120 * KNOTS_TO_FPS ;
    vStall = 45 * KNOTS_TO_FPS ;
    cLiftMax = 1.4;
    cLiftCruise = 0.3;
    altitudeTo = 0;
    altitudeCruise = 8;  
  
  }
  
  public double getSpan ()
  {
  
   return span; 
  
  }
  
  public double getChord () 
  {
  
    return chord;
  }
  
  public double getVCruise()
  {
    return vCruise; 
  }
  
  public double getVStall()
  {
   
    return vStall;
  }
  
  public double getCLiftMax()
  {
  
   return cLiftCruise;
  
  }

  
  public double getCLiftCruise()
  {
  
   return cLiftCruise;
  
  }
  
  public double getAltitudeTo()
  {
  
   return altitudeTo;
  
  }
  
  public double getAltitudeCruise()
  {
    return altitudeCruise;
  
  }
  
  public double qStall()
  {
  
  return 0.5 * rho [altitudeTo][0] * vStall * vStall;
  
  }
  
  
  public double qCruise ()
  {
  
   return 0.5* rho [altitudeCruise][0] * vCruise * vCruise;
  
  }
  
  public double TotalLift ()
  {
  
   return span * chord * qStall() * cLiftMax; 
  
  }
  
  public double WingLoading()
  {
  
   return TotalLift() / (span * chord) ;
  
  }

}



 