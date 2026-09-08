// Korey Rodi
// 9/8/25
// Assignment 2 Get You A Cat

// This programs purpose is to print out the lines of a folk song using functions instead line by line


package FolkSong;

public class Song {
	public static void CatLyrics() {
		System.out.println("Bought me a cat and the cat pleased me,\n"
				+ "I fed my cat under yonder tree.");
	}
		
	public static void CatSounds() {
		System.out.println("Cat goes fiddle-i-fee.");
	}
	
	public static void HenLyrics() {
		System.out.println("Bought me a hen and the hen pleased me,\n"
				+ "I fed my hen under yonder tree.");
	}
	
	public static void HenSounds() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	
	public static void DuckLyrics() {
		System.out.println("Bought me a duck and the duck pleased me,\n"
				+ "I fed my duck under yonder tree.");
	}
	
	public static void DuckSounds() {
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void GooseLyrics() {
		System.out.println("Bought me a goose and the goose pleased me,\n"
				+ "I fed my goose under yonder tree.");
	}
	public static void GooseSounds() {
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void SheepLyrics() {
		System.out.println("Bought me a sheep and the sheep pleased me,\n"
				+ "I fed my sheep under yonder tree.");
	}
	
	public static void SheepSounds() {
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void PigLyrics() {
		System.out.println("Bought me a pig and the pig pleased me,\n"
				+ "I fed my pig under yonder tree.");
	}
	
	public static void PigSounds() {
		System.out.println("Pig goes oink, oink,");
	}
	
	public static void Verse1() {
		CatLyrics();
		CatSounds();
	}
	
	public static void Verse2() {
		HenLyrics();
		HenSounds();
		CatSounds();
	}
	
	public static void Verse3() {
		DuckLyrics();
		DuckSounds();
		HenSounds();
		CatSounds();
	}
	public static void Verse4() {
		GooseLyrics();
		GooseSounds();
		DuckSounds();
		HenSounds();
		CatSounds();
	}
	
	public static void Verse5() {
		SheepLyrics();
		SheepSounds();
		GooseSounds();
		DuckSounds();
		HenSounds();
		CatSounds();
	}
	
	public static void Verse6() {
		PigLyrics();
		PigSounds();
		SheepSounds();
		GooseSounds();
		DuckSounds();
		HenSounds();
		CatSounds();
	}
	
	public static void main(String[] args) {
		Verse1();
		System.out.println();
		Verse2();
		System.out.println();
		Verse3();
		System.out.println();
		Verse4();
		System.out.println();
		Verse5();
		System.out.println();
		Verse6();

	}

}
