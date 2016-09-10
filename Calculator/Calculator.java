import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener  
{
  private JLabel lblResult;
  private JButton btnCalc, zero, one, two, three, four, five, six, seven, eight, nine, add, sutract, multiplication, division, btnC, PN, percentage, dot ;
 
   public Calculator()
  { 
    super ("Calculator");
    setLayout( new GridLayout (5,5));
  
    lblResult = new JLabel ("0");
    add(lblResult);
  
   
    zero = new JButton ("0");
    add(zero);

    one = new JButton ("1");
    add(one); 
  
    two = new JButton ("2");
    add(two); 
  
    three = new JButton ("3");
    add(three);
  
    four = new JButton ("4");
    add(four);
  
    five = new JButton ("5");
    add(five);
  
    six = new JButton ("6");
    add(six);
  
    seven = new JButton ("7");
    add(seven);
  
    eight = new JButton ("8");
    add(eight);
  
    nine = new JButton ("9");
    add(nine);
  
    add = new JButton ("+");
    add(add);
  
    sutract = new JButton ("-");
    add(sutract);
  
    multiplication = new JButton ("*");
    add(multiplication);
  
    division = new JButton ("/");
    add(division);
  
    percentage = new JButton ("%");
    add(percentage);
  
    dot = new JButton (".");
    add(dot);
  
    PN = new JButton ("+/-");
    add(PN);

    btnCalc = new JButton ("=");
    add(btnCalc);
  
        
    btnC = new JButton ("C");
    add(btnC);
    
    
  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setVisible(true);
  
 
 }
 
  public void actionPerformed ( ActionEvent ae )
  {
  
   /*float one = Float.parseFloat(zero.getAccessibleContext()) ;
   int two = 2;
   int three = 3;
   int four =  4; 
   int five = 5;
   int six = 6;
   int seven = 7;
   int eight = 8;
   int nine = 9;*/
   
      
    
  }  
  public static void main  (String [] args)
  {
 
    Calculator cal  = new Calculator();  
 
  }

}