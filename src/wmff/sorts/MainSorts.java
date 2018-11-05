package wmff.sorts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class MainSorts {
    private static final Random RND = new Random();
    private static final int OBJECT_SIZE = 10;
    private static Object[] array;

    public static void main(String[] args) {
        initArray();
        System.out.println("before: " + Arrays.toString(array));

        QuickSort qs = new QuickSort();
        qs.sort(array, new Comparator() {
            @Override
            public int compare(Object left, Object right) {
                if ((int) right < (int) left) {
                    return 1;
                } else if ((int) right > (int) left) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("after: " + Arrays.toString(array));
    }

    private static void initArray() {
        array = new Object[OBJECT_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(100);
        }
    }
}
