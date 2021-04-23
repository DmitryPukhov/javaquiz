package pro.dmitrypukhov.javaquiz.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class FirstUniqueCharacterInAStringTest {

    /**
     * Example 1:
     * Input: s = "leetcode"
     * Output: 0
     */
    @Test
    void firstUniqChar_example1() {
        int out = new FirstUniqueCharacterInAString().firstUniqChar("leetcode");
        assertEquals(0, out);
    }

    /**
     * Example 2:
     * Input: s = "loveleetcode"
     * Output: 2
     */
    @Test
    void firstUniqChar_example2() {
        int out = new FirstUniqueCharacterInAString().firstUniqChar("loveleetcode");
        assertEquals(2, out);
    }

    /**
     * Example 3:
     * Input: s = "aabb"
     * Output: -1
     */
    @Test
    void firstUniqChar_example3() {
        int out = new FirstUniqueCharacterInAString().firstUniqChar("aabb");
        assertEquals(-1, out);
    }

    @Test
    void firstUniqChar_onechar() {
        int out = new FirstUniqueCharacterInAString().firstUniqChar("a");
        assertEquals(0, out);
    }

    @Test
    void firstUniqChar_nounique() {
        int out = new FirstUniqueCharacterInAString().firstUniqChar("aa");
        assertEquals(-1, out);
    }

}