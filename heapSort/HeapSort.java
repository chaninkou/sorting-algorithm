package heapSort;

import java.util.Arrays;

// O(nlogn) time all cases

public class HeapSort {
	private int capacity;
	
	private int size;
	
	private int[] items;
	
	
	public HeapSort(int[] nums){
		this.capacity = nums.length;
		this.size = nums.length;
		this.items = nums;
	}
	
	public void heapSort(){
		// Build a complete max heap
		buildMaxHeap();
		
		// Swapping from last element til first element
		for(int i = capacity - 1; i >= 0; i--){
			swap(0, i);
			
			// minus the size as in the elements in the back is already sorted
			size--;
			
			System.out.println("Extraction: " + Arrays.toString(items));
			
			heapifyDown(0);
		}
		
		System.out.println("Sorted Array: " + Arrays.toString(items));
	}
	
	// It's worst case is nlogn, but 2n average
	private void buildMaxHeap(){
		int mid = capacity / 2;

		for(int i = mid; i >= 0; i--){
			heapifyDown(i);
		}
		
		System.out.println("Build Max Heap: " + Arrays.toString(items));
	}
	
	// When we removed min, we replace the first element(min) with last element, need to make sure it is at the right place
	private void heapifyDown(int index){
		
		while(hasLeftChild(index)){
			// Lets default to left child is smallest right now
			int biggerChildIndex = getLeftChildIndex(index);
			
			// If right child is actually smaller, make it right child
			if(hasRightChild(index) && rightChild(index) > leftChild(index) ){
				biggerChildIndex = getRightChildIndex(index);
			}
			
			// If first element is already min, stop the loop
			if(items[index] > items[biggerChildIndex]){
				break;
			} else {
				swap(index, biggerChildIndex);
				
				index = biggerChildIndex;
			}
		}
	}
	
	private int getLeftChildIndex(int parentIndex){
		return parentIndex * 2 + 1;
	}
	
	private int getRightChildIndex(int parentIndex){
		return parentIndex * 2 + 2;
	}
	
	private int getParentIndex(int childIndex){
		return (childIndex - 1) / 2;
	}
	
	private boolean hasLeftChild(int index){
		return getLeftChildIndex(index) < size;
	}
	
	private boolean hasRightChild(int index){
		return getRightChildIndex(index) < size;
	}
	
	private boolean hasParent(int index){
		return getParentIndex(index) >= 0;
	}
	
	private int leftChild(int index){
		return items[getLeftChildIndex(index)];
	}
	private int rightChild(int index){
		return items[getRightChildIndex(index)];
	}
	private int parent(int index){
		return items[getParentIndex(index)];
	}
	
	private void swap(int a, int b){
		int temp = items[a];
		
		items[a] = items[b];
		
		items[b] = temp;
	}
}
