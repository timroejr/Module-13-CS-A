
public class Box3 extends Rectangle3 {
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		super(l, w);
		height = h;
	}

	public int getHeight()
	{
		return height;
	}
	public String type() {
		return "Box - ";
	}
	
	public String toString()
	{
	    return type() + getLength() + " X " + getWidth() + " X " + height;
	}

}
