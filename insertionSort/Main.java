package insertionSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] list = {9,8,7,6,5,4,3};
		
		System.out.println("Input: " + Arrays.toString(list));
		
		InsertionSort solution = new InsertionSort();
		
		System.out.println("Sorted value: " + Arrays.toString(solution.insertionSort(list)));
	}
}
