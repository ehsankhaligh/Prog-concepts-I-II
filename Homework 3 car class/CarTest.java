public class CarTest
{
  public static void main(String[] args)
  {
    Car myCar = new Car( "Toyota", "Prius", 2014 , 25000 );
    
    System.out.println( myCar.getMake());
    System.out.println( myCar.getModel());
    System.out.println( myCar.getYear());
    System.out.println( myCar.getCost());
    
    System.out.println(" ");
    
    myCar.forward(); // move car forward
    myCar.reverse();
    myCar.turn("right");
    
    
  }
}