package quickSort;

import java.util.Random;

public class PracticeQuickSort {
	
	// This is the quickSort method, below are all the helper methods
	public void quickSort(int[] nums){
		// nums.length - 1 to get the exact index
		quickSort(nums, 0, nums.length - 1);
	}
	
	private void quickSort(int[] nums, int start, int end){
		// If end is negative, nothing will happen
		if(start < end){
			int pivot = partition(nums, start, end);
			
			quickSort(nums, start, pivot - 1);
			
			quickSort(nums, pivot + 1, end);
		}
		
	}

	private int partition(int[] nums, int start, int end){
		// Our random number pivot will get swap to the first element everytime
		// nums[start] is our pivot
		swap(nums, start, getRandomNumber(start, end));
		
		// A pointer to keep track of which index have all the smaller number on the left
		int placeToSwap = start + 1;
		
		for(int i = placeToSwap; i <= end; i++){
			// Everything that is smaller than pivot will need to be the left of pivot
			if(nums[i] < nums[start]){
				swap(nums, i, placeToSwap);
				
				// Update the pointer
				placeToSwap++;
			}
		}
		
		// Finally, make sure to swap the pivot to the correct location
		// placeToSwap - 1 because placeToSwap is not smaller than pivot due to placeToSwap++ in the loop
		swap(nums, start, placeToSwap - 1);
		
		return placeToSwap - 1;
	}

	// Helper method that swap two element
	private void swap(int[] nums, int left, int right){
		int temp = nums[left];
		
		nums[left] = nums[right];
		
		nums[right] = temp;
	}
	
	// Helper method that get random number within a certain range
	private int getRandomNumber(int min, int max){
		Random random = new Random();
		
		return random.nextInt(max - min + 1) + min;
	}
}
