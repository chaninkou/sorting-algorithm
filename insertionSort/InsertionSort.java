package insertionSort;
/**
 * How it goes: https://www.youtube.com/watch?v=lCDZ0IprFw4
 * 
 * Insertion sort is O(n^2) worst case time
 * Best case is O(n) when problem is nearly sorted or the problem size is small
 *
 * O(1) space since shift items into place
 *
 */
public class InsertionSort {

	public int[] insertionSort(int[] list){
		// i will keep increasing, j will be the index to swap
		int i, j, key, temp;
		
		// Starts from 1 since index 0 element is the biggest for current index
		for(i = 1; i < list.length; i++){
			
			// Keep track of the current element we are using to compare
			key = list[i];
			
			// j is always the previous index of i
			j = i - 1;
			
			// Making sure j is not negative index, and checking if key is list[j] is bigger than key
			while(j >= 0 && key < list[j]){
				temp = list[j];
				
				// Since we know we just swapping the elements next to each other
				list[j] = list[j + 1];
				list[j + 1] = temp;
				
				j--;
			}
		}
		
		return list;	
	}
}
