package classwork;

public class Main {
	public static void main(String[] args) {
		/*
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
		*/
		
		System.out.println(isCompleteSubset("adlfjkalsdf", "ad"));
	}
	
	public static boolean isCompleteSubset(String group, String other) {
		String temp = other;
		for (int i = 0; i < group.length(); i++) {
			String letter = group.substring(i, i+1);
			if (temp.indexOf(letter) < 0) return false;
			else temp = temp.substring(0,temp.indexOf(letter)) + '-' + temp.substring(temp.indexOf(letter) + 1);
		}
		return true;
	}
	
	public static boolean contains(String group, String other) {
		return group.indexOf(other) >= 0;
	}
}
