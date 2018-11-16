package edward_dunn.datastructures_examples;

public class BubbleSort {

	public int[] bubbleSort(int[] numArray) {
		int n = numArray.length;
		int tempValue = 0;

		// loop n number of times (size of array)
		for (int i = 0; i < n; i++) {

			// loop over each of the elements left in the array to sort, at start n-i would
			// be 0
			for (int j = 1; j < (n - i); j++) {

				// if the previous element is more than the current, swap
				if (numArray[j - 1] > numArray[j]) {
					tempValue = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = tempValue;
				}

			}

		}
		
		return numArray;
	}

	public static void main(String[] args) {
		int numArray[] = { 1, 5, 1, -5, 9, 55, 77, -25, 100, 2000, 6 };
		System.out.println("Array Before Bubble Sort");

		//print current array structure
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i] + " ");
		}
		
		System.out.println();
		
		//sort array 
		BubbleSort bs = new BubbleSort();
		numArray = bs.bubbleSort(numArray);
		
		System.out.println("Array After Bubble Sort");

		//print sorted array elements
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i] + " ");
		}
	}
}
