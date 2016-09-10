public class VmTest
{
public static void main( String [] args)
{
 
   VirtualMachine myVM;
  
   
   if(args.length>0)
   {
     myVM = new VirtualMachine(args[0]);
     myVM.fetchDecodeExecute();
   }
   else
   {
  
     myVM = new VirtualMachine();
     myVM.fetchDecodeExecute();

   
   }

} 
}