public class Aircraft 
{
 //Field
  private String manufacturer;
  private int model; // year
  private float stallSpeed; // km/h
  private float maxSpeed; // km/h
  private float emptyWeight;// tons
  private float grossWeight; // kg
  private float maxFuel; // litters
 
 //Constructor 
   
  public Aircraft ( String ma, int mo, float st, float ms,float em, float gr, float mf )
  { 
    manufacturer = ma;
    model = mo;
    stallSpeed = st;  
    maxSpeed = ms;
    emptyWeight = em;
    grossWeight = gr;
    maxFuel = mf;
    
  }

 // Accessors Mutators
 
  public String getManufacturer(){ return manufacturer; }
  public void setManufacturer( String newManufacturer ){ manufacturer = newManufacturer; }
  
  
  public int getModel(){ return model; }
  public void setModel( int newModel ){ model = newModel; }
  
  
  public float getStallSpeed(){ return stallSpeed; }
  public void setStallSpeed( float newStallSpeed ){ stallSpeed = newStallSpeed; }
  
  public float getMaxSpeed(){ return maxSpeed; }
  public void setMaxSpeed( float newMaxSpeed ){ maxSpeed = newMaxSpeed; }
  
  
  public float getEmptyWeight(){ return emptyWeight; }
  public void setEmptyWeight( float newEmptyWeight ){ emptyWeight = newEmptyWeight; }
  

  public float getGrossWeight(){ return grossWeight; }
  public void setGrossWeight( float newGrossWeight ){ grossWeight = newGrossWeight; }

    
  public float getMaxFuel(){ return maxFuel; }
  public void setMaxFuel( float newMaxFuel ){ maxFuel = newMaxFuel; }
  
 //General Methods 
  
  public float maxLoad()  // returns the grossWeight - emptyWeight
  {
   return grossWeight - emptyWeight;
  }
  
  public float speedRange() // returns the maxSpeed - stallSpeed
  {
   return  maxSpeed - stallSpeed;
  }
 
  public float usefulLoad( float littersOfFuel ) // returns the grossWeight - emptyWeight - fuelWeight  
  {
   float fuelWeight = littersOfFuel * 6 ;
   return grossWeight - emptyWeight - fuelWeight;

  }

}