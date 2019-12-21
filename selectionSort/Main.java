package selectionSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] list = {5,8,1,3,9,6};
		
		System.out.println("Input: " + Arrays.toString(list));
		
		SelectionSort solution = new SelectionSort();
		
		System.out.println("Sorted value: " + Arrays.toString(solution.selectionSort(list)));
	}
}
