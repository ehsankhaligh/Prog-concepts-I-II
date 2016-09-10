public class ChickenTest
{
  public static void main(String[] args)
  {
    Chicken Chicken1 = new Chicken("Fried Chicken", 6 );
    
    System.out.println( Chicken1.getName() );
    System.out.println( Chicken1.getAge() );
    System.out.println( Chicken1.geteggCount() );
    
    Chicken1.eat();
    Chicken1.getAge();
    Chicken1.layEgg();
    Chicken1.MakeNoise();
   
   }
  
 }