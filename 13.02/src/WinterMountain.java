/**
 * 
 * @author timothyroejr
 *
 */
public class WinterMountain extends Mountain {
	/**
	 * Class Constructor and Variables
	 */
	private double temp;
	public WinterMountain(int l, int w, int m, double t) {
		super(l, w, m);
		temp = t;
	}
	/**
	 * @return Returns temperature String
	 */
	public String getData() {
		String wMt = " has temperature of " + temp;
		return wMt;
	}
	public String getType() {
		String type = "Winter Mountain ";
		return type;
	}
}
