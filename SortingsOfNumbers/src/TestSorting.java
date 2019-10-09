import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.sortingofnumbers.utility.SortingUtility;



class TestSorting {

	@Test
	public void test() {
		assertArrayEquals(new int []{1,2,3,4,5,7}, new SortingUtility().bubbleSort(new int []{5,7,4,3,2,1}));
		assertArrayEquals(new int[]{1,2,3,4,5,7}, new SortingUtility().insertionSort(new int [] {5,7,4,3,2,1}));
	}

}