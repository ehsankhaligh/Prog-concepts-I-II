public class IntStack implements StackIntADT
{
 // fields
  
  private int stk[];
  private int sp; //Stack Pointer 
 
 // constructors
 
  public IntStack()
  {
   stk = new int[10];
   sp = -1;
  
  } 

  public IntStack( int StackSize)
  {
  
   
   stk= new int[StackSize];
   sp=-1;
  
  }
    
 // stack class methods
 
   public int size()
   {
      return sp+1;
   }//End size 
  
   public boolean isFull()
   {
     return sp == stk.length-1;
   }//End isFull
   
   public boolean isEmpty()
   {
      return sp==-1;

   }//End isEmpty
   
   public int peek()
   {
      int q = 0;
      if (!isEmpty())
      {
       
        q = stk[sp];
       
      }
      else 
      {
       System.out.println("In the peek method stack is empty");
       System.exit(0);
      }
    
    return q;  
      
   }//End peek
  
   public void push (int e)
   {
     if(!isFull())
     {
       sp++;
       stk[sp]=e;
     }  
     else //Stack is full 
     { 
      System.out.println("Stack is full");
      System.exit(0);
     }
     
     
          
   }// End push  
  
   public int pop()
   {
     
      int p = 0 ;
      if(!isEmpty())
      {
      
        
        p = stk[sp];
        sp--;
        

        
     }
     else
     {
       System.out.println("Stack is empty");
       System.exit(0);
       
     }
    
     return p ;
    
   }//End pop
  
  
  
}