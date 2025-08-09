package medium;
/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";

        int maxVowel=0;
        int left=0;
        int vowel=0;

        for(int right=0;right<s.length();right++){

            if(vowels.indexOf(s.charAt(right)) != -1)
                vowel++;

            if((right-left+1) == k){
                maxVowel=Math.max(maxVowel,vowel);

                if(vowels.indexOf(s.charAt(left)) != -1)
                    vowel--;

                left++;
            }
        }
        return maxVowel;
    }
}
