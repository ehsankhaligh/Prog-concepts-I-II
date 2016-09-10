public class Horse
{
  // fields
  private String name;  // this is the horse's name
  private int age; // in years
  private String color; 
  
  // Constructor
  public Horse( String n, int a, String c )
  {
    name = n;
    age = a;
    color = c;
  }
  
  // Accessors Mutators
  public String getName(){ return name; }
  public int getAge() { return age; }
  public String getColor(){ return color; }
  
  public void setAge( int newAge ){ age = newAge; }
  
  
  // General Methods
  public void eat()
  {
    System.out.println( name + " is eating" );
  }
  
  public void bite()
  {
    System.out.println( name + " is trying to kill owner" );
  }
  
  public void talk( String message )
  {
    System.out.println( name + " says " + message );
  }

}