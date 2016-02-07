package homework;

public class TowerOfHanoi {
	
	// The number of disks: n
	private static int n = 5;
	
	public static void main(String[] args) {		
		solveTOH();
	}
	
	public static void solveTOH() {
		for (int i = 1; i < (int)Math.pow(2, n); i++) {
			System.out.printf("Step %d - ", i);
			for (int j = n - 1; j > -1; j--) {
				if (i % (int)Math.pow(2, j) == 0) {
					System.out.printf("Move Disk %d\n", j);
					break;
				}
			}
		}
	}
}
