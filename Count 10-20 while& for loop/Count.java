public class Count
{
 public static void main (String [] args)
 {
   int sum = 0;
   int i = 10;
   
   while ( i <= 20 )
   {
    
    sum = sum + i;
    i++;
    System.out.println(sum);
   }
   
   
   System.out.println(); 
   System.out.println("For Loop Starts from here: ");
   
   int sum1 = 0;
   for (i = 10; i <=20 ; i++)
   {
   
    sum1 = sum1 + i;
    System.out.println(sum1);
   
   }
   
 }
}