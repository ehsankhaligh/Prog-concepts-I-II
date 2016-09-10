public class Horse 
{
  // filds
   
   private String name;
   private int age;
   private String color; 
      
  //constructor
   
   
    public Horse ( String n, int a, String c )
    {
   
      name = n; 
      age = a;
      color = c;
    }  

  // Acccessors Mutators
  
    public String getName()
    
    {
    
    return name;
    
    } 
     
  // General Methods
  
    //1
    public void eat ()
    {
    
      System.out.println( name + " is eating " );
    }
    //2
    public void bite () 
    {
      System.out.println( name + " is trying to kill owner" );
    } 
}//end main 