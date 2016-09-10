import java.awt.*;

public class Dog implements Drawable 
{
   private String name;
   private int age;
   private int x,y;
 
   public Dog (String n, int a, int px, int py)   
   {
     name = n;
     age = a;
     x = px;
     y = py;
   
   }
   public void draw(Graphics g)
   {
     g.drawRect(x,y, 60,30 );
   
   }
}