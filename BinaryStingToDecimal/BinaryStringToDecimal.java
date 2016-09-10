public class BinaryStringToDecimal 
{
 public static void main (String [] args)
 {
   String input = "10111111111101";
   long digitWeight;
   long d = 0;
   int charPosition = 0;
   
   for (int i=0; i < input.length(); i++)// no semicolon 
   {
     //System.out.println( (int) Math.pow(2,i)* (input.charAt( (input.length() - i -1)) - 48));
     digitWeight=(int) Math.pow(2,i)* (input.charAt( (input.length() - i -1)) - 48);
     d = d + digitWeight;
   }

     System.out.println(d);
 }
}