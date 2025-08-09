package easy;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))
            return true;

        char[] subseq = s.toCharArray();
        char[] stringToCheck = t.toCharArray();
        int lastPosition = -1;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < subseq.length; i++) {
            for(int j = 0; j < stringToCheck.length;j++) {
                if(subseq[i] == stringToCheck[j] && lastPosition < j){
                    result.append(subseq[i]);
                    lastPosition = j;
                    break;
                }
            }
        }

        return result.length() == subseq.length;
    }
}
