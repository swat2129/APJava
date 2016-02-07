package homework;

public class TowerOfHanoi {
	
	private static char[] pos = {'A', 'B', 'C'};
	
	// The number of disks: n
	// Poles from left to right is A, B, C
	// Top disk is 0 and bottom disk is n - 1
	
	private static int n = 3;
	private static int startPos = 0;
	private static int[] disksPos= new int[5];
	
	public static void main(String[] args) {		
		for (int i = 0; i < n; i++)
			disksPos[i] = startPos;
		
		solveTOH();
	}
	
	public static void solveTOH() {
		for (int i = 1; i < (int)Math.pow(2, n); i++) {
			System.out.printf("Step %d - ", i);
			
			for (int j = n - 1; j > -1; j--) {
				if (i % (int)Math.pow(2, j) == 0) {
					int shift = j % 2 == 0 ? 1 : -1;
					
					System.out.printf("Move Disk %d from %C to ", j, pos[disksPos[j]]);
					
					disksPos[j] += shift;
					if (disksPos[j] < 0) disksPos[j] += 3;
					else disksPos[j] %= 3;
					
					System.out.printf("%C.\n", pos[disksPos[j]]);
					
					break;
				}
			}
		}
	}
}