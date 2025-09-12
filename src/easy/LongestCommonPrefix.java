package easy;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";

        StringBuilder result = new StringBuilder();

        int minLen = Integer.MAX_VALUE;
        for(String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        for(int i = 0; i < minLen; i++) {
            char current = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != current){
                    return result.toString();
                }
            }

            result.append(current);
        }

        return result.toString();
    }
}
