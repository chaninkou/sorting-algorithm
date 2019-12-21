package insertionSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] list = {5,8,1,3,9,6};
		
		System.out.println("Input: " + Arrays.toString(list));
		
		InsertionSort solution = new InsertionSort();
		
		System.out.println("Sorted value: " + Arrays.toString(solution.insertionSort(list)));
	}
}
