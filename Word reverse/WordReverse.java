public class WordReverse
{
 public static void main(String [] args)
 {
  System.out.println("Hello World!");
  
  System.out.println("------------------------------------------");
  
  System.out.println(reverseString("Hello World!"));
  
 }
 
 public static String reverseString(String s)
 {
   char c = s.charAt(s.length()-1);
     
     if(s.length() == 1) 
     
     return Character.toString(c);   
     return c + reverseString(s.substring(0,s.length()-1));
 }
}

