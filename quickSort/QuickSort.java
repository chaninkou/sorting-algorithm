package quickSort;

import java.util.Random;
/**
 * Note: https://www.youtube.com/watch?v=Fiot5yuwPAg
 * 
 * Average O(nlogn) when using a good pivot like randomly choosing pivot
 * Worst case is O(n^2) when choosing a bad pivot
 * O(logn) for space
 * Quicksort is recursive
 * Divide and conquer algorithm
 * Very good more large data sets
 * 
 *
 */
public class QuickSort {
	public void quickSort(int[] list){
		// Start out from the entire list
		quickSort(list, 0, list.length - 1);
	}
	
	private void quickSort(int[] list, int start, int end){
		if(start < end){
			int pivot = partition(list, start, end);
			
			quickSort(list, start, pivot - 1);
			
			quickSort(list, pivot + 1, end);
		}
	}
	
	// Move all numbers < pivot to left of pivot and all numbers > pivot
	// To right of pivot, return the pivot index
	private int partition(int[] list, int start, int end){
		// Get random pivot and swap it as the start
		swap(list, start, getPivot(start,end));
		
		// always the next element of the index
		int placeToSwap = start + 1;
		
		for(int current = placeToSwap; current <= end; current++){
			// Checking if pivot is bigger than current element
			if(list[current] < list[start]){
				
				// If placetoswap is not the same index of current, its probably bigger than pivot
				swap(list, current, placeToSwap);
				
				// Make sure to update
				placeToSwap++;
			}
		}
		
		// All the element on the left will be smaller than pivot
		swap(list, start, placeToSwap - 1);
		
		// return the pivot index
		return placeToSwap - 1;
	}

	
	// Simple swapping helper method
	private void swap(int[] list, int index1, int index2){

		int temp = list[index1];
		
		list[index1] = list[index2];
		
		list[index2] = temp;
	}
	
	
	// Getting a random pivot index between low and high inclusive
	private int getPivot(int low, int high){
		Random random = new Random();
		
		return random.nextInt((high - low) + 1) + low;
	}

}

