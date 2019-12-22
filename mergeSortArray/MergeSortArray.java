package mergeSortArray;
/**
 * 
 * Merge sort is O(nlogn) no matter if its almost sorted or not
 * Quick sort is better than merge sort if get random pivot
 * Quick sort have constant size, merge sort need extra space
 * Merge sort uses O(n) extra space
 * If sorting linked list, only need log(n) extra space for recursion
 * Good when random access is much more expensive than sequential access
 */

public class MergeSortArray {
	
	public int[] mergeSort(int[] array) {
		// If there is only one element, it is already sorted
		if(array.length <= 1){
			return array;
		}
		
		// The midpoint of the current array
		int midpoint = array.length / 2; 
		
		// Set the size for the left array
		int[] left = new int[midpoint];
		
		// Set the size for the right array
		int[] right = new int[array.length - midpoint];
		
		// Store those value from 0 index to midpoint into the left array
		for(int i = 0; i < midpoint; i++){
			left[i] = array[i];
		}
		
		// Store those value from midpoint to end into the right array
		for(int j = 0; j < right.length; j++){
			right[j] = array[midpoint + j];
		}
		
		// Sorted result array
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		
		right = mergeSort(right);
		
		result = mergeTwoArray(left, right);
		
		return result;
    }
    
    
    // After spliting the list, now we will merge them in a sorted list
    private static int[] mergeTwoArray(int[] left, int[] right){
    	int[] result = new int[left.length + right.length];
    	
    	int leftPointer, rightPointer, resultPointer;
    	leftPointer = rightPointer = resultPointer = 0;
    	
    	// While there are element in either left array or right array
    	while(leftPointer < left.length || rightPointer < right.length){
    		// If both array have elements
    		if(leftPointer < left.length && rightPointer < right.length){
    			// if the right array elemenet is bigger than left array element
    			if(left[leftPointer] < right[rightPointer]){
    				// Add the left array element into result array
    				result[resultPointer] = left[leftPointer];
    				
    				// Update the pointer
    				leftPointer++;
    				resultPointer++;
    			} else { // left array element is bigger than right array element
    				result[resultPointer] = right[rightPointer];
    				
    				rightPointer++;
    				resultPointer++;
    			}
    		} else if(leftPointer < left.length){ // If only left array have element left
    			result[resultPointer++] = left[leftPointer++];
    			
    		} else if(rightPointer < right.length){ // If only right array have element left
    			result[resultPointer++] = left[leftPointer++];
    			
    		}
    	}
    	
    	return result;
    }
}
