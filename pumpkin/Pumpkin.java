import java.awt.*;


public class Pumpkin implements Drawable
{
   private int x,y;
   private int width, height;
   private Color Color;
   private String title; 
   
   
   public Pumpkin( int px, int py, int w, int h, Color c, String t)
   {
    x = px;
    y = py;
    width = w;
    height = h;
    this.Color = c;
    title = t;  
   
   }
  public void draw ( Graphics g ) 
  {
   
   g.drawString( title, x, y);
   g.setColor( Color );
   g.fillOval(x,y, width,height);
  
  }


}