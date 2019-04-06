
public class Rectangle 
{
	private double length;
	private double width;
	
	/**
	 * No-arg Constructor
	 */
	public Rectangle ()
	{
		length = 1.0;
		width = 1.0;
	}
	
	/**
	 * Parameter Constructor
	 * @param l Length
	 * @param w Width
	 */
	public Rectangle (int l,int w)
	{
		length = l;
		width = w;
	}

	/**
	 * Stores a value in the length field
	 * @param len The value to store in length
	 */
	public void setLength(double len)
	{
		length = len;
	}

	public void setWidth(double wid)
	{
		width = wid;
	}
	
	/**
	 * Gets the length for the user
	 * @return Returns the length
	 */
	public double getLength()
	{
		return length; //Has access to variables, doesn't need to be passed
	}
	
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * Calculates the area of the rectangle
	 * @return Returns the area
	 */
	public double getArea()
	{
		double area = length * width;
		return area;
	}
}
