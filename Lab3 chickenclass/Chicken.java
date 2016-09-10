public class Chicken
{
  // fields
  private String name;  
  private int Age; // in years
  private int eggCount;// many years 
  
  // Constructor
  public Chicken( String n, int a )
  {
    name = n;
    Age = a;
    eggCount = 1000;
  }
  
  // Accessors Mutators
  public String getName(){ return name; }
  public void setName ( String newName ) { name = newName; }
  
  public int getAge() { return Age; }
  public void setAge(int newAge){ Age = newAge; }
  
  
  public int geteggCount(){ return eggCount; }
  public void seteggCount(int neweggCount){ eggCount = neweggCount; }

  
  
  
  // General Methods
 
 
    public void eat()
  {
    System.out.println( name + " is eating" );
  }
  
    public void MakeNoise()
  {
    System.out.println( name + " is bucing bucing bucing bucing bucing" );
  }
  
    public void layEgg()
  {
  
   eggCount++; 
   System.out.println ( name + " Layed an egg ");
  }

}