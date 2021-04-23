package pro.dmitrypukhov.javaquiz.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * Given a string s, return the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        // Form set of characters
        Map<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            seen.put(c, seen.getOrDefault(s.charAt(i), 0) + 1);
        }
        // Find first char which is not in set
        for (int i = 0; i < s.length(); i++) {
            if (seen.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
