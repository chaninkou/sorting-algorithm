package heapSort;

public class AnotherVerisonHeapSort {
	private static int heapSize;

	public static void main(String[] args)
	{
		// Making a list
		int[] array = { 3, 2, 5, 1, 6, 4 };
		
		System.out.println("Original list");
		printArray(array);
		
		System.out.println("\n\nAfter heap sort");
		heapSort(array);
		printArray(array);
	}
	
	// shortcut for printing array
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

	// setting the left child
	public static int left(int index) 
	{
		return 2 * (index + 1) - 1;
	}

	// // setting the left child
	public static int right(int index) 
	{
		return 2 * (index + 1);
	}
	
	// maxHeapifty
	public static void maxHeapifty(int[] array, int index) 
	{
		int n = heapSize;
		int left = left(index);
		int right = right(index);
		int largest = 0;

		if (left <= n - 1 && array[left] > array[index]) 
		{
			largest = left;
		} else 
		{
			largest = index;
		}
		if (right <= n - 1 && array[right] > array[largest]) 
		{
			largest = right;
		}
		if (largest != index) 
		{
			int temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			maxHeapifty(array, largest);
		}
	}

	// buildMaxHeap method
	public static void buildMaxHeap(int[] array) 
	{
		heapSize = array.length - 1;
		for (int i = (array.length - 1) / 2; i >= 0; i--)
		{
			maxHeapifty(array, i);
		}
	}

	// finally heapsorting the list
	public static void heapSort(int[] array) 
	{
		buildMaxHeap(array);
		for (int i = array.length - 1; i >= 1; i--)
		{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapSize = heapSize - 1;
			maxHeapifty(array, 0);
		}
	}
}
