package mergeSortArray;

public class MergeSortArrayTest {
	// O(nlogn) time complexity no matter what
	public int[] mergeSort(int[] nums){
		// Make sure to just return the single element
		if(nums.length == 1){
			return nums;
		}
		
		// Keep cutting the array into 2
		int mid = nums.length / 2;
		
		// Mergesort uses extra O(n) memory because of here, copying array and store it
		int[] left = new int[mid];
		
		int[] right = new int[nums.length - mid];
		
		for(int i = 0; i < left.length; i++){
			left[i] = nums[i];
		}
		
		for(int j = 0; j < right.length; j++){
			right[j] = nums[mid + j];
		}
		
		int[] result = new int[nums.length];
		
		left = mergeSort(left);
		
		right = mergeSort(right);
		
		result = mergeTwoArray(left, right);
		
		return result;
	}
	
	private int[] mergeTwoArray(int[] left, int[] right){
		int[] result = new int[left.length + right.length];
		
		int leftPointer = 0, rightPointer = 0, resultPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length){
			// Whichever smaller one will go to result array first
			if(leftPointer < left.length && rightPointer < right.length){
				if(left[leftPointer] < right[rightPointer]){
					result[resultPointer] = left[leftPointer];
					
					resultPointer++;
					leftPointer++;
					
				} else {
					result[resultPointer] = right[rightPointer];
					
					resultPointer++;
					rightPointer++;
					
				}
				
			} else if (leftPointer < left.length){ // Whichever array still have elements will go into the result array
				result[resultPointer] = left[leftPointer];
				
				resultPointer++;
				leftPointer++;
				
			} else if (rightPointer < right.length){ // Whichever array still have elements will go into the result array
				result[resultPointer] = right[rightPointer];
				
				resultPointer++;
				rightPointer++;
			}
		}
		
		return result;
	}
}
