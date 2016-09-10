public class TestStack 
{
 public static void main(String[] args)
 {
 
  IntStack s = new IntStack(10);
      
      System.out.println("Stack is Empty: " + s.isEmpty());
      System.out.println("Stack is Full: " + s.isFull());
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(5);
      System.out.println("Stack Size is; " + s.size());
      
      System.out.println("-----------------");
      
      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());
     
      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());
      
      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());

      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());
      
      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());
            
      System.out.println("Stack peek is: " + s.peek());
      System.out.println("Pop: " + s.pop());
            

      

      System.out.println("-----------------");

      System.out.println("Stack is Empty: " + s.isEmpty());
      System.out.println("Stack is Full: " + s.isFull());
        
 
 
 }
}