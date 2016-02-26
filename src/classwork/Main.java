package classwork;

public class Main {
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		
		System.out.println("Version 1:");
		long startTime = System.nanoTime();
		System.out.println(puzzle.getHint("HEART"));
		long endTime = System.nanoTime();
		System.out.printf("Nanoseconds taken: %d\n", endTime - startTime);
		
		System.out.println();
		
		System.out.println("Version 2:");
		startTime = System.nanoTime();
		System.out.println(puzzle.getHintv2("HEART"));
		endTime = System.nanoTime();
		System.out.printf("Nanoseconds taken: %d\n", endTime - startTime);
	}
}
