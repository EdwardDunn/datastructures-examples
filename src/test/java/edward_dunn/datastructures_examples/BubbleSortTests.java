package edward_dunn.datastructures_examples;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class BubbleSortTests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test_bubbleSort_UnsortedArray_ReturnSortedArray() {
		// arrange
		int[] numArray = { 9, 8, 5, 1, 2, 3 };
		int[] expectedResult = { 1, 2, 3, 5, 8, 9 };

		// act
		BubbleSort bs = new BubbleSort();
		int[] actualResult = bs.bubbleSort(numArray);

		// assert
		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	public void test_bubbleSort_SortedArray_ReturnSortedArray() {
		// arrange
		int[] numArray = { 1, 5, 9, 25, 100, 250 };
		int[] expectedResult = { 1, 5, 9, 25, 100, 250 };

		// act
		BubbleSort bs = new BubbleSort();
		int[] actualResult = bs.bubbleSort(numArray);

		// assert
		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	public void test_bubbleSort_UnsortedArrayWithNegatives_ReturnSortedArray() {
		// arrange
		int[] numArray = { -25, 250, 1, 4, 5, 77, -999, 3, 45 };
		int[] expectedResult = { -999, -25, 1, 3, 4, 5, 45, 77, 250 };

		// act
		BubbleSort bs = new BubbleSort();
		int[] actualResult = bs.bubbleSort(numArray);

		// assert
		assertArrayEquals(expectedResult, actualResult);
	}

}
