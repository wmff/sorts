package wmff.sorts;

import java.util.Comparator;
import java.util.Random;

public class QuickSort {
    public static final Random RND = new Random();

    public void sort(Object[] array, Comparator comparator) {
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

    private void swap(Object[] array, int index, int end) {
        Object tmp = array[index];
        array[index] = array[end];
        array[end] = tmp;
    }
}
