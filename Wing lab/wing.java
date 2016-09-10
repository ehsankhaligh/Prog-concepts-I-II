public class wing 
{
    private float wingSpan;
    private float wingChord;
    private float roh;
    private float velocity;
    private float area;
    private float cl;
    private float cd;
 
  public wing ( float wingSpan, float wingChord, float roh, float velocity, float cl, float cd)
  {
    this.wingSpan = wingSpan;
    this.wingChord = wingChord;
    this.roh = roh;
    this.velocity = velocity;
    this.area = wingSpan*wingChord;
    this.cl = cl;
    this.cd = cd; 
  } 
  
  
  public  float lift()
  {
  
     return 0.5f*roh*velocity*velocity*area*cl*0.85f;
  
  }
  
  public float drag()
  {
  
     return 0.5f*roh*velocity*velocity*area*cd*0.85f;

  }
  
  public float AR()
  {
  
     return (float)wingSpan*wingSpan/area;
  
  
  }
  
  public String toString()
  {
  
     return "Wing span : " + wingSpan + "\n\r" + "wingChord " + wingChord;
  
  }  
}




