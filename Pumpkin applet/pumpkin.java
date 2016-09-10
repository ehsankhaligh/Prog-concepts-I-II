import java.awt.*;
import javax.swing.*;
import java.awt.Polygon;
import javax.swing.JApplet;
import java.net.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Graphics2D;
import java.awt.image.*;

 
public class pumpkin implements Drawable 
{
 private String name;
 private int x,y,z,d,f,E,a,b,u,v;
 private int width, height; 
 private int width1, height1;
 private int width2, height2;
 private int width3, height3;
 private int eye, eye1;
 private String color;


 public pumpkin ( String name, int x, int y, int z, int d,int width1, int height1, int f,int E, int width2, int height2,int a,int b,int width3,int height3,int u, int v, int eye, int eye1,int width, int height, String color)
 {
   this.name = name;
   this.x = x;
   this.y = y;
   this.z = z;
   this.d = d;
   this.f = f;
   this.E = E;
   this.a = a;
   this.b = b;
   this.u = u;
   this.v = v;
   this.width = width;
   this.height = height;
   this.width1 = width1;
   this.height2 = height2;
   this.width2 = width2;
   this.height1 = height1;
   this.width3 = width3;
   this.height3 = height3;
   this.color = color;
   this.eye = eye;
   this.eye1 = eye1;
 } 

  public void draw(Graphics g)
  {
   
   
   
   g.setColor(Color.RED);
   g.drawString( name, x, y);
   g.setColor(Color.ORANGE);
   g.fillOval(x, y, width, height);   
   
   g.setColor(Color.BLACK);
   g.fillRect(z, d, width1, height1);
   
   g.setColor(Color.RED);
   g.fillOval(f,E, width2,height2);
   
   
   g.setColor(Color.BLUE);
   g.fillRect(a, b, width3, height3);
   
   
   g.setColor(Color.BLUE);
   g.fillRect(u, v, eye, eye1);


        
  }
}

