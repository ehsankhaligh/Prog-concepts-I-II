public class DrawDogTest 
{
  public static void main( String [] args ) 
  {
     GraphicsFrame gf = new GraphicsFrame ();
     Dog myDog = new Dog("Big larry", 30, 40, 10);
     
     gf.add(myDog);
  } 

}