import javax.swing.JOptionPane;
import java.io.*;


public class VirtualMachine implements VMinstruction
{
 
   private IntStack stack = new IntStack(20);
   private int pc = 0 ;
   private int ir;
   private int[] memory = { 8,5, //const1
                          8,2,//const2
                          11, //add
                          10, 16, //store at address 16
                          9, 16, //load from address 16 
                          21,//write 
                          0,//halt 
                          0,0,0,0,0,0,0,0,0,0,0,0};
                          
   public VirtualMachine()
 {
   
   int[] tm = {CONST, 20, CONST, 23, ADD, WRITE, HALT};
   memory = tm;
 
 }
 
 public VirtualMachine(String filename)
 {
  
  int i = 0;
  memory = new int [20000];
  String aLine;
  FileReader fr;
  BufferedReader br;
  
  try 
  {
 
     fr = new FileReader(filename);
     br = new BufferedReader(fr);
  
     aLine = br.readLine();
     
     while( aLine != null && i< memory.length)
     {
       memory[i] = Integer.parseInt(aLine);
       i++;
       aLine = br.readLine();
     }
   }
   catch(FileNotFoundException fnf)
   {
     System.out.println(filename + "  was not found");
     System.exit(0);
   }
   catch(IOException ioe)
   {
     System.out.println("Wrong");
     System.exit(0);
   }
   catch(Exception e)
   {
     System.out.println("!!!!!");
     System.exit(0);
   
   } 
 }
 
 
 
   public void fetchDecodeExecute()
   {
   
      int d, x,y;
      
      do
      {
      
        ir = memory[pc];//fetch
        pc++; //inc the pc 
        
        switch(ir)
        {
        
          case 0:
          
            System.out.println("Program halted by halt instruction");
            System.exit(0);
            break;
         
         case 8 ://const
            d = memory[pc];//get constant from memory
            pc++;//inc the pc 
            stack.push(d);//store constant on stack 
            break;
         
         case 9://load 
            stack.push( memory[memory[pc]] );
            pc++;
            break;
          
         case 10://STO
            memory[memory[pc]] = stack.pop();
            pc++;
            break;
         
         case 11:
            y = stack.pop();
            x = stack.pop();
            d = x + y;
            stack.push(d);
            break;
         
         case 12:
            y = stack.pop();
            x = stack.pop();
            d = x - y;
            stack.push(d);
            break;
            
        case 13:
            y = stack.pop();
            x = stack.pop();
            d = x * y;
            stack.push(d);
            break;

        case 14:
            y = stack.pop();
            x = stack.pop();
            d = x / y;
            stack.push(d);
            break;

        case 15:
            y = stack.pop();
            x = stack.pop();
            if(x == y)
            {
              stack.push(1);  
            }
            else
            {
              stack.push(0);
            }
            break;
           
         case 16:  
            y = stack.pop();
            x = stack.pop();
            if(x < y)
            {
              stack.push(1);  
            }
            else
            {
              stack.push(0);
            }
            break;
         
         case 17:  
            y = stack.pop();
            x = stack.pop();
            if(x > y)
            {
              stack.push(1);  
            }
            else
            {
              stack.push(0);
            }
            break;
            
         case 18:
           pc = memory[pc];
           break;
           
          case 19:
           if(stack.pop()==0)
           {
           pc = memory[pc];
           }
           else
           {
           pc++;
           }
           break;
           
           
          case 20:
            
            d = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer"));
            stack.push(d);
            break; 
           
          case 22:
            stack.push(pc+1);
            pc = memory[pc];
            break;
            
          case 23:
            pc = stack.pop();  
            break;

          case 21:
            System.out.println(stack.pop());
            break;
            
         
          default:
           System.out.println("invalid instruction" + " " + pc);
           
           System.exit(0);
           break;  
            
            
        
        
        }
       }while(true);//End switch
      
    }//end FDE
 
                          
}//End class

