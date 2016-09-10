import java.util.*;

public class LinkedIntQueue 
{ 
   private Node front, rear; // references for the ends of the queue 
   private int count; // Node count, number of items in queue public LinkedIntQueue() 
   { 
      front = null; 
      rear = null; 
      count = 0; 
   } 
        
   public void enque(int e)
   {
      Node nn = new Node(e);
      if ( isEmpty() )
      {
         //front = rear = nn;
         front = nn; 
      }
      else
      {
         rear.next = nn;
       //  rear = nn;
      }
      // count++;
      rear = nn;
   }


//  ************  delete at front
   public int deque()
   {
 
      int rv = 0;
     
      if ( isEmpty() )
      {
       throw new NoSuchElementException();
      }
         rv = front.data;
         if(rear == front)
         {
            rear = null;
         }
         
            front = front.next;
            return rv;     
     }
      
   public boolean isEmpty() 
   { 
      return front == null; 
   }  // end of isEmpty

   public boolean isFull() 
   { 
      return false; 
   } //  end of isFull
   
   private class Node 
   { 
      int data; 
      Node next; 
      
      public Node(int d) 
      { 
         data = d; 
      } 
   }// end class Node 
   
   public int size()
   {
      int count = 0;
      for (Node node = front; node != null; node = node.next )
      {
         count++;
      }
      return count;
   
   }


   public static void main(String[] args) 
   { 
   //create a queue 
   LinkedIntQueue q = new LinkedIntQueue();
   System.out.println(q.isEmpty() ); 
      q.enque(10); 
      System.out.println( q.front.data );

      q.enque(20); 
      System.out.println( q.rear.data );

      q.enque(30);
      System.out.println( q.rear.data );

      q.enque(40); 
      System.out.println( q.rear.data );
      System.out.println("The size of this mofo queue is " + q.size() );
      System.out.println("This queue is full, " +  q.isFull() );

      q.deque();
      System.out.println("front after deque " +  q.front.data );
      System.out.println("deque " +  q.deque() );
      System.out.println("front of queue is " + q.front.data + ", and the rear of the queue is,  " + q.rear.data);
      System.out.println(q.isEmpty() );
      System.out.println("The size of this queue is now " + q.size() );  
     

   } //  end of main
}  // end of LinkedIntQueue class