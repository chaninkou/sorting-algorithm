package bubbleSort;

public class BubbleSort {
	public static void main(String args[]) {
		int array[] = {31, 41, 59, 26, 41, 58};
		System.out.println("Original array");
		printArray(array);
		System.out.println("\n");
		bubbleSort(array);
		System.out.println("Sorted array");
		printArray(array);
	}

	public static void bubbleSort(int array[]) 
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			// boolean swapped = false;
			// System.out.println("i: " + i);
			for (int j = 1; j < array.length - i; j++) 
			{
				// System.out.println(j + ": " + array[j] + " j-1: " +
				// array[j-1]);
				// System.out.println();
				if (array[j] < array[j - 1]) 
				{
					// System.out.println("swap");
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					// swapped = true;
				}
				// if(!swapped)
				// break;
			}
		}
	}

	// printing array with for loop
	public static void printArray(int array[]) 
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
