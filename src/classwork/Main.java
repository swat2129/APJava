package classwork;

public class Main {
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		
		long startTime = System.nanoTime();
		System.out.println("Version 1: \n" + puzzle.getHint("HEART"));
		long endTime = System.nanoTime();
		System.out.printf("Nanoseconds taken: %d\n", endTime - startTime);
		
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.println("Version 2: \n" + puzzle.getHintv2("HEART"));
		endTime = System.nanoTime();
		System.out.printf("Nanoseconds taken: %d\n", endTime - startTime);
	}
}
