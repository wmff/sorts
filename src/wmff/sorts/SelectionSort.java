package wmff.sorts;

class SelectionSort extends AbstractSort {

    void sort(Object[] array) {
        selectionSort(array, 0);
    }

    private void selectionSort(Object[] array, int i) {
        if (i < array.length - 1) {
            swap(array, i, findMin(array, i));
            selectionSort(array, i + 1);
        }
    }

    private int findMin(Object[] array, int index) {
        int min = index - 1;
        if (index < array.length - 1) {
            min = findMin(array, index + 1);
        }
        if ((int) array[index] < (int) array[min]) {
            min = index;
        }
        return min;
    }
}
