import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeetToMeters extends JFrame implements ActionListener
{
	private JButton bConvert;
	private JLabel  lblMeters;
	private JTextField tfFeet;

	public FeetToMeters()
	{
		//use JFrame's constructor to title window
		super("Convert Feet to Meters");
		setBounds(100,100,280,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(2,2,6,6));

		//create JButtons and JLabel
		bConvert = new JButton("Convert");
		//lblFeet = new JLabel("Feet: ");
		lblMeters = new JLabel("Meters");
		tfFeet= new JTextField("");

		//add the controls to the contentPane
		add( new JLabel("Feet: ") );
		add(tfFeet);
		add(bConvert);
		add(lblMeters);

		//connect the buttons to the listener
		bConvert.addActionListener(this);

		setVisible(true);
	}// end of constructor

	public void actionPerformed(ActionEvent ae)
	{
		final float FTOMCF = 0.3048f;
		String sFeet = tfFeet.getText();

		try
		{
			float meters = Float.parseFloat(sFeet) * FTOMCF;
			lblMeters.setText( Float.toString(meters) );
		}
		catch(Exception nfe)
		{
			lblMeters.setText(tfFeet.getText() + " is not a number");
		}

	}


	public static void main(String args[])
	{
		FeetToMeters f = new FeetToMeters();
	}
}