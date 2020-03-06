package heapSort;

import java.util.Arrays;
// Video explanation: https://www.youtube.com/watch?v=k72DtCnY4MU&t=1504s
// No code provided, but understood the concept to do it

public class Main {
	public static void main(String[] args) {
		int[] items = {10, 6, 7, 5, 15, 17, 12};
		
		System.out.println("Original Array: " + Arrays.toString(items));
		
		HeapSort heap = new HeapSort(items);
		
		heap.heapSort();
	}
}
