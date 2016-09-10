public class wingTest 
{
 public static void main (String [] args)
 {
  //public wing ( float wingSpan, float wingChord, float roh, float velocity, float cl, float cd)
   wing w1 = new wing( 28f, 5f, 0.0000789f, 110f, 1.4f, 0.01f);
   wing w2 = new wing( 28f, 5f, 0.0000789f, 110f, 1.4f, 0.01f);
   
   System.out.println("Lift is (wing1): " + w1.lift());
   System.out.println("Lift is (wing2): " + w2.lift());
   System.out.println("");
   
   System.out.println("Drag is (wing1): " + w1.drag());
   System.out.println("Drag is (wing2): " + w2.drag());
   System.out.println("");
   
   System.out.println("AR is (wing1): " + w1.AR());
   System.out.println("AR is (wing2): " + w2.AR());
   System.out.println(w1);
 }
}  