import java.awt.Graphics;
import java.awt.Color;

public class DrawPicture implements Drawable
{
  public void draw( Graphics g )
  {
    Color myRed = new Color(123,44,98);
    
    
    // draw picture here
    g.setColor( Color.PINK );
    g.fillOval(60,70,200,120);
    
    g.drawLine(100, 50, 289,50);
    
    g.drawRect(100,250,75, 100);
    g.drawLine(0,0, 400,400);
    
    g.setColor( Color.CYAN );
    g.drawString("CSCI 12", 24,30);
    g.drawOval( 500,500, 35,60 );
    
    g.setColor( Color.YELLOW );
    g.fillRect(400,400, 30,30);
    
    g.setColor( Color.YELLOW );
    g.fillRect(50,33, 20,30);
    
    g.setColor( myRed );
    g.fillOval( 700,700, 25,25);
    g.setColor( Color.red);
    g.drawString ("Sierra College" ,200,200);
    
    
    g.setColor ( Color.ORANGE );
    g.drawLine ( 160,140,400,290);
        
    g.drawString ("Ehsan Hosseinzadeh Khaligh" ,300,400);
    
    g.drawOval(10,20,200,200);


    g.drawRect(50,60,120,300);
    g.fillRect(90,80,150,120);
  }
}