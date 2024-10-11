import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void task1_1() {
        assertArrayEquals(null, Main.task1(new int[]{}));
    }
    @Test
    public void task1_2() {
        assertArrayEquals(new int[]{1}, Main.task1(new int[]{1}));
    }
    @Test
    public void task1_3() {
        assertArrayEquals(new int[]{-2, -3, 5, 6, 0}, Main.task1(new int[]{5, -2, 6, -3, 0}));
    }
    @Test
    public void task1_4() {
        assertArrayEquals(new int[]{-4, -6, -8, 0}, Main.task1(new int[]{-4, -6, -8, 0}));
    }

    @Test
    public void task6_1() {
        assertEquals(Integer.MAX_VALUE, Main.task6(new int[]{}));
    }
    @Test
    public void task6_2() {
        assertEquals(1, Main.task6(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    public void task6_3() {
        assertEquals(-10, Main.task6(new int[]{-6, 2, -10, 4, 5}));
    }
    @Test
    public void task6_4() {
        assertEquals(-9, Main.task6(new int[]{1, -9, 0, -9, 5}));
    }

    @Test
    public void task11_1() {
        assertArrayEquals(null, Main.task11(new int[]{}, 1, 3));
    }
    @Test
    public void task11_2() {
        assertArrayEquals(new int[]{0, 8, -1, 7}, Main.task11(new int[]{5, 0, 4, 8, -1, 7, 3}, 1, 5));
    }
    @Test
    public void task11_3() {
        assertArrayEquals(null, Main.task11(new int[]{2, 3, 1}, 1, 3));
    }

    @Test
    public void task16_1() {
        assertEquals(null, Main.task16(new int[]{1, 2, 4}, new int[]{1, 4, 2}));
    }
    @Test
    public void task16_2() {
        assertEquals(new HashSet<>(Arrays.asList(1, 4, 5, 6)), Main.task16(new int[]{1, 2, 4}, new int[]{2, 5, 6}));
    }
    @Test
    public void task16_3() {
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)), Main.task16(new int[]{1, 2, 4}, new int[]{3, 5, 6}));
    }
    @Test
    public void task16_4() {
        assertEquals(new HashSet<>(List.of(1)), Main.task16(new int[]{1, 2, 4}, new int[]{2, 4}));
    }

    @Test
    public void task21_1() {
        assertFalse(Main.task21(new int[]{1}, new int[]{3, 5, 9, 18}));
    }
    @Test
    public void task21_2() {
        assertFalse(Main.task21(new int[]{1, 2, 4, 8}, new int[]{3}));
    }
    @Test
    public void task21_3() {
        assertFalse(Main.task21(new int[]{1, 2, 4, 8}, new int[]{3, 5, 9, 18}));
    }
    @Test
    public void task21_4() {
        assertTrue(Main.task21(new int[]{1, 2, 4, 8}, new int[]{3, 5, 9, 17}));
    }
    @Test
    public void task21_5() {
        assertTrue(Main.task21(new int[]{1, 2, 4, 8}, new int[]{2, 4, 8, 16}));
    }
}