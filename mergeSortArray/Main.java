package mergeSortArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = {5,4,3,2,1,1};
		
		System.out.println("Input: " + Arrays.toString(array));
		
		MergeSortArrayTest solution = new MergeSortArrayTest();
		
		int[] sortedArray = solution.mergeSort(array);
		
		System.out.println("Sorted: " + Arrays.toString(sortedArray));
	}
}
