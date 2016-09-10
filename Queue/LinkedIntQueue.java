public class LinkedIntQueue implements Queue
{
  private Node front, rear; // references for the ends of the queue
  private int count;// Node count, number of items in queue 
 
  public LinkedIntQueue()
  {
    front = null; 
    rear = null; 
    count = 0;
  }  
 
  public int deque()
  {
    int rv = 0; // return value 
    
    
    if(!isEmpty())
    {
      rv = front.data;
      if (count > 1)
      {
        front = front.next;
        count--;
      }
    }
    else // qis empty 
    {
      front = rear = null;
      count = 0; 
    
    }
    return rv;
  }
  
   public void enque(int d) 
   {
     Node newNode = new Node(d);
     count++;
   
     if (!isEmpty())
     {
       rear.next = newNode;
       rear = newNode;  
     }
     else // empty List 
     {
       front = rear = newNode;
     }
   } 
 
   public int size()
   {
      int count = 0;
      for (Node node = front; node != null; node = node.next )
      {
         count++;
      }
      return count;
   
   }

   public boolean isEmpty()
   {
     return front == null;
   }  

   public boolean isFull()
   {
     return false; 
    
   }
   
   private class Node 
   {
    int data;
    Node next;
   
    public Node(int d)
    {
      data = d;
    
    }  
   }// End class Node 
}