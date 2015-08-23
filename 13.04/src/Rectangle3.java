public class Rectangle3 {
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	public String type() {
		return "Rectangle - ";
	}
	
	public String toString()
	{
	    return type() + length + " X " + width;
	}
}