public class Node
{
 private int d;
 private Node next;
 
 public Node(int stuff)
 {
 
   d = stuff;
   next = null; 
   
 }
 
 public void setNext( Next newNext)
 {
  next = newNext;
  
 }
 
 public int getD()
 {
 
   return d;
 
 }
  
 public void push(int e)
 {
 
   Node sp=null;
   Node newNode = new Node(e);
   newNode.setnext(sp);
   sp = newNode;
 }
 
}