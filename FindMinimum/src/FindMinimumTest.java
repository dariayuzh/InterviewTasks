import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumTest {

    @Test
    public void findMinimumPositiveNumbers() {
        int minimum = FindMinimum.findMinimum(10, 558, 14);
        assertEquals(10, minimum);
    }

    @Test
    public void findMinimumNegativeNumbers() {
        int minimum = FindMinimum.findMinimum(-256, -8765, -36);
        assertEquals(-8765, minimum);
    }

    @Test
    public void findMinimumVariousNumbers() {
        int minimum = FindMinimum.findMinimum(0, 1509, -256);
        assertEquals(-256, minimum);
    }

    @Test
    public void findMinimumEqualNumbers() {
        int minimumFirst = FindMinimum.findMinimum(0, 0, -256);
        assertEquals(-256, minimumFirst);

        int minimumSecond = FindMinimum.findMinimum(20, 20, 20);
        assertEquals(20, minimumSecond);

    }

    @Test
    public void findMinimumMinValueNumbers() {
        int minimumFirst = FindMinimum.findMinimum(Integer.MIN_VALUE, 0, Integer.MIN_VALUE + 1);
        assertEquals(Integer.MIN_VALUE, minimumFirst);

    }

    @Test
    public void findMinimumMaxValueNumbers() {
        int minimumFirst = FindMinimum.findMinimum(Integer.MAX_VALUE, 0, Integer.MAX_VALUE - 1);
        assertEquals(0, minimumFirst);

    }

}