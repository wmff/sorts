package wmff.sorts;

import java.util.Arrays;
import java.util.Random;


public class MainSorts {
    private static final Random RND = new Random();
    private static final int OBJECT_SIZE = 5;

    public static void main(String[] args) {

        Object[] forQuickSortArray = initArray();
        System.out.println("QuickSort before: " + Arrays.toString(forQuickSortArray));

        QuickSort qs = new QuickSort();
        qs.sort(forQuickSortArray, (left, right) -> {
            if ((int) right < (int) left) {
                return 1;
            } else if ((int) right > (int) left) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("QuickSort after: " + Arrays.toString(forQuickSortArray));

        Object[] forSelectionSortArray = initArray();
        System.out.println("SelectionSort before: " + Arrays.toString(forSelectionSortArray));
        SelectionSort ss = new SelectionSort();
        ss.sort(forSelectionSortArray);
        System.out.println("SelectionSort after: " + Arrays.toString(forSelectionSortArray));

    }

    private static Object[] initArray() {
        Object[] array = new Object[OBJECT_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(100);
        }
        return array;
    }
}
