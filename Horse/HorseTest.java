public class HorseTest
{
  public static void main(String[] args)
  {
    Horse myHorse = new Horse("Mo", 12, "brown");
    
    myHorse.eat();
    myHorse.bite();
    myHorse.talk("I am about to step on your foot and break it");

    System.out.println( myHorse.getName() );
    
    System.out.println( myHorse.getAge() );
    myHorse.setAge( 15 );
    System.out.println( myHorse.getAge() );
   

  }
}