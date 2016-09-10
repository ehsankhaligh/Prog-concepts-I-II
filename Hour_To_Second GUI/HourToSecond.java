import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HourToSecond extends JFrame implements ActionListener
{
	private JButton bConvert;
	private JLabel  lblHour;
	private JTextField tfSecond;

	public HourToSecond()
	{
		//use JFrame's constructor to title window
		super("Convert hour to Second");
		setBounds(100,100,280,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(2,2,6,6));

		//create JButtons and JLabel
		bConvert = new JButton("Convert");
		//lblFeet = new JLabel("Hour: ");
		lblHour = new JLabel("Second");
		tfSecond= new JTextField("");

		//add the controls to the contentPane
		add( new JLabel("Hour: ") );
		add(tfSecond);
		add(bConvert);
		add(lblHour);

		//connect the buttons to the listener
		bConvert.addActionListener(this);

		setVisible(true);
	}// end of constructor

	public void actionPerformed(ActionEvent ae)
	{
		final float H_To_S = 3600f;
		String sSecond = tfSecond.getText();

		//try
		{
			float Hour = Float.parseFloat(sSecond) * H_To_S ;
			lblHour.setText( Float.toString(Hour) );
		}
		//catch(Exception nfe)
		{
			//lblMeters.setText(tfFeet.getText() + " is not a number");
		}

	}


	public static void main(String args[])
	{
		HourToSecond f = new HourToSecond();
	}
}