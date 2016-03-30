package classwork;

import java.util.Arrays;

public class SortAlgorithms {

	public static void main(String[] args) {
		int[] testArr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
		System.out.println(Arrays.toString(testArr));
		// selectionSort(testArr);
		insertionSort(testArr);
		System.out.println(Arrays.toString(testArr));
		
		int a = 12;
		int b = 4;
		System.out.println("a = " + a + " b = " + b);
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int low = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[low]) low = j;
			}
			int temp = arr[i];
			arr[i] = arr[low];
			arr[low] = temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
	
	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;
		else
			return merge(mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2)),
					mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] temp = new int[arr1.length + arr2.length];
	}
}
