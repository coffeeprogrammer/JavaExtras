import java.nio.file.*;
import java.io.*;

import javax.swing.JFrame;

// components??? are these all components???
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
// don't forget to import whatever layout manager!
import java.awt.GridLayout;  // don't think I want this

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.GridBagLayout;

// import listeners
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CarsShowOff extends JFrame  // implements ActionListener
{
	JPanel myPanel;
	JTextField jtxtManufacturer, jtxtModel, jtxtColor;
	JLabel jlblManufacturer, jlblModel, jlblColor;
	
	public CarsShowOff()
	{
		super("Honk, Honk, GET OUT OF THE WAY!!!");
		
		myPanel = new JPanel();
		
		jlblManufacturer = new JLabel("Manufacturer");
		jlblModel = new JLabel("Model");
		jlblColor = new JLabel("Color");
		
		jtxtManufacturer = new JTextField();
		jtxtModel  = new JTextField();
		jtxtColor  = new JTextField();
		
		// add the 3 label and 3 text boxes to myPanel
		myPanel.add(jlblManufacturer);
		myPanel.add(jtxtManufacturer);
		myPanel.add(jlblModel);
		myPanel.add(jtxtModel);
		myPanel.add(jlblColor);
		myPanel.add(jtxtColor);
		
		// configure the layout manager
		myPanel.setLayout(new GridBagLayout());
		
		// add the panel to the frame
		add(myPanel);

	
	}
	
	public static void main(String[] args)
	{
		CarsShowOff showoff = new CarsShowOff();
        	showoff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	showoff.setSize(600, 600);
        	showoff.setVisible(true);

		
	}
	
	public static void AFunFunction()
	{
		Car Ford = new Car();
		
		Ford.setManufacturer("Ford");
		Ford.setModel("F-150");
		Ford.setColor("Black");
		
		storeCar(Ford);
		
		Car aCar = retrieveCar();
		
		
		System.out.println(aCar.getManufacturer());
		System.out.println(aCar.getColor());
	
	}
	
	public static void storeCar(Car oCar)
	{
		
		
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("park.dat"));
			out.writeObject(oCar);
		}
			catch(IOException e)
		{
			
		}
		
		
	}
	
	public static Car retrieveCar()
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("park.dat"));
			Car oCar = (Car) in.readObject();
			return oCar;
		}
		catch(IOException e)
		{
			System.err.println("IO Error");
			return null;
		}
		catch(ClassNotFoundException e)
		{
			return null;
		}
	}
	
} // end of class
