/**
 * 
 * @author timothyroejr
 *
 */
public class TestTerrain {
	private static int length, width, trees, mountains;
	private static double temp;
	public static String getForest() {
		length = 100;
		width = 200;
		trees = 100;
		Forest fr = new Forest(length, width, trees);
		String data = fr.getType() + fr.terrainSize() + fr.getData();
		return data;
	}
	public static String getMountain() {
		length = 300;
		width = 400;
		mountains = 25;
		Mountain mt = new Mountain(length, width, mountains);
		String data = mt.getType() + mt.terrainSize() + mt.getData();
		return data;
	}
	public static String getWinterMountain() {
		length = 500;
		width = 600;
		temp = 10.0;
		mountains = 15;
		WinterMountain wMt = new WinterMountain(length, width, mountains, temp);
		String data = wMt.getType() + wMt.terrainSize() + wMt.getMountain() + wMt.getData();
		return data;
	}
	public static void main(String[] args) {
		System.out.println(getForest());
		System.out.println(getMountain());
		System.out.println(getWinterMountain());
	}
}
