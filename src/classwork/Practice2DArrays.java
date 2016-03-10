package classwork;

public class Practice2DArrays {
	public static void main(String[] args) {
		int[][] testArr = {{9, 8, 7, 6}, {5, 4, 2, 1}, {3, 9, 2, 3}};
		printDoubleArr(posToNeg2D(testArr, 1, 1));
		
		System.out.println();
		
		int[][] testArr2 = {{9, 8, 7, 6}, {5, 4, 2, 1}, {3, 9, 2, 3}};
		printDoubleArr(posToNeg2Dv2(testArr2, 1, 1));
		
		System.out.println();
		
		printArr(rowMajorOrder(testArr));
	}
	
	public static int[][] posToNeg2D(int[][] mat, int x, int y) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if ((Math.abs(x - i) < 2 && Math.abs(y - j) < 2) && (i != x || j != y)) {
					mat[i][j] = Math.abs(mat[i][j]) * -1;
				}
			}
		}
		return mat;
	}
	
	public static int[][] posToNeg2Dv2(int[][] mat, int x, int y) {
		for (int i = x - 1; i < x + 2; i++) {
			if (i > -1 && i < mat.length) {
				for (int j = y - 1; j < y + 2; j++) {
					if (j > -1 && j < mat[i].length && (i != x || j != y)) {
						mat[i][j] = Math.abs(mat[i][j]) * -1;
					}
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
	
	public static void printArr(int[] arr) {
		for (int i: arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
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
