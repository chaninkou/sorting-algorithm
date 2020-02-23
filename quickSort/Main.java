package quickSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {4,3,5,2,1,2};
		
		System.out.println(Arrays.toString(A));
		
		PracticeQuickSort sorting = new PracticeQuickSort();
		
		sorting.quickSort(A);
		
		System.out.println(Arrays.toString(A));
	}
}
