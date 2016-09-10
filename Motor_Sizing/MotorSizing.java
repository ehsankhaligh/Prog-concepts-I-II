public class MotorSizing 
{

 private double W0; //Lbs
 private double v; // ft/s 
 private double PowerLoading;//lbs/hp
 private double RPS; // RPS 
 
 
 public MotorSizing ( double W0, double vKnots, double PowerLoading, double RPM )
 {
  this.W0 = W0;
  this.v = vKnots * 1.689; //Convert to Knots 
  this.PowerLoading = PowerLoading;
  this.RPS = RPM/60.0; // Converts RPS to RPM
 
 }
  public MotorSizing()
  {
  
    W0 = 1320;
    PowerLoading = 11.5;
    v = 120 * 1.689;      
    RPS = 3000.0/60; 
   
  
  }
  
  
  public double getW0 ()
  {
  
    return W0; 
  
  }
 
  public double getV ()
  {
  
    return v; 
  
  }
 
  public double getPowerLoading ()
  {
  
    return PowerLoading; 
  
  }

  public double getRPS ()
  {
  
    return RPS; 
  
  }

  public double HorsePower()
  {
  
   return W0/PowerLoading ;
  
  }
  
  public double PropellerDiameter2b()
  {
  
   return 1.83* Math.pow(HorsePower(), 1.0/4) ;
  
  }

  public double PropellerDiameter3b()
  {
  
   return 1.5* Math.pow(HorsePower(), 1.0/4) ;
  
  }
  
  
  public double TipSpeed(double d1)
  {
  
   return (Math.pow((v*v)+ Math.pow(3.14*RPS*d1, 2.0), 0.5)) ;
  
  }

  

  



}