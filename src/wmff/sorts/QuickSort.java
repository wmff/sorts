package wmff.sorts;

import java.util.Comparator;
import java.util.Random;

class QuickSort extends AbstractSort {
    private static final Random RND = new Random();

    void sort(Object[] array, Comparator comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }

    private void quickSort(Object[] array, int begin, int end, Comparator comparator) {
        if (end > begin) {
            int index = partition(array, begin, end, comparator);
            quickSort(array, begin, index - 1, comparator);
            quickSort(array, index + 1, end, comparator);
        }
    }

    private int partition(Object[] array, int begin, int end, Comparator comparator) {
        int index = begin + RND.nextInt(end - begin + 1);
        Object pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (comparator.compare(array[i], pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return index;
    }
}
