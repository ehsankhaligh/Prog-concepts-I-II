public class DrawPumpkinTest 
{
  public static void main( String [] args ) 
  {
     GraphicsFrame gf = new GraphicsFrame ();
       

     
     pumpkin myPumpkin3 = new pumpkin("Happy halloween", 490,70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,    0,0, "black");
     gf.add(myPumpkin3);          
     
     pumpkin myPumpkin = new pumpkin("Big Larry", 50, 60,110,12,10,50,105,150,20,40,135,95,10,10,90,95,10,10,           130, 150, "ORANGE");
     gf.add(myPumpkin);          
     
     pumpkin myPumpkin1 = new pumpkin("Nick", 280, 220,340,172,10,50,325,320,40,20,365,250,10,10, 320,250,10,10,     130, 150, "ORANGE");
     gf.add(myPumpkin1);
     
     
     pumpkin myPumpkin2 = new pumpkin("Sierra", 530, 340,590,291,10,50,580,440,30,25,565,365,10,10,620,365,10,10,         130, 150, "ORANGE");
     gf.add(myPumpkin2);


    } 
}

