public class Test 
{

 public static void main(String [] args)
 {

   LinkedIntQueue iq = new LinkedIntQueue();
 
   System.out.println("queue is Empty: " + iq.isEmpty());
   System.out.println("queue is Full: " + iq.isFull());
   System.out.println("size of queue is:  " + iq.size());
   
   iq.enque(22);
   iq.enque(142);
   iq.enque(9);
   iq.enque((int)8.9);
   
   System.out.println( "----------------");
 
   System.out.println( iq.deque());
   System.out.println("size of queue is:  " + iq.size());
   System.out.println( iq.deque());
   System.out.println("size of queue is:  " + iq.size());
   System.out.println( iq.deque());
   System.out.println("size of queue is:  " + iq.size());
   System.out.println( iq.deque()); 
   

   System.out.println( "----------------");
     
   System.out.println("queue is Empty: " + iq.isEmpty());
   System.out.println("queue is Full: " + iq.isFull());
   System.out.println("queue is:  " + iq.size());

   
   
 }
} 