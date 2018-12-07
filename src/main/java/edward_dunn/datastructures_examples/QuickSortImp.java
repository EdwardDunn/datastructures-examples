package edward_dunn.datastructures_examples;

public class QuickSortImp {
	
	private int array[];
	private int length;
	
	public void sort(int[] inputArray) {
		this.array = inputArray;
		length = inputArray.length;
		quickSort(0, length - 1);
	}
	
	public void quickSort(int lowIndex, int highIndex) {
		int i = lowIndex;
		int j = highIndex;
		
		// make pivot point the middle index
		int pivot = array[lowIndex+(highIndex-lowIndex)/2];
		
		// divide the array in two and iterate over each element
		while(i <= j) {
			
			// find value from left of pivot where are greater than pivot
			while(array[i] < pivot) {
				i++;
			}
			
			// find value from right of pivot which are less than pivot
			while(array[j] > pivot) {
				j--;
			}
				
			// swap values from each side of pivot if left value found is more than right value found
			if(i <= j) {
				swapNumbers(i, j);
				i++;
				j--;
			}
		}
	
		// recursively call quickSort
		if(lowIndex < j) {
			quickSort(lowIndex, j);
		}
		if(i < highIndex) {
			quickSort(i, highIndex);
		}
		
	}
	
	private void swapNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
