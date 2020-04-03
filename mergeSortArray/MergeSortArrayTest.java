package mergeSortArray;

public class MergeSortArrayTest {
	public int[] mergeSort(int[] nums){
		if(nums.length <= 1){
			return nums;
		}
		
		int mid = nums.length/2;
		
		int[] left = new int[mid];
		int[] right = new int[nums.length - mid];
		
		for(int i = 0; i < left.length; i++){
			left[i] = nums[i];
		}
		
		for(int j = 0; j < right.length; j++){
			right[j] = nums[mid + j];
		}
		
		int[] combination = new int[nums.length];
		
		left = mergeSort(left);
		
		right = mergeSort(right);
		
		combination = mergeTwoArray(left, right);
		
		return combination;
	}
	
	private int[] mergeTwoArray(int[] left, int[] right){
		int[] combination = new int[left.length + right.length];
		
		int leftPointer = 0;
		
		int rightPointer = 0;
		
		int finalPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length){
			if(leftPointer < left.length && rightPointer < right.length){
				if(left[leftPointer] < right[rightPointer]){
					combination[finalPointer] = left[leftPointer];
					leftPointer++;
					finalPointer++;
				} else {
					combination[finalPointer] = right[rightPointer];
					rightPointer++;
					finalPointer++;
				}
			} else if (leftPointer < left.length){
				while(leftPointer < left.length){
					combination[finalPointer] = left[leftPointer];
					leftPointer++;
					finalPointer++;
				}
			} else if (rightPointer < right.length){
				while(rightPointer < right.length){
					combination[finalPointer] = right[rightPointer];
					rightPointer++;
					finalPointer++;
				}
			}
		}

		return combination;
	}
}
