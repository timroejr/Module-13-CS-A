import java.util.ArrayList;
public class TestPoly2 {
	private static ArrayList<String> centers = new ArrayList<String>();
	private static ArrayList<String> objects = new ArrayList<String>();
	public static void getCenterFromObjects() {
		Circle2 ci = new Circle2(2, 4, 1);
		Cylinder2 cy = new Cylinder2(10, 15, 1, 3);
		Oval2 ov = new Oval2(25, 10, 3, 4);
		OvalCylinder2 oc = new OvalCylinder2(40, 10, 3, 4, 2);
		centers.add(ci.center());
		objects.add(ci.toString());
		centers.add(cy.center());
		objects.add(cy.toString());
		centers.add(ov.center());
		objects.add(ov.toString());
		centers.add(oc.center());
		objects.add(oc.toString());
		printData();
	}
	public static void printData() {
		for (int i = 0; i < centers.size(); i++) {
			System.out.println("For " + objects.get(i) + " " + centers.get(i));
		}
	}
	public static void main(String [] args) {
		getCenterFromObjects();
	}
}
