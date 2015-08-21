/**
 * 
 * @author timothyroejr
 *
 */
public class Mountain extends Terrain {
	/**
	 * Class Constructor and Variables
	 */
	private int mountains;
	public Mountain(int l, int w, int m) {
		super(l, w);
		mountains = m;
	}
	/**
	 * 
	 * @return String of Mountains
	 */
	public String getData() {
		String mt = /*"Mountain Land has dimensions "+ length + " X " + width +*/ " and has " + mountains + " mountains";
		return mt;
	}
	public String getType() {
		String type = "Mountain ";
		return type;
	}
	/**
	 * 
	 * @return String of Mountains
	 */
	public String getMountain() {
		String mt = /*"Mountain Land has dimensions "+ length + " X " + width +*/ " and has " + mountains + " mountains";
		return mt;
	}
}
