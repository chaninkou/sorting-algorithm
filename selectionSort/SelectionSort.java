package selectionSort;
/**
 * Note: https://www.youtube.com/watch?v=cqh8nQwuKNE
 * O(n^2) not stable, really bad, no matter if its almost sorted or not
 * O(1) space
 * O(n) swaps, but slow in general
 * 
 * tries to find the smallest min value every iteration
 * then, at the end, you swap the min value index to the current index of the outer loop
 */
public class SelectionSort {
	public int[] selectionSort(int[] list){
		int i, j, min, minIndex;
		int temp = 0;
		
		// Start from left to right
		for(i = 0; i < list.length; i++){
			// Keep track of current min and min index
			min = list[i];
			minIndex = i;
			
			// Always start from i + 1 cause we know everything from the left is already the smallest
			for(j = i + 1; j < list.length; j++){
				
				// Only update when there is an element smaller than min
				if(min > list[j]){
					min = list[j];
					minIndex = j;
				}
			}
			
			// This is why swaps for selection sort is only O(N), only swap once per iteration
			if(min != list[i]){
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		
		return list;
	}
}
