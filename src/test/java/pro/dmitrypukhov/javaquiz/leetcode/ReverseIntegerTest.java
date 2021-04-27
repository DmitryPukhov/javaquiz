package pro.dmitrypukhov.javaquiz.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    /**
     * Example 1:
     * <p>
     * Input: x = 123
     * Output: 321
     */
    @Test
    void reverse_example1() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    /**
     * Example 2:
     * <p>
     * Input: x = -123
     * Output: -321
     */
    @Test
    void reverse_example2() {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }

    /**
     * Example 3:
     * <p>
     * Input: x = 120
     * Output: 21
     */
    @Test
    void reverse_example3() {
        assertEquals(21, new ReverseInteger().reverse(120));
    }

    /**
     * Example 4:
     * <p>
     * Input: x = 0
     * Output: 0
     */
    @Test
    void reverse_example4() {
        assertEquals(0, new ReverseInteger().reverse(0));
    }

    @Test
    void reverse_1() {
        assertEquals(2, new ReverseInteger().reverse(2));
    }
    @Test
    void reverse_1534236469(){
        assertEquals(0, new ReverseInteger().reverse(1534236469));
    }

}