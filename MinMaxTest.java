package Algorithm.MinMaxAndIndex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void getMinimumValue_Test() {
        int[] array = {56, 45, 33, 85, 100, 200, 29, 99, 47};
        int minimumValue = MinMax.getMinimum(array);
        assertEquals(29, minimumValue);

    }

    @Test
    public void getMaximumValue_Test() {
        int[] array = {56, 45, 33, 85, 100, 200, 29, 99, 47};
        int maximumValue = MinMax.getMaximum(array);
        assertEquals(200, maximumValue);
    }

    @Test
    public void getIndexOfMinimumValue_Test() {
        int[] array = {56, 45, 33, 85, 100, 200, 29, 99, 47};
        int indexOfMinimumValue = MinMax.getIndex(array, MinMax.getMinimum(array));
        assertEquals(6, indexOfMinimumValue);
    }

    @Test
    public void getIndexOfMaximumValue_Test() {
        int[] array = {56, 45, 33, 85, 100, 200, 29, 99, 47};
        int indexOfMaximumValue = MinMax.getIndex(array, MinMax.getMaximum(array));
        assertEquals(5, indexOfMaximumValue);
    }

}