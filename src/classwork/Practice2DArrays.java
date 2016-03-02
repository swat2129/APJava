package classwork;

public class Practice2DArrays {
	public static void main(String[] args) {
		int[][] testArr = {{9, 8, 7, 6}, {5, 4, 2, 1}, {3, 9, 2, 3}};
		// posToNeg2D(testArr, 0, 0);
		printDoubleArr(posToNeg2D(testArr, 1, 1));
		
	}
	
	public static int[][] posToNeg2D(int[][] mat, int x, int y) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == x && j == y) {
					
				} else if (Math.abs(x - i) < 2 && Math.abs(y - j) < 2) {
					mat[i][j] = Math.abs(mat[i][j]) * -1;
				}
			}
		}
		return mat;
	}
	
	public static int[] rowMajorOrder(int[][] nums) {
		int[] orderedArr = new int[nums.length * nums[0].length];
		int count = 0;
		for (int[] subArr: nums) {
			for (int i: subArr) {
				orderedArr[count] = i;
				count++;
			}
		}
		return orderedArr;
	}
	
	public static void printDoubleArr(int[][] arr) {
		for (int[] subArr: arr) {
			for (int i: subArr) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}
}
