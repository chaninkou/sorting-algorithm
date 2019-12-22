package mergeSortArray;

public class MergeSortArrayTest {
	public int[] mergeSort(int[] array){
		// If there is only one element in the array, return it
		if(array.length <= 1){
			return array;
		}
		
		// Get the midpoint of current array
		int midPoint = array.length / 2;
		
		// The left array 
		int[] left = new int[midPoint];
		
		// The right array
		int[] right = new int[array.length - midPoint];
		
		// Put the left side of the array to the new left array
		for(int i = 0; i < midPoint; i++){
			left[i] = array[i];
		}
		
		// Put the right side of the array to the new right array
		for(int j = 0; j < right.length; j++){
			right[j] = array[midPoint + j];
		}
		
		// Creating a result array
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		
		right = mergeSort(right);
		
		result = mergeTwoArray(left, right);
	
		return result;
	}

	// Merge the left and right array into a one sorted array
	private int[] mergeTwoArray(int[] left, int[] right) {
		// Creating the result array
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		
		leftPointer = rightPointer = resultPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length){
			if(leftPointer < left.length && rightPointer < right.length){
				// Check which current array is smaller
				if(left[leftPointer] < right[rightPointer]){
					// Make sure to update the pointer
					result[resultPointer++] = left[leftPointer++];
				}else if(right[rightPointer] <= left[leftPointer]){
					result[resultPointer++] = right[rightPointer++];
				}
			} else if (leftPointer < left.length){
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length){
				result[resultPointer++] = right[rightPointer++];
			}
		}
		
		return result;
	}
}
