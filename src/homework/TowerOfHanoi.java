package homework;

public class TowerOfHanoi {
	
	private static char[] pos = {'A', 'B', 'C'};
	
	// The number of disks: n
	// Poles from left to right is A, B, C
	// Top disk is 0 and bottom disk is n - 1
	
	private static int n = 4;
	private static int[] disksPos= new int[n];
	
	public static void main(String[] args) {		
		long startTime = System.nanoTime();
		solveTOH(0,0);
		System.out.println("Run time: " + (System.nanoTime() - startTime));
		
		System.out.println();
		
		startTime = System.nanoTime();
		move(n, "B", "A", "C");
		System.out.println("Run time: " + (System.nanoTime() - startTime));
	}
	
	// Recursive method to solve the Tower of Hanoi
	public static void move(int disc, String from, String other, String to) {
		if (disc < 1) {
			return;
		} else if (disc == 1) {
			System.out.printf("Move Disk 0 from %s to %s.\n", from, to);
		} else {
			move(disc - 1, from, to, other); // Move  n - 1 disks to the empty peg
			System.out.printf("Move Disk %d from %s to %s.\n", disc - 1, from, to); // Move base peg to destination
			move(disc - 1, other, from, to); // Move n - 1 disks to the destination peg
		}
	}
	
	// Non-recursive method to solve the Tower of Hanoi
	// However the destination peg can't be chosen as of now
	public static void solveTOH(int from, int to) {
		for (int i = 0; i < n; i++)
			disksPos[i] = from;
		
		for (int i = 1; i < (int)Math.pow(2, n); i++) {
			// System.out.printf("Step %d - ", i);
			
			for (int j = n - 1; j > -1; j--) {
				/*
				That pattern I found during the last homework assignment was 
				that (StepNum % Math.pow(2, 'which disk to move') == 0) 
				can be used to determine which disk moves given the stepNum and the number of Disks
				*/
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