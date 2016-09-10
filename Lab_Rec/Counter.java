public class Counter
{
 public static void  myMethod(int Counter)
 {
   if(Counter == 0) //base case 
   {
     return; 
   
   }
   else
   {
     
     myMethod( Counter -1 ); //smaller caller 
     System.out.println(Counter);
     return;
   }
 }
 
  public static void main(String[] args)
  {
   myMethod(9);  
   System.out.println("Program Complete. :-)"); 
  }

}

