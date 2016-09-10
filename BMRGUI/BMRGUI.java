package BMRGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMRGUI extends JFrame 
{
  private JLabel  weightInPounds, heightInInches, ageInYears, sex, space, result;
  private JTextField weight, height, age;
  private JButton Calculate;
  private JRadioButton women, men;
  private ButtonGroup radioGroup;
   
  public BMRGUI()
  {
   super ("Harris Benedict Equation");
   setLayout( new GridLayout(5,2, 1,1));
   
   weightInPounds = new JLabel("Weight (Lbs):");
   add(weightInPounds);
   
   weight = new JTextField("0.0");
   add (weight);
   
   space = new JLabel("");
   add(space);
   
   heightInInches = new JLabel("Height (inches):");
   add(heightInInches);
   
   height = new JTextField("0.0");
   add (height);
   
   space = new JLabel("");
   add(space);

   ageInYears = new JLabel("Age (in Years):");
   add(ageInYears);
   
   age = new JTextField("0.0");
   add (age);
   
   space = new JLabel("");
   add(space);

   sex = new JLabel("sex:");
   add(sex);
   
   women = new JRadioButton("women");
   add(women);
   
   men = new JRadioButton("men");
   add(men);
   
   radioGroup = new ButtonGroup(); 
   radioGroup.add( women ); 
   radioGroup.add( men ); 

   
   
   Calculate = new JButton("Calculate");
   add (Calculate);
   
   space = new JLabel("");
   add(space);
   
   result = new JLabel("0.0");
   add(result);
   
  
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(300,220);
   setVisible(true);

  
  }
  
  public static void main(String [] args)
  {
  
   BMRGUI BG = new  BMRGUI ();
  
  }


}
  
