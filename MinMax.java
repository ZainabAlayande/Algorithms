package Algorithm.MinMaxAndIndex;

import java.util.Arrays;

public class MinMax {

    public static int getMaximum(int[] array) {
        int maximum = array[0];
        for (int arr: array) {
            if (arr > maximum)
                maximum = arr;
        }
        return maximum;
    }

    public static int getMinimum(int[] array) {
        int minimum = array[0];
        for (int arr: array) {
            if (arr < minimum)
                minimum = arr;
        }
        return minimum;
    }

    public static int getIndex(int[] array, int value) {
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] == value)
                return counter;
        }
        return -1;
    }
}
