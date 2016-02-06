package homework;

public class TowerOfHanoi {
	
	// The number of disks: n
	private static int n = 3;
	// The positions of poles
	private static char[] pos = {'a', 'b', 'c'};
	private static int startPos = 0;
	
	public static void main(String[] args) {
		System.out.print((int)Math.pow(2, n) - 1);
		// solveTOH();
	}
	
	public static void solveTOH() {
		// Step Number i
		// Disk Number j
		
		for (int i = 1; i < Math.pow(2, n); i++) {
			for (int j = n - 1; j > -1; i--) {
				if (i % (int)Math.pow(2, j) == 0) {
					// When disk number is 0, do something else
					int shift = j % 2 == 0 ? 1 : -1;
					System.out.println("Move Disk " + j + " from " + pos[startPos] + " to " + pos[startPos + shift % 3]);
				}
			}
		}
	}
}
