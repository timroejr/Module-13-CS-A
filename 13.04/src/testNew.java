
public class testNew {

	public static void calcData() {
		Rectangle3 one = new Rectangle3(5, 20);
		Box3 two = new Box3(4, 4, 4);
		Box3 three = new Box3(4, 10, 5);
		Cube3 four = new Cube3(4, 4, 4);
		showEffectBoth(one);
		showEffectBoth(two);
		showEffectBoth(three);
		showEffectBoth(four);
		equals(two, four);
		equals(three, four);
	}
	
	public static void showEffectBoth(Rectangle3 r) {
		System.out.println(r);
	}
	
	public static void equals(Rectangle3 r1, Rectangle3 r2) {
		String subR1 = r1.toString();
		String subR2 = r2.toString();
		int subR1Index = subR1.indexOf("-") + 2;
		int subR2Index = subR2.indexOf("-") + 2;
		subR1 = subR1.substring(subR1Index);
		subR2 = subR2.substring(subR2Index);
		if (subR1.equals(subR2)) {
			System.out.println(subR1 + " is the same size as " + subR2);
		} else {
			System.out.println(subR1 + " is not the same size as " + subR2);
		}
		
	}
	
	public static void main(String[] args) {
		calcData();
	}

}
