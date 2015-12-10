package sorting;

import java.util.Arrays;

/**
 * File Author Karan on 12/10/15.
 */
public class InsertionSort {
    private int[] elements;
    public InsertionSort(int[] elements) {
        this.elements = elements;
    }

    public void insertionSort(int[] elements) {
        /**
         *
         * @param array
         *
         * Peusocode: (Array index begins with 1)
         * INSERTION-SORT(A)
         *      1 for j = 2 to A.length
         *      2    key = A[j]
         *      3    //Insert A[j] into the sorted sequence A[1..j - 1].
         *      4    i = j - 1
         *      5    while i > 0 and A[i] > key
         *      6        A[i + 1] = A[i]
         *      7        i = i - 1
         *      8    A[i + 1] = key
         */
        int i;
        int key;
        for (int j = 1; j < elements.length; j++) {
            key = elements[j];
            // Insert unsortedArray[j] into the sorted sequence unsortedArray[1..j - 1]
            i = j - 1;
            while (i >= 0 && elements[i] > key) {
                elements[i + 1] = elements[i];
                i = i - 1;
            }
            elements[i + 1] = key;
        }
    }

    public int[] getElements() {
        return elements;
    }
}
