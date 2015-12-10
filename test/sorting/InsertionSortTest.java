package sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * File Author Karan on 12/10/15.
 */
public class InsertionSortTest {

    private InsertionSort insertionSort;

    @Before
    public void setUp() throws Exception {
        int[] elements = new int[] {5, 2, 4, 6, 1, 3};
        insertionSort = new InsertionSort(elements);
    }

    @Test
    public void sortArray_insertionSort() {
        int[] expectedElements = new int[] {1, 2, 3, 4, 5, 6};
        int[] sourceElements = insertionSort.getElements();
        insertionSort.insertionSort(sourceElements);
        assertArrayEquals("Arrays", expectedElements, sourceElements);
    }
}
