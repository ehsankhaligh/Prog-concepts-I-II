public class Car
{
  // Fields
  private String make;
  private String model;
  private int year;
  private float cost;
  
  // Constructor
  public Car( String mk, String mo, int year, float cost )
  {
    this.make=mk;
    this.model=mo;
    this.year=year;
    this.cost=25000f;
  }
  // Accessors and Mutators
  
  public String getMake(){return make;}
  public void setMake( String newMake ){make=newMake;}
  
  public String getModel(){return model;}
  public void setModel( String newModel ){model=newModel;}
  

  public int getYear(){return year;}
  public void setYear( int newYear ){year=newYear;}
  
  public float getCost(){return cost;}
  public void setCost( float newCost ){cost=newCost;}
  

  
  // General methods
  
  public void forward()
  {
    System.out.println( model + " is moving forward");
  }
  
  public void reverse()
  {
    
    System.out.println( model + " is moving reserve");

  }
  
  public void turn( String t )
  {
     
    System.out.println( model + " is turning " + t );

  }
}