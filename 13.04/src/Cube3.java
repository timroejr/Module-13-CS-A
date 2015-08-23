
public class Cube3 extends Box3 {

	private int length, width, height;
	
	public Cube3(int l, int w, int h) {
		super(l, w, h);
		length = l;
		width = w;
		height = h;
	}
	
	public String type() {
		return "Cube - ";
	}
	
	public String toString() {
		String d =  type() + length + " X " + width +" X " + height;
		return d;
	}


}
