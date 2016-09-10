import javax.swing.JOptionPane; 
public class DensityAltitude
{
  public static void main (String [] args)
  {
   
    String sDensity;
    double Density;
  
    String sPressure;
    double Pressure; 
       
   
    String sTemperature;
    double Temperature;
   
  
    sPressure = JOptionPane.showInputDialog(null, "Enter Pressure" );
    Pressure = Float.parseFloat( sPressure );  
      
     
    sTemperature = JOptionPane.showInputDialog(null, "Enter Temperature" );
    Temperature = Float.parseFloat( sTemperature );   
   
   
    double DensityAlttitude = 145442.16d * ( 1 - Math.pow((17.326* Pressure) / (459.67 + Temperature), 0.235));
    
    
    System.out.println("DensityAlttitud = " + DensityAlttitude);  
      
  }
}














