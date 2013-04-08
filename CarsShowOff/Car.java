import java.io.Serializable;


public class Car implements Serializable
{
	public Car()
	{
		
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String c)
	{
		this.color = c;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String mn)
	{
		this.manufacturer = mn;
	}
	
	public String getModel()
	{
		return model;
		
	}
	
	public void setModel(String md)
	{
		this.model = md;
	}
	
	private String color;
	private String manufacturer;
	private String model;
	
}