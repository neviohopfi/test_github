package musicalChairs;

public class MusicalChairsGame {

	public static void main(String[] args) {
		
		MusicalChair mc1 = new MusicalChair("Lisa", "Susi", "Tom");
		System.out.println(mc1);
		
		MusicalChair mc2 = new MusicalChair("Madeleine", "Benedikt");
		System.out.println(mc2);
		
		MusicalChair mc3 = new MusicalChair();
		System.out.println(mc3);

	}

}
