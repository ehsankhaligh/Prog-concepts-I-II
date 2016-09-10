public class AirCraftDesign
{
 private double vMax;
 
 public AirCraftDesign ( double vMax )
 {
   this.vMax = vMax; //knots
 }
  
    public double FGND()
    {
      return 215.0 * Math.pow(vMax,0.61);
    }
 
    public double RGND()
    {
      return 276.0 * Math.pow(vMax,0.65);
    }
 
    public double FGSD()
    {
      return 248.0 * Math.pow(vMax,0.61);
    }

    public double RGSD()
    {
      return 680.0 * Math.pow(vMax,0.79);
    }

    public double Acrobatic()
    {
      return 172.0 * Math.pow(vMax,0.61);
    }

    public double RagWings()
    {
      return 511.0 * Math.pow(vMax,0.75);
    }
  
    public double Ultralights()
    {
      return 325.0 * Math.pow(vMax,0.75);
    }
 
}