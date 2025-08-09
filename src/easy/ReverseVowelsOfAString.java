package easy;

import java.util.Arrays;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] letterArr = s.toCharArray();

        while(start < end) {
            while(start < end && vowels.indexOf(letterArr[start]) == -1) {
                start++;
            }

            while(start < end && vowels.indexOf(letterArr[end]) == -1) {
                end--;
            }

            char temp = letterArr[start];
            letterArr[start] = letterArr[end];
            letterArr[end] = temp;

            start++;
            end--;
        }

        return new String(letterArr);
    }

//    private String convertToString(char[] arr) {
//
//    }
}
