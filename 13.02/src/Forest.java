/**
 * 
 * @author timothyroejr
 *
 */
public class Forest extends Terrain {
	/**
	 * Class Constructor and Variables
	 */
	private int trees;
	public Forest(int l, int w, int t) {
		super(l, w);
		trees = t;
	}
	/**
	 * 
	 * @return The Data in a String of Trees
	 */
	public String getData() {
		String treeData = " and has " + trees + " trees";
		return treeData;
	}
	public String getType() {
		String type = "Forest ";
		return type;
	}

}
