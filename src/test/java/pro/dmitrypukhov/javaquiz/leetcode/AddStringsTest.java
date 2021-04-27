package pro.dmitrypukhov.javaquiz.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest {

    /**
     * Example 1:
     * Input: num1 = "11", num2 = "123"
     * Output: "134"
     */
    @Test
    void addStrings_example1() {
        assertEquals("134", new AddStrings().addStrings("11", "123"));
    }

    /**
     * Example 2:
     * Input: num1 = "456", num2 = "77"
     * Output: "533"
     */
    @Test
    void addStrings_example2() {
        assertEquals("533", new AddStrings().addStrings("456", "77"));
    }
    /**
     * Example 3:
     * Input: num1 = "0", num2 = "0"
     * Output: "0"     */
    @Test
    void addStrings_example3() {
        assertEquals("0", new AddStrings().addStrings("0", "0"));
    }

    @Test
    void addStrings_1_9() {
        assertEquals("10", new AddStrings().addStrings("1", "9"));
   }
    @Test
    void addStrings_584_18() {
        assertEquals("602", new AddStrings().addStrings("584", "18"));
    }

}